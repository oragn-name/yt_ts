package com.study.mapper;

import java.util.List;

import com.study.model.ProjectSatety;
import com.study.util.MyMapper;

public interface ProjectSatetyMapper extends MyMapper<ProjectSatety> {
  
  public List<ProjectSatety> selectSafetyByAll(ProjectSatety projectSatety);
}