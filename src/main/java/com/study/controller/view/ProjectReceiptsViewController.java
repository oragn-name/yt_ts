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

import com.study.model.Dept;
import com.study.model.ProjectProduce;
import com.study.model.ProjectReceipts;
import com.study.model.vo.ProjectItemConstruction;
import com.study.service.ProjectProduceService;
import com.study.service.ProjectReceiptsService;
import com.study.service.ProjectRoadWorkDailyService;
import com.study.service.impl.DeptServiceImpl;
import com.study.util.bean.MenuBean;

@Api(value="ProjectReceiptsViewController",description="财务收款页面跳转")
@Controller
public class ProjectReceiptsViewController {
  @Autowired
  private ProjectReceiptsService projectReceiptsService;
  @Autowired
  private ProjectProduceService projectProduceService;
  @Autowired
  private DeptServiceImpl deptService;
  
  @RequestMapping(value="receipts/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="receiptsId",required=false) Integer receiptsId, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
    request.setAttribute("menu", bean);
   /* ProjectItemConstruction  construction=new ProjectItemConstruction();
    List<ProjectItemConstruction> selectProjectItemConstruction = roadWorkDailyService.selectProjectItemConstruction(construction, null);
    */
    ProjectProduce produce=new ProjectProduce();
    produce.setId(proId);
    List<ProjectProduce> projectProduceAll = projectProduceService.getProjectProduceAll(produce, null);
    ProjectProduce projectProduce=new ProjectProduce();
    if(projectProduceAll!=null&&projectProduceAll.size()>0){
      projectProduce=projectProduceAll.get(0);
      String proConsts="";
      if(projectProduce.getProConst()!=null&&!"".equals(projectProduce.getProConst())){
        String[] proConst=projectProduce.getProConst().split(",");
        for (String string : proConst) {
          /*Dictionarydata selectByKey = dictdataService.selectByKey(Integer.parseInt(string));*/
          Dept selectByKey = deptService.selectByKey(Integer.parseInt(string));
          if(selectByKey!=null){
            proConsts+=selectByKey.getName()+",";
          }
        }
      }
      if(proConsts.length()>0){
        proConsts=proConsts.substring(0, proConsts.length()-1);
      }
      projectProduce.setProConst(proConsts);
    }
    request.setAttribute("pro", projectProduce);
    if (receiptsId != null) {
      ProjectReceipts selectByKey = projectReceiptsService.selectByKey(receiptsId);
      request.setAttribute("receipts", selectByKey);
      return "receipts/receipts_edit";
    } else {
      request.setAttribute("proId", proId);
      return "receipts/receipts_add";
    }
    
  }
  
  
}
