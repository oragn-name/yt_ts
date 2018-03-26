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

import com.study.model.ProjectProduce;
import com.study.model.ProjectRoadWork;
import com.study.model.ProjectRoadWorkDaily;
import com.study.service.ProjectProduceService;
import com.study.service.ProjectRoadWorkDailyService;
import com.study.service.ProjectRoadWorkService;
import com.study.util.bean.MenuBean;
@Api(value="ProjectRoadWorkDailyViewController",description="每日工作量页面跳转")
@Controller
public class ProjectRoadWorkDailyViewController {
  @Autowired
  private ProjectRoadWorkDailyService roadWorkDailyService;
  
  @Autowired
  private ProjectProduceService projectProduceService;
  
  @Autowired
  private ProjectRoadWorkService roadWorkService;
  
  @RequestMapping(value="/workdailys/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="id",required=false)Integer id,@ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId,@RequestParam(value="pcId",required=false)Integer pcId){
    request.setAttribute("menu", bean);
    if(id!=null){
      ProjectRoadWorkDaily selectByKey = roadWorkDailyService.selectByKey(id);
      ProjectProduce produce=new ProjectProduce();
      produce.setId(selectByKey.getProId());
      List<ProjectProduce> projectProduceAll = projectProduceService.getProjectProduceAll(produce, null);
      ProjectRoadWork projectRoadWork=new ProjectRoadWork();
      projectRoadWork.setProId(selectByKey.getProId());
      List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(projectRoadWork, null);
      ProjectRoadWork projectRoadWork2 = new ProjectRoadWork();
      if(projectRoadWorkAll!=null&&projectRoadWorkAll.size()>0){
        projectRoadWork2=projectRoadWorkAll.get(0);
      }
      request.setAttribute("pro", projectProduceAll.get(0));
      request.setAttribute("work", projectRoadWork2);
      request.setAttribute("daily", selectByKey);
      return "workdailys/workdailys_edit";
    }else{
      ProjectProduce produce=new ProjectProduce();
      produce.setId(proId);
      List<ProjectProduce> projectProduceAll = projectProduceService.getProjectProduceAll(produce, null);
      ProjectRoadWork projectRoadWork=new ProjectRoadWork();
      projectRoadWork.setProId(proId);
      List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(projectRoadWork, null);
      ProjectRoadWork projectRoadWork2 = new ProjectRoadWork();
      if(projectRoadWorkAll!=null&&projectRoadWorkAll.size()>0){
        projectRoadWork2=projectRoadWorkAll.get(0);
      }
      request.setAttribute("pcId", pcId);
      request.setAttribute("proId", proId);
      request.setAttribute("pro", projectProduceAll.get(0));
      request.setAttribute("work", projectRoadWork2);
      return "workdailys/workdailys_add";
    }
  }
  
}
