package com.study.controller.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.model.Dictionarydata;
import com.study.model.ProjectContract;
import com.study.model.ProjectPackage;
import com.study.service.DictdataService;
import com.study.service.ProjectContractService;
import com.study.service.ProjectPackageService;
import com.study.util.bean.MenuBean;

@Controller
public class ProjectPackageViewController {
  @Autowired
  private ProjectPackageService projectPackageService;
  @Autowired
  private ProjectContractService projectContractService;
  @Autowired
  private DictdataService dictdataService;
  @RequestMapping(value="/packages/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,Integer id, Integer pcId, @ModelAttribute MenuBean bean){
    request.setAttribute("menu", bean);
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dicts);
    if (id != null) {
       
       ProjectPackage selectByKey = projectPackageService.selectByKey(id);
       ProjectContract selectByKey1 = projectContractService.selectByKey(selectByKey.getPcId());
       request.setAttribute("pc", selectByKey1);
      request.setAttribute("pack", selectByKey);
      return "packages/packages_edit";
    } else {
      ProjectContract selectByKey = projectContractService.selectByKey(pcId);
      
      request.setAttribute("pc", selectByKey);
      request.setAttribute("pcId", pcId);
      return "packages/packages_add";
    }
    
  }
  
  
}
