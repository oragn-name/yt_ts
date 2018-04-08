package com.study.controller.view;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.model.Dept;
import com.study.model.Dictionarydata;
import com.study.model.ProjectConstruction;
import com.study.model.ProjectProduce;
import com.study.model.ProjectRoadWork;
import com.study.service.DictdataService;
import com.study.service.ProjectConstructionService;
import com.study.service.ProjectProduceService;
import com.study.service.ProjectRoadWorkService;
import com.study.service.impl.DeptServiceImpl;
import com.study.util.bean.MenuBean;



@Api(value="ProjectConstructionViewController",description="施工单位页面跳转")
@Controller
public class ProjectConstructionViewController {
  @Autowired
  private ProjectConstructionService projectConstructionService;
  @Autowired
  private ProjectProduceService projectProduceService;
  @Autowired
  private DictdataService dictdataService;
  @Autowired
  private DeptServiceImpl deptService;
  @Autowired
  private ProjectRoadWorkService roadWorkService;
  
  
  @RequestMapping(value="constructions/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="id",required=false) Integer id, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
     request.setAttribute("menu", bean);
     ProjectProduce pro = projectProduceService.selectByKey(proId);
     List<Dept> deptList=new ArrayList<Dept>();
     String proConst = pro.getProConst();//施工单位
     if(proConst!=null&&!"".equals(proConst)){
       String[] str=proConst.split(",");
       for (String string : str) {
         Dept dept = deptService.selectByKey(Integer.parseInt(string));
         if(dept!=null){
           deptList.add(dept);
         }
      }
     }
     request.setAttribute("dtd", deptList);
    if (id != null) {
      ProjectConstruction selectByKey = projectConstructionService.selectByKey(id);
      request.setAttribute("pc", selectByKey);
      return "constructions/constructions_edit";
    } else {
      
      ProjectRoadWork projectRoadWork=new ProjectRoadWork(); 
      projectRoadWork.setProId(proId);
      List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(projectRoadWork, null);
      if(projectRoadWorkAll!=null&&projectRoadWorkAll.size()>0){
        projectRoadWork=projectRoadWorkAll.get(0);
      }
      request.setAttribute("proWork", projectRoadWork);
      request.setAttribute("proId", proId);
      return "constructions/constructions_add";
    }
    
  }
}
