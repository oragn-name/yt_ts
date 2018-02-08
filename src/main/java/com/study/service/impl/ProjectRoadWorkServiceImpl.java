package com.study.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectRoadWorkMapper;
import com.study.model.ProjectRoadWork;
import com.study.service.ProjectRoadWorkService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service("roadWorkService")
public class ProjectRoadWorkServiceImpl extends BaseService<ProjectRoadWork> implements ProjectRoadWorkService {

	@Autowired
	private ProjectRoadWorkMapper roadWorkMapper;
	@Override
	public List<ProjectRoadWork> getProjectRoadWorkAll(
			ProjectRoadWork projectRoadWork, PageBean bean) {
		if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
			PageHelper.startPage(bean.getPage(), bean.getRows());
		}
		List<ProjectRoadWork> selectByExample = roadWorkMapper.selectProjectWorkAll(projectRoadWork);
		return selectByExample;
	}


}
