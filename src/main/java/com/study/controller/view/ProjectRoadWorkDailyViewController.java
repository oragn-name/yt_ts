package com.study.controller.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.model.ProjectRoadWorkDaily;
import com.study.service.ProjectRoadWorkDailyService;
import com.study.util.bean.MenuBean;
@Api(value="ProjectRoadWorkDailyViewController",description="每日工作量页面跳转")
@Controller
public class ProjectRoadWorkDailyViewController {
  @Autowired
  private ProjectRoadWorkDailyService roadWorkDailyService;
  
  @RequestMapping(value="/workdailys/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="id",required=false)Integer id,@ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
    request.setAttribute("menu", bean);
    if(id!=null){
      ProjectRoadWorkDaily selectByKey = roadWorkDailyService.selectByKey(id);
      request.setAttribute("daily", selectByKey);
      return "workdailys/workdailys_edit";
    }else{
      request.setAttribute("proId", proId);
      return "workdailys/workdailys_add";
    }
  }
  
}
