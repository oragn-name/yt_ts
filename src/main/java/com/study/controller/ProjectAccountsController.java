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
import com.study.model.Dictionarydata;
import com.study.model.ProjectAccounts;
import com.study.model.User;
import com.study.service.DictdataService;
import com.study.service.ProjectAccountsService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value = "ProjectAccountsController", description = "财务结算操作API")
@RestController
public class ProjectAccountsController {

  @Autowired
  private ProjectAccountsService projectAccountsService;
  @Autowired
  private DictdataService dictdataService;
  
  @RequestMapping(value="/accounts/getData",method={RequestMethod.GET})
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,@RequestParam(value="proId",required=true)Integer proId){
    ProjectAccounts projectAccounts=new ProjectAccounts();
    projectAccounts.setProId(proId);
    List<ProjectAccounts> selectSafetyByAll = projectAccountsService.selectAccountsByAll(projectAccounts, bean);
    for (ProjectAccounts projectAccounts2 : selectSafetyByAll) {
      String proConsts="";
      if(projectAccounts2.getProConstName()!=null&&!"".equals(projectAccounts2.getProConstName())){
        String[] proConst=projectAccounts2.getProConstName().split(",");
        for (String string : proConst) {
          Dictionarydata selectByKeyq = dictdataService.selectByKey(Integer.parseInt(string));
          if(selectByKeyq!=null){
            proConsts+=selectByKeyq.getDictdataName()+",";
          }
        }
      }
      if(proConsts.length()>0){
        proConsts=proConsts.substring(0, proConsts.length()-1);
      }
      projectAccounts2.setProConstName(proConsts);
    }
    PageInfo<ProjectAccounts> info=new PageInfo<ProjectAccounts>(selectSafetyByAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  @RequestMapping(value = "/accounts/add",method={RequestMethod.POST})
  public String add(@ModelAttribute ProjectAccounts projectAccounts) {
  try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    projectAccounts.setAccountsCreateUser(user.getId());
    projectAccounts.setAccountsCreateTime(sdf.format(new Date()));
    projectAccountsService.save(projectAccounts);
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
}
  @RequestMapping(value = "/accounts/edit",method={RequestMethod.POST})
  public String edit(@ModelAttribute ProjectAccounts projectAccounts) {
  try {
    projectAccountsService.updateNotNull(projectAccounts);
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
}
  @RequestMapping(value = "/accounts/delete",method={RequestMethod.DELETE})
  public String delete(@RequestParam(value="ids",required=true)String ids){
  try {
    if (ids != null) {
      String[] id = ids.split(",");
      for (String string : id) {
        projectAccountsService.delete(Integer.parseInt(string));
      }
    }
    return "success";
  } catch (Exception e) {
    e.printStackTrace();
          return "fail";
  }
  }
}
