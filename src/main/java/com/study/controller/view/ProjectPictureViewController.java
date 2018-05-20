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
import com.study.model.Dictionarydata;
import com.study.model.ProjectPicture;
import com.study.model.ProjectProduce;
import com.study.model.ProjectReceipts;
import com.study.model.ProjectRoadWork;
import com.study.service.DictdataService;
import com.study.service.ProjectPictureService;
import com.study.service.ProjectProduceService;
import com.study.service.ProjectRoadWorkService;
import com.study.service.impl.DeptServiceImpl;
import com.study.util.bean.MenuBean;

@Api(value="ProjectPictureViewController",description="转竣工图页面跳转")
@Controller
public class ProjectPictureViewController {

  @Autowired
  private ProjectPictureService projectPictureService;
  @Autowired
  private DictdataService dictdataService;
  
  @Autowired
  private ProjectProduceService projectProduceService;
  @Autowired
  private DeptServiceImpl deptService;
  @Autowired
  private ProjectRoadWorkService roadWorkService;
  @RequestMapping(value="/pictures/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="pictureId",required=false) Integer pictureId, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
    
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
   
    ProjectRoadWork projectRoadWork=new ProjectRoadWork();
    projectRoadWork.setProId(proId);
    List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(projectRoadWork, null);
    if(projectRoadWorkAll!=null&&projectRoadWorkAll.size()>0){
      projectRoadWork=projectRoadWorkAll.get(0);
    }
    request.setAttribute("projectRoadWork", projectRoadWork);
    request.setAttribute("menu", bean);
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dicts);
    if (pictureId != null) {
      ProjectPicture selectByKey = projectPictureService.selectByKey(pictureId);
      request.setAttribute("picture", selectByKey);
      return "pictures/pictures_edit";
    } else {
      request.setAttribute("proId", proId);
      return "pictures/pictures_add";
    }
    
  }
  
}
