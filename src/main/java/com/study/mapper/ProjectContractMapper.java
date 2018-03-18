package com.study.mapper;

import java.util.List;

import com.study.model.ProjectContract;
import com.study.util.MyMapper;

public interface ProjectContractMapper extends MyMapper<ProjectContract> {
  
  public List<ProjectContract> selectContractByAll(ProjectContract contract);
}