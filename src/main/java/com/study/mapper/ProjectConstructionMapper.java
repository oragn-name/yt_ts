package com.study.mapper;

import java.util.List;

import com.study.model.ProjectConstruction;
import com.study.util.MyMapper;

public interface ProjectConstructionMapper extends MyMapper<ProjectConstruction> {
  
  
  public List<ProjectConstruction> selectByAll(ProjectConstruction construction);
}