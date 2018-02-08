package com.study.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.model.ProjectProduce;
import com.study.service.ProjectProduceService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value="ProjectProduceController",description="生产科项目立项操作API")
@RestController
public class ProjectProduceController {

  @Autowired
  private ProjectProduceService projectProduceService;
  
  @ApiOperation(value="获取生产科的所有数据",notes="获取所有的生产科数据，返回grid")
  @RequestMapping(value="/produces/getData",method={RequestMethod.GET})
  public DataGridResultInfo getData(@ModelAttribute PageBean bean){
    List<ProjectProduce> projectProduceAll = projectProduceService.getProjectProduceAll(null, bean);
    PageInfo<ProjectProduce> info=new PageInfo<ProjectProduce>(projectProduceAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }
  
  
  
  
}
