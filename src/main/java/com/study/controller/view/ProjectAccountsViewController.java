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
import com.study.model.ProjectAccounts;
import com.study.model.ProjectProduce;
import com.study.model.ProjectRoadWork;
import com.study.model.ProjectSatety;
import com.study.service.DictdataService;
import com.study.service.ProjectAccountsService;
import com.study.service.ProjectProduceService;
import com.study.service.ProjectRoadWorkService;
import com.study.util.bean.MenuBean;

@Api(value="ProjectAccountsViewController",description="财务结算页面跳转")
@Controller
public class ProjectAccountsViewController {

  @Autowired
  private ProjectAccountsService projectAccountsService;
  @Autowired
  private ProjectProduceService projectProduceService;
  @Autowired
  private ProjectRoadWorkService roadWorkService;
  @Autowired
  private DictdataService dictdataService;
  
  @RequestMapping(value="accounts/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="accountsId",required=false) Integer accountsId, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
    request.setAttribute("menu", bean);
    if (accountsId != null) {
      ProjectAccounts selectByKey = projectAccountsService.selectByKey(accountsId);
      ProjectProduce produce=new ProjectProduce();
      produce.setId(selectByKey.getProId());
      List<ProjectProduce> projectProduceAll = projectProduceService.getProjectProduceAll(produce, null);
      if(projectProduceAll!=null&&projectProduceAll.size()>0){
        produce=projectProduceAll.get(0);
        String proConsts="";
        if(produce.getProConst()!=null&&!"".equals(produce.getProConst())){
          String[] proConst=produce.getProConst().split(",");
          for (String string : proConst) {
            Dictionarydata selectByKeyq = dictdataService.selectByKey(Integer.parseInt(string));
            if(selectByKeyq!=null){
              proConsts+=selectByKeyq.getDictdataName()+",";
            }
          }
        }
        if(proConsts.length()>0){
          proConsts=proConsts.substring(0, proConsts.length()-1);
        }
        produce.setProConst(proConsts);
      }
      ProjectRoadWork projectRoadWork=new ProjectRoadWork();
      projectRoadWork.setProId(selectByKey.getProId());
      List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(projectRoadWork, null);
      if(projectRoadWorkAll!=null&&projectRoadWorkAll.size()>0){
        projectRoadWork=projectRoadWorkAll.get(0);
      }
      request.setAttribute("accounts", selectByKey);
      request.setAttribute("produce", produce);
      request.setAttribute("projectRoadWork", projectRoadWork);
      return "accounts/accounts_edit";
    } else {
      ProjectProduce produce=new ProjectProduce();
      produce.setId(proId);
      List<ProjectProduce> projectProduceAll = projectProduceService.getProjectProduceAll(produce, null);
      if(projectProduceAll!=null&&projectProduceAll.size()>0){
        produce=projectProduceAll.get(0);
        String proConsts="";
        if(produce.getProConst()!=null&&!"".equals(produce.getProConst())){
          String[] proConst=produce.getProConst().split(",");
          for (String string : proConst) {
            Dictionarydata selectByKeyq = dictdataService.selectByKey(Integer.parseInt(string));
            if(selectByKeyq!=null){
              proConsts+=selectByKeyq.getDictdataName()+",";
            }
          }
        }
        if(proConsts.length()>0){
          proConsts=proConsts.substring(0, proConsts.length()-1);
        }
        produce.setProConst(proConsts);
      }
      ProjectRoadWork projectRoadWork=new ProjectRoadWork();
      projectRoadWork.setProId(proId);
      List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(projectRoadWork, null);
      if(projectRoadWorkAll!=null&&projectRoadWorkAll.size()>0){
        projectRoadWork=projectRoadWorkAll.get(0);
      }
      request.setAttribute("proId", proId);
      request.setAttribute("produce", produce);
      request.setAttribute("projectRoadWork", projectRoadWork);
      return "accounts/accounts_add";
    }
    
  }
  
}
