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
import com.study.model.ProjectSatety;
import com.study.model.User;
import com.study.service.ProjectSatetyService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;


@Api(value = "ProjectSatetyController", description = "安全科操作API")
@RestController
public class ProjectSatetyController {

  @Autowired
  private ProjectSatetyService projectSatetyService;
  
  @RequestMapping(value="/satetys/getData",method={RequestMethod.GET})
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,@RequestParam(value="proId",required=true)Integer proId){
    ProjectSatety projectSatety=new ProjectSatety();
    projectSatety.setProId(proId);
    List<ProjectSatety> selectSafetyByAll = projectSatetyService.selectSafetyByAll(projectSatety, bean);
    PageInfo<ProjectSatety> info=new PageInfo<ProjectSatety>(selectSafetyByAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  
  @RequestMapping(value = "/satetys/add",method={RequestMethod.POST})
  public String add(@ModelAttribute ProjectSatety projectSatety) {
  try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    projectSatety.setSafetyUser(user.getId());
    projectSatety.setSafetyUserTime(sdf.format(new Date()));
    projectSatetyService.save(projectSatety);
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
}
  @RequestMapping(value = "/satetys/edit",method={RequestMethod.POST})
  public String edit(@ModelAttribute ProjectSatety projectSatety) {
  try {
    projectSatetyService.updateNotNull(projectSatety);
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
}
  @RequestMapping(value = "/satetys/delete",method={RequestMethod.DELETE})
  public String delete(@RequestParam(value="ids",required=true)String ids){
  try {
    if (ids != null) {
      String[] id = ids.split(",");
      for (String string : id) {
        projectSatetyService.delete(Integer.parseInt(string));
      }
    }
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
  }
}
