package com.study.service;

import java.util.List;

import com.study.model.ProjectContract;
import com.study.util.bean.PageBean;

public interface ProjectContractService extends IService<ProjectContract> {
  public List<ProjectContract> selectContractByAll(ProjectContract contract,PageBean bean);
}
