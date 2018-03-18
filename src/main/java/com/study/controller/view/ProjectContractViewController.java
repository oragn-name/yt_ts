package com.study.controller.view;

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
import com.study.model.ProjectContract;
import com.study.model.ProjectPicture;
import com.study.service.DictdataService;
import com.study.service.ProjectContractService;
import com.study.util.bean.MenuBean;

@Api(value="ProjectContractViewController",description="合同页面跳转")
@Controller
public class ProjectContractViewController {
  @Autowired
  private ProjectContractService projectContractService;
  @Autowired
  private DictdataService dictdataService;
  @RequestMapping(value="/contracts/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request, String proIds, @ModelAttribute MenuBean bean,Integer contractId){
    request.setAttribute("menu", bean);
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dicts);
    if (contractId != null) {
      ProjectContract selectByKey = projectContractService.selectByKey(contractId);
      request.setAttribute("contract", selectByKey);
      return "contracts/contracts_edit";
    } else {
      request.setAttribute("proIds", proIds);
      return "contracts/contracts_add";
    }
    
  }
  
}
