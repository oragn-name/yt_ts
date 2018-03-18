package com.study.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

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
import com.study.model.ProjectProduce;
import com.study.model.User;
import com.study.service.DictdataService;
import com.study.service.ProjectProduceService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value="ProjectProduceController",description="生产科项目立项操作API")
@RestController
public class ProjectProduceController {
  @Autowired
  private DictdataService dictdataService;
  @Autowired
  private ProjectProduceService projectProduceService;
  
  @ApiOperation(value="获取生产科的所有数据",notes="获取所有的生产科数据，返回grid")
  @RequestMapping(value="/produces/getData",method={RequestMethod.GET})
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,@RequestParam(value="proName",required=false)String proName,String proContractNumber){
    ProjectProduce produce=new ProjectProduce();
    produce.setProName(proName);
    produce.setProContractNumber(proContractNumber);
    List<ProjectProduce> projectProduceAll = projectProduceService.getProjectProduceAll(produce, bean);
    for (ProjectProduce projectProduce : projectProduceAll) {
      String proConsts="";
      if(projectProduce.getProConst()!=null&&!"".equals(projectProduce.getProConst())){
        String[] proConst=projectProduce.getProConst().split(",");
        for (String string : proConst) {
          Dictionarydata selectByKey = dictdataService.selectByKey(Integer.parseInt(string));
          if(selectByKey!=null){
            proConsts+=selectByKey.getDictdataName()+",";
          }
        }
      }
      if(proConsts.length()>0){
        proConsts=proConsts.substring(0, proConsts.length()-1);
      }
      projectProduce.setProConst(proConsts);
    }
    PageInfo<ProjectProduce> info=new PageInfo<ProjectProduce>(projectProduceAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  
  @ApiOperation(value="添加保存",notes="添加保存API")
  @RequestMapping(value="/produces/add",method=RequestMethod.POST)
  public String add(@ModelAttribute ProjectProduce projectProduce){
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      Session session = SecurityUtils.getSubject().getSession();
      User user = (User)session.getAttribute("userSession");
      projectProduce.setCreateUser(user.getId());
      projectProduce.setCreateTime(sdf.format(new Date()));
      projectProduceService.save(projectProduce);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }
  @ApiOperation(value="修改保存",notes="修改保存API")
  @RequestMapping(value="/produces/edit",method=RequestMethod.POST)
  public String edit(@ModelAttribute ProjectProduce projectProduce){
    try {
      projectProduceService.updateAll(projectProduce);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }
  @ApiOperation(value="项目数据", notes="删除项目数据API")
  @ApiImplicitParams({
    @ApiImplicitParam(name = "ids", value = "数据id", required = true ,dataType = "string" ,paramType = "query")
  })
  @RequestMapping(value = "/produces/delete",method={RequestMethod.DELETE})
  public String delete(@RequestParam(value="ids") String ids){
      try{
         if(ids!=null){
           String[] idsArry=ids.split(",");
           for (String id : idsArry) {
             projectProduceService.delete(Integer.parseInt(id));
          }
         }
          return "success";
      }catch (Exception e){
          e.printStackTrace();
          return "fail";
      }
  }
}
