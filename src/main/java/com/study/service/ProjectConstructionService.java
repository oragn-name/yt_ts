package com.study.service;

import java.util.List;

import com.study.model.ProjectConstruction;
import com.study.util.bean.PageBean;

public interface ProjectConstructionService extends IService<ProjectConstruction> {
  
  public List<ProjectConstruction> selectByAll(ProjectConstruction construction,PageBean page);

}
