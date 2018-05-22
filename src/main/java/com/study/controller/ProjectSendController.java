package com.study.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.model.ProjectContractSend;
import com.study.model.ProjectPackage;
import com.study.model.vo.ContractProject;
import com.study.service.ProjectContractSendService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@RestController
public class ProjectSendController{
  @Autowired
  private ProjectContractSendService projectContractSendService;
  
  @RequestMapping(value="/sends/getData",method={RequestMethod.GET})
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,Integer proId){
    Map<String, Object> map=new HashMap<String, Object>();
    map.put("proId", proId);
    List<ProjectContractSend> selectByAll = projectContractSendService.selectByAll(map, bean);
    PageInfo<ProjectContractSend> info=new PageInfo<ProjectContractSend>(selectByAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  
  @RequestMapping(value="/sends/getDataPro",method={RequestMethod.GET})
  public DataGridResultInfo getDataPro(@ModelAttribute PageBean bean,String contractNumber){
	  Map<String, Object> map=new HashMap<String, Object>();
	  map.put("contractNumber", contractNumber);
	  List<ContractProject> selectByAllProject = projectContractSendService.selectByAllProject(map, bean);
	  PageInfo<ContractProject> info=new PageInfo<ContractProject>(selectByAllProject);
	  return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  
  @RequestMapping(value = "/sends/add", method = { RequestMethod.POST })
  public String add(@ModelAttribute ProjectContractSend projectContractSend) {
    try {
      projectContractSendService.save(projectContractSend);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/sends/edit", method = { RequestMethod.POST })
  public String edit(@ModelAttribute ProjectContractSend projectContractSend) {
    try {
      projectContractSendService.updateAll(projectContractSend);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/sends/delete", method = { RequestMethod.DELETE })
  public String delete(@RequestParam(value = "ids", required = true) String ids) {
    try {
      if (ids != null) {
        String[] id = ids.split(",");
        for (String string : id) {
          projectContractSendService.delete(Integer.parseInt(string));
        }
      }
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }
  
  
  
}
