package com.study.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.Api;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.model.ProjectPicture;
import com.study.model.ProjectRoadWork;
import com.study.model.User;
import com.study.service.ProjectPictureService;
import com.study.service.ProjectRoadWorkService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value = "ProjectPictureController", description = "转竣图操作API")
@RestController
public class ProjectPictureController {

  @Autowired
  private ProjectPictureService projectPictureService;
  @Autowired
  private ProjectRoadWorkService roadWorkService;
  @RequestMapping(value="/pictures/getData",method={RequestMethod.GET})
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,@RequestParam(value="proId",required=true)Integer proId){
    ProjectPicture projectPicture=new ProjectPicture();
    projectPicture.setProId(proId);
    List<ProjectPicture> selectPictureByAll = projectPictureService.selectPictureByAll(projectPicture, bean);
    if(selectPictureByAll!=null&&selectPictureByAll.size()>0){
      for (ProjectPicture projectPicture2 : selectPictureByAll) {
        ProjectRoadWork projectRoadWork=new ProjectRoadWork();
        projectRoadWork.setProId(projectPicture2.getProId());
        List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(projectRoadWork, null);
        if(projectRoadWorkAll!=null&&projectRoadWorkAll.size()>0){
          projectRoadWork=projectRoadWorkAll.get(0);
        }
        projectPicture2.setPrwSwitchingDate(projectRoadWork.getPrwSwitchingDate());
      }
    }
    PageInfo<ProjectPicture> info=new PageInfo<ProjectPicture>(selectPictureByAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  
  @RequestMapping(value = "/pictures/add",method={RequestMethod.POST})
  public String add(@ModelAttribute ProjectPicture projectPicture) {
  try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    projectPicture.setPictureCreateUser(user.getId());
    projectPicture.setPictureCreateTime(sdf.format(new Date()));
    projectPictureService.save(projectPicture);
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
}
  @RequestMapping(value = "/pictures/edit",method={RequestMethod.POST})
  public String edit(@ModelAttribute ProjectPicture projectPicture) {
  try {
    projectPictureService.updateNotNull(projectPicture);
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
}
  @RequestMapping(value = "/pictures/delete",method={RequestMethod.DELETE})
  public String delete(@RequestParam(value="ids",required=true)String ids){
  try {
    if (ids != null) {
      String[] id = ids.split(",");
      for (String string : id) {
        projectPictureService.delete(Integer.parseInt(string));
      }
    }
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
  }
}
