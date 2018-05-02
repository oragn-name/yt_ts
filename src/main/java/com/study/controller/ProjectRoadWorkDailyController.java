package com.study.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.Api;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.model.Dept;
import com.study.model.ProjectRoadWordDetail;
import com.study.model.ProjectRoadWorkDaily;
import com.study.model.User;
import com.study.model.vo.ProjectItemConstruction;
import com.study.service.ProjectRoadWordDetailService;
import com.study.service.ProjectRoadWorkDailyService;
import com.study.service.impl.DeptServiceImpl;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value = "ProjectRoadWorkDailyController", description = "每日工作量操作API")
@RestController
public class ProjectRoadWorkDailyController {

  @Autowired
  private ProjectRoadWorkDailyService roadWorkDailyService;
  @Autowired
  private ProjectRoadWordDetailService projectRoadWordDetailService;
  @Autowired
  private DeptServiceImpl deptService;

  @RequestMapping(value = "/workdailys/getItemData", method = { RequestMethod.GET })
  public DataGridResultInfo getItemData(@ModelAttribute PageBean bean,String proName,ProjectItemConstruction construction){
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    Dept selectByKey = deptService.selectByKey(user.getDeptId());
    /*ProjectItemConstruction construction=new ProjectItemConstruction();*/
    if(!selectByKey.getCode().toUpperCase().equals("SCK")){
      construction.setPcDept(selectByKey.getId());
    }
    /*construction.setProName(proName);*/
    List<ProjectItemConstruction> selectProjectItemConstruction = roadWorkDailyService.selectProjectItemConstruction(construction, bean);
    PageInfo<ProjectItemConstruction> info=new PageInfo<ProjectItemConstruction>(selectProjectItemConstruction);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  
  @RequestMapping(value = "/workdailys/getDataTree", method = { RequestMethod.GET })
  public List<ProjectRoadWordDetail> getDataTree(Integer pcId,String createTime) {
    ProjectRoadWordDetail detail=new ProjectRoadWordDetail();
    detail.setPcId(pcId);
    detail.setCreateTime(createTime.substring(0, 10));
    List<ProjectRoadWordDetail> detailByAll = projectRoadWordDetailService.getDetailByAll(detail, null);
    return detailByAll;
  }

  @RequestMapping(value = "/workdailys/getData", method = { RequestMethod.GET })
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,
      @RequestParam(value = "pcId", required = true) Integer pcId) {
    ProjectRoadWordDetail detail=new ProjectRoadWordDetail();
    detail.setPcId(pcId);
    List<ProjectRoadWordDetail> detailByAll = projectRoadWordDetailService.getDetailByAll(detail, bean);
    PageInfo<ProjectRoadWordDetail> info = new PageInfo<ProjectRoadWordDetail>(
        detailByAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }

  @RequestMapping(value = "/workdailys/add", method = { RequestMethod.POST })
  public String add(String detail) {
    try {
      
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Session session = SecurityUtils.getSubject().getSession();
       User user =(User)session.getAttribute("userSession");
       String time=sdf.format(new Date());
       if(detail!=null){
         JSONArray fromObject = JSONArray.fromObject(detail);
         for (int i = 0; i < fromObject.length(); i++) {  
           JSONObject jsonObject2 = fromObject.getJSONObject(i);
           ProjectRoadWordDetail daily= (ProjectRoadWordDetail) JSONObject.toBean(jsonObject2,ProjectRoadWordDetail.class);
           if(daily!=null){
             daily.setCreateTime(time);
             daily.setCreateUser(user.getId());
             projectRoadWordDetailService.save(daily);
           }
         }
       }
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/workdailys/edit", method = { RequestMethod.POST })
  public String edit(String detail) {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Session session = SecurityUtils.getSubject().getSession();
      User user =(User)session.getAttribute("userSession");
      String time=sdf.format(new Date());
      if(detail!=null){
        JSONArray fromObject = JSONArray.fromObject(detail);
        for (int i = 0; i < fromObject.length(); i++) {  
          JSONObject jsonObject2 = fromObject.getJSONObject(i);
          ProjectRoadWordDetail daily= (ProjectRoadWordDetail) JSONObject.toBean(jsonObject2,ProjectRoadWordDetail.class);
          if(daily!=null){
            if(daily.getId()!=null){
              projectRoadWordDetailService.updateNotNull(daily);
              }else{
                daily.setCreateTime(time);
                daily.setCreateUser(user.getId());
                projectRoadWordDetailService.save(daily);
              }
            }
          }
        }
      
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/workdailys/delete", method = { RequestMethod.DELETE })
  public String delete(@RequestParam(value = "ids", required = true) String ids) {
    try {
      if (ids != null) {
        String[] id = ids.split(",");
        for (String string : id) {
          projectRoadWordDetailService.delete(Integer.parseInt(string));
        }
      }
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

}
