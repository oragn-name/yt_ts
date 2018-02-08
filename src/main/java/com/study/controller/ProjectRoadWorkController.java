package com.study.controller;

import java.util.List;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.model.ProjectRoadWork;
import com.study.model.User;
import com.study.service.ProjectRoadWorkService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value="ProjectRoadWorkController",description="项目施工操作API")
@RestController
public class ProjectRoadWorkController {

	@Autowired
	private ProjectRoadWorkService roadWorkService;
	
	@RequestMapping(value="/roadworks/getData",method={RequestMethod.GET})
	public DataGridResultInfo getData(@ModelAttribute PageBean bean){
		List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(null, bean);
		PageInfo<ProjectRoadWork> info=new PageInfo<ProjectRoadWork>(projectRoadWorkAll);
		return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
	}
	
	@RequestMapping(value = "/roadworks/add",method={RequestMethod.POST})
    public String add(@ModelAttribute ProjectRoadWork roadWork) {
		try {
			roadWorkService.save(roadWork);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
            return "fail";
		}
	}
	
	@RequestMapping(value = "/roadworks/edit",method={RequestMethod.POST})
    public String edit(@ModelAttribute ProjectRoadWork roadWork) {
		try {
			roadWorkService.updateNotNull(roadWork);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
            return "fail";
		}
	}
	
	@RequestMapping(value = "/roadworks/delete",method={RequestMethod.DELETE})
    public String delete(@RequestParam(value="ids",required=true)String ids){
		try {
			if (ids != null) {
				String[] id = ids.split(",");
				for (String string : id) {
					roadWorkService.delete(Integer.parseInt(string));
				}
			}
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
            return "fail";
		}
    }
}
