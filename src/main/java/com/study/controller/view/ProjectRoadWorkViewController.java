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
import com.study.model.ProjectRoadWork;
import com.study.service.DictdataService;
import com.study.service.ProjectProduceService;
import com.study.service.ProjectRoadWorkService;
import com.study.util.bean.MenuBean;

@Api(value="ProjectRoadWorkViewController",description="项目施工展示页面")
@Controller
public class ProjectRoadWorkViewController {
	@Autowired
	private DictdataService dictdataService;
	@Autowired
	private ProjectRoadWorkService roadWorkService;
	@Autowired
  private ProjectProduceService projectProduceService;
	
	@RequestMapping(value="roadworks/add",method={RequestMethod.GET})
	public String add(HttpServletRequest request,@RequestParam(value="id",required=false) Integer id, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
		request.setAttribute("menu", bean);
		 List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
		 ProjectProduce pro = projectProduceService.selectByKey(proId);
		 request.setAttribute("pro", pro);
		 request.setAttribute("dicts", dicts);
		if (id != null) {
			ProjectRoadWork roadWork = roadWorkService.selectByKey(id);
			request.setAttribute("roadWork", roadWork);
			return "roadworks/roadworks_edit";
		} else {
		  request.setAttribute("proId", proId);
			return "roadworks/roadworks_add";
		}
		
	}

}
