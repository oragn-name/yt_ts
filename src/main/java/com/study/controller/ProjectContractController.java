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
import com.study.model.ProjectContract;
import com.study.model.ProjectProduce;
import com.study.model.User;
import com.study.service.ProjectContractService;
import com.study.service.ProjectProduceService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value = "ProjectContractController", description = "合同操作API")
@RestController
public class ProjectContractController {

  @Autowired
  private ProjectContractService projectContractService;
  @Autowired
  private ProjectProduceService projectProduceService;
  
  @RequestMapping(value="/contracts/getData",method={RequestMethod.GET})
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,String contractNumber){
    ProjectContract projectContract=new ProjectContract();
    projectContract.setContractNumber(contractNumber);
    List<ProjectContract> selectContractByAll = projectContractService.selectContractByAll(projectContract, bean);
    PageInfo<ProjectContract> info=new PageInfo<ProjectContract>(selectContractByAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  @RequestMapping(value = "/contracts/add",method={RequestMethod.POST})
  public String add(@ModelAttribute ProjectContract projectContract,String proIds) {
  try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    projectContract.setContractCreateUser(user.getId());
    projectContract.setContractCreateTime(sdf.format(new Date()));
    projectContractService.save(projectContract);
    String[] proId=proIds.split(",");
    for (String string : proId) {
      ProjectProduce selectByKey = projectProduceService.selectByKey(Integer.parseInt(string));
      selectByKey.setProContractNumber(projectContract.getContractNumber());
      projectProduceService.updateNotNull(selectByKey);
    }
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
}
  @RequestMapping(value = "/contracts/edit",method={RequestMethod.POST})
  public String edit(@ModelAttribute ProjectContract projectContract) {
  try {
    projectContractService.updateNotNull(projectContract);
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
}
  @RequestMapping(value = "/contracts/delete",method={RequestMethod.DELETE})
  public String delete(@RequestParam(value="ids",required=true)String ids){
  try {
    if (ids != null) {
      String[] id = ids.split(",");
      for (String string : id) {
        ProjectContract selectByKey = projectContractService.selectByKey(Integer.parseInt(string));
        ProjectProduce produce=new ProjectProduce();
        produce.setProContractNumber(selectByKey.getContractNumber());
        projectContractService.delete(Integer.parseInt(string));
        List<ProjectProduce> projectProduceAll = projectProduceService.getProjectProduceAll(produce, null);
        for (ProjectProduce projectProduce : projectProduceAll) {
          projectProduce.setProContractNumber(null);
          projectProduceService.updateAll(projectProduce);
        }
      }
    }
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
  }
  
}
