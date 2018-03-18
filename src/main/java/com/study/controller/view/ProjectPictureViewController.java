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
import com.study.model.ProjectPicture;
import com.study.model.ProjectReceipts;
import com.study.service.DictdataService;
import com.study.service.ProjectPictureService;
import com.study.util.bean.MenuBean;

@Api(value="ProjectPictureViewController",description="转竣工图页面跳转")
@Controller
public class ProjectPictureViewController {

  @Autowired
  private ProjectPictureService projectPictureService;
  @Autowired
  private DictdataService dictdataService;
  
  @RequestMapping(value="/pictures/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="pictureId",required=false) Integer pictureId, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
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
