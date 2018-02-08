package com.study.controller.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.model.Dept;
import com.study.service.DeptService;
import com.study.service.impl.DeptServiceImpl;
import com.study.util.bean.MenuBean;

@Api(value="DeptViewController",description="部门页面展示")
@Controller
public class DeptViewController {

  @Autowired
  private DeptServiceImpl deptService;
  
  @ApiOperation(value="跳转添加、修改",notes="跳转添加、修改")
  @ApiImplicitParams({
    @ApiImplicitParam(name="id",value="部门id",required=false,dataType="int",paramType="query"),
    @ApiImplicitParam(name="menuName",value="当前tab名称",required=false,dataType="string",paramType="query"),
    @ApiImplicitParam(name="parentMenuName",value="父页面tab名称",required=false,dataType="string",paramType="query")
  })
  @RequestMapping(value="/dept/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="id",required=false) Integer id,@ModelAttribute MenuBean bean){
    List<Dept> selectAllDept = deptService.selectAllDept(null, null);
    request.setAttribute("depts", selectAllDept);
    request.setAttribute("menu", bean);
    if(id!=null){
      Dept dept = deptService.selectByKey(id);
      request.setAttribute("dept", dept);
      return "depts/depts_edit";
    }else{
      return "depts/depts_add";
    }
  }
  
}
