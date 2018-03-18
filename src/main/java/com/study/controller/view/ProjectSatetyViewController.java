package com.study.controller.view;


import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.model.ProjectSatety;
import com.study.service.ProjectSatetyService;
import com.study.util.bean.MenuBean;

@Api(value="ProjectSatetyViewController",description="安保科页面跳转")
@Controller
public class ProjectSatetyViewController {
  @Autowired
  private ProjectSatetyService projectSatetyService;
  
  @RequestMapping(value="satetys/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="safetyId",required=false) Integer safetyId, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
    request.setAttribute("menu", bean);
    if (safetyId != null) {
      ProjectSatety projectSatety = projectSatetyService.selectByKey(safetyId);
      request.setAttribute("satety", projectSatety);
      return "satetys/satetys_edit";
    } else {
      request.setAttribute("proId", proId);
      return "satetys/satetys_add";
    }
    
  }
}
