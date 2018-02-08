package com.study.service;

import java.util.List;

import com.study.model.ProjectRoadWork;
import com.study.util.bean.PageBean;

public interface ProjectRoadWorkService extends IService<ProjectRoadWork>{

	
	public List<ProjectRoadWork> getProjectRoadWorkAll(ProjectRoadWork projectRoadWork,PageBean bean);
}
