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
import com.study.model.ProjectContractSend;
import com.study.model.ProjectPackage;
import com.study.service.ProjectContractSendService;
import com.study.service.ProjectContractService;
import com.study.util.bean.MenuBean;

@Controller
public class ProjectSendViewController {
  @Autowired
  private ProjectContractSendService projectContractSendService;
  @Autowired
  private ProjectContractService projectContractService;
  @RequestMapping(value="/sends/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,Integer id, Integer pcId, @ModelAttribute MenuBean bean){
    request.setAttribute("menu", bean);
    if (id != null) {
       ProjectContractSend selectByKey = projectContractSendService.selectByKey(id);
       ProjectContract selectByKey1 = projectContractService.selectByKey(selectByKey.getPcId());
       request.setAttribute("pc", selectByKey1);
      request.setAttribute("send",selectByKey );
      return "sends/sends_edit";
    } else {
      ProjectContract selectByKey1 = projectContractService.selectByKey(pcId);
      request.setAttribute("pc", selectByKey1);
      request.setAttribute("pcId", pcId);
      return "sends/sends_add";
    }
  }
}
