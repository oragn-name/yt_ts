package com.study.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.model.ProjectConstruction;
import com.study.model.ProjectContract;
import com.study.model.ProjectPackage;
import com.study.model.User;
import com.study.service.ProjectPackageService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@RestController
public class ProjectPackageController {

  @Autowired
  private ProjectPackageService projectPackageService;
  @RequestMapping(value="/packages/getData",method={RequestMethod.GET})
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,Integer pcId){
    Map<String, Object> map=new HashMap<String, Object>();
    map.put("pcId", pcId);
    List<ProjectPackage> selectContractByAll = projectPackageService.selectByAll(map, bean);
    PageInfo<ProjectPackage> info=new PageInfo<ProjectPackage>(selectContractByAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  
  
  @RequestMapping(value = "/packages/add", method = { RequestMethod.POST })
  public String add(@ModelAttribute ProjectPackage projectPackage) {
    try {
      projectPackageService.save(projectPackage);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/packages/edit", method = { RequestMethod.POST })
  public String edit(@ModelAttribute ProjectPackage projectPackage) {
    try {
      projectPackageService.updateAll(projectPackage);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/packages/delete", method = { RequestMethod.DELETE })
  public String delete(@RequestParam(value = "ids", required = true) String ids) {
    try {
      if (ids != null) {
        String[] id = ids.split(",");
        for (String string : id) {
          projectPackageService.delete(Integer.parseInt(string));
        }
      }
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }
  
  
  
  
  
}
