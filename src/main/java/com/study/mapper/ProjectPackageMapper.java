package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectPackage;
import com.study.util.MyMapper;

public interface ProjectPackageMapper extends MyMapper<ProjectPackage> {
  
   public List<ProjectPackage>  selectByAll(Map<String, Object> map);
  
}