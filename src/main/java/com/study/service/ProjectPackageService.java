package com.study.service;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectPackage;
import com.study.util.bean.PageBean;

public interface ProjectPackageService  extends IService<ProjectPackage> {
  public List<ProjectPackage>  selectByAll(Map<String, Object> map,PageBean bean);
}
