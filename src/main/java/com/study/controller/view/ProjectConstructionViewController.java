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

import com.study.model.Dictionarydata;
import com.study.model.ProjectConstruction;
import com.study.model.ProjectProduce;
import com.study.service.DictdataService;
import com.study.service.ProjectConstructionService;
import com.study.service.ProjectProduceService;
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
  
  
  @RequestMapping(value="constructions/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="id",required=false) Integer id, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
     request.setAttribute("menu", bean);
     ProjectProduce pro = projectProduceService.selectByKey(proId);
     List<Dictionarydata> dictionarydatas=new ArrayList<Dictionarydata>();
     String proConst = pro.getProConst();//施工单位
     if(proConst!=null&&!"".equals(proConst)){
       String[] str=proConst.split(",");
       for (String string : str) {
         Dictionarydata dtd = dictdataService.selectByKey(Integer.parseInt(string));
         if(dtd!=null){
           dictionarydatas.add(dtd);
         }
      }
     }
     request.setAttribute("dtd", dictionarydatas);
    if (id != null) {
      ProjectConstruction selectByKey = projectConstructionService.selectByKey(id);
      request.setAttribute("pc", selectByKey);
      return "constructions/constructions_edit";
    } else {
      request.setAttribute("proId", proId);
      return "constructions/constructions_add";
    }
    
  }
}
