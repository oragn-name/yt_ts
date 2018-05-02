package com.study.controller.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import com.study.model.Dept;
import com.study.model.Dictionarydata;
import com.study.model.Resources;
import com.study.model.User;
import com.study.service.DictdataService;
import com.study.service.ResourcesService;
import com.study.service.impl.DeptServiceImpl;

@Api(value="BaseController",description="所有菜单首页页面")
@Controller
public class BaseController {
  @Resource
  private ResourcesService resourcesService;
  @Autowired
  private DictdataService dictdataService;
  @Autowired
  private DeptServiceImpl deptService;
  
  @ApiOperation(value="page_index页面",notes="所有菜单的首页")
  @ApiImplicitParams({
    @ApiImplicitParam(name="path",value="url地址",required=false,dataType="string",paramType="path"),
    @ApiImplicitParam(name="menuName",value="菜单名称",required=false,dataType="string",paramType="path")
  })
  @RequestMapping(value="/page/{path}/{menuName}/{id}",method={RequestMethod.GET})
  public String page(@PathVariable String path,@PathVariable String menuName,@PathVariable Integer id,HttpServletRequest request){
    Example example=new Example(Resources.class);
    Criteria createCriteria = example.createCriteria();
    createCriteria.andEqualTo("type", 2);
    createCriteria.andEqualTo("parentid", id);
    List<Resources> buttons = resourcesService.selectByExample(example);
    User user = (User)request.getSession().getAttribute("userSession");
    Map<String, Object> map=new HashMap<String, Object>();
    map.put("userid", user.getId());
    map.put("type", 2);
    List<Resources> loadUserResources = resourcesService.loadUserResources(map);
    List<Resources> list=new ArrayList<Resources>();    
    if(loadUserResources!=null&&loadUserResources.size()>0&&buttons!=null&&buttons.size()>0){
        for (Resources resources1 : buttons) {
          oht:
          for (Resources resources : loadUserResources) {
          if(resources.getId()==resources1.getId()){
            list.add(resources1);
            break oht;
          }
        }
      }
    }
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
    Dept dept=new Dept();
    dept.setParentCode("SGDW");
    List<Dept>  selectAllDept= deptService.selectAllDept(dept, null);
    request.setAttribute("dicts", dicts);
    request.setAttribute("depts", selectAllDept);
    request.setAttribute("buttons", list);
    request.setAttribute("menuName", menuName);
    return path+"/"+path;
  }
}
