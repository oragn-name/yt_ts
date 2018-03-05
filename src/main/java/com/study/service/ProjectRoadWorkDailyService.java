package com.study.service;

import java.util.List;

import com.study.model.ProjectRoadWorkDaily;
import com.study.model.vo.ProjectItemConstruction;
import com.study.util.bean.PageBean;

public interface ProjectRoadWorkDailyService extends IService<ProjectRoadWorkDaily>{
  public List<ProjectRoadWorkDaily> selectWorkDailyAll(ProjectRoadWorkDaily daily,PageBean bean);
  
  public List<ProjectItemConstruction> selectProjectItemConstruction(ProjectItemConstruction itemConstruction,PageBean bean);
}
