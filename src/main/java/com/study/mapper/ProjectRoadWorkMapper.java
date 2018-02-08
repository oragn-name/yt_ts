package com.study.mapper;

import java.util.List;

import com.study.model.ProjectRoadWork;
import com.study.util.MyMapper;

public interface ProjectRoadWorkMapper extends MyMapper<ProjectRoadWork> {
  
  public List<ProjectRoadWork> selectProjectWorkAll(ProjectRoadWork projectRoadWork);
}