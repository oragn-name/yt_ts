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
import com.study.model.ProjectProduce;
import com.study.service.DictdataService;
import com.study.service.ProjectProduceService;
import com.study.util.bean.MenuBean;

@Api(value="produces",description="项目立项页面跳转")
@Controller
public class ProjectProduceViewController {
  @Autowired
  private DictdataService dictdataService;
  @Autowired
  private ProjectProduceService projectProduceService;
  @RequestMapping(value="/produces/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="id",required=false)Integer id,@ModelAttribute MenuBean bean){
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dicts);
    request.setAttribute("menu", bean);
    if(id!=null){
      ProjectProduce selectByKey = projectProduceService.selectByKey(id);
      request.setAttribute("prop", selectByKey);
      return "produces/produces_edit";
    }else{
      return "produces/produces_add";
    }
  }
}
