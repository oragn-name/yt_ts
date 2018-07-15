package com.study.controller.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.study.model.ProjectProduce;
import com.study.model.vo.ContractProject;
import com.study.service.ProjectContractSendService;
import com.study.service.ProjectContractService;
import com.study.service.ProjectProduceService;
import com.study.util.bean.MenuBean;

@Controller
public class ProjectSendViewController {
  @Autowired
  private ProjectContractSendService projectContractSendService;
  @Autowired
  private ProjectContractService projectContractService;
  @Autowired
  private ProjectProduceService projectProduceService;
  
  @RequestMapping(value="/sends/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,Integer id, Integer proId, @ModelAttribute MenuBean bean){
    request.setAttribute("menu", bean);
    if (id != null) {
    	ProjectContractSend selectByKey = projectContractSendService.selectByKey(id);
    	ProjectProduce selectByKey2 = projectProduceService.selectByKey(selectByKey.getProId());
    	Map<String, Object> map=new HashMap<String, Object>();
	  	  map.put("contractNumber", selectByKey2.getProContractNumber());
	  	  List<ContractProject> selectByAllProject = projectContractSendService.selectByAllProject(map, null);
	  	  ContractProject contractProject=new ContractProject();
	  	  if(selectByAllProject!=null&&selectByAllProject.size()>0){
	  		contractProject=selectByAllProject.get(0);
	  	  }
       
       request.setAttribute("pc", contractProject);
      request.setAttribute("send",selectByKey );
      return "sends/sends_edit";
    } else {
    	ProjectProduce selectByKey2 = projectProduceService.selectByKey(proId);
    	Map<String, Object> map=new HashMap<String, Object>();
	  	  map.put("contractNumber", selectByKey2.getProContractNumber());
	  	  List<ContractProject> selectByAllProject = projectContractSendService.selectByAllProject(map, null);
	  	  ContractProject contractProject=new ContractProject();
	  	  if(selectByAllProject!=null&&selectByAllProject.size()>0){
	  		contractProject=selectByAllProject.get(0);
	  	  }
      request.setAttribute("pc", contractProject);
      request.setAttribute("proId", proId);
      return "sends/sends_add";
    }
  }
}
