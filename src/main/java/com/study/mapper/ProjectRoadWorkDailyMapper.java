package com.study.mapper;

import java.util.List;

import com.study.model.ProjectRoadWorkDaily;
import com.study.model.vo.ProjectItemConstruction;
import com.study.util.MyMapper;

public interface ProjectRoadWorkDailyMapper extends MyMapper<ProjectRoadWorkDaily> {
  
  public List<ProjectRoadWorkDaily> selectRoadWorkDaily(ProjectRoadWorkDaily daily);
  
  
  public List<ProjectItemConstruction> selectProjectItemConstruction(ProjectItemConstruction itemConstruction); 
}