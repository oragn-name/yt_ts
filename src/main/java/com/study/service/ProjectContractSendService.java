package com.study.service;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectContractSend;
import com.study.model.ProjectPackage;
import com.study.util.bean.PageBean;

public interface ProjectContractSendService extends IService<ProjectContractSend> {
  public List<ProjectContractSend>  selectByAll(Map<String, Object> map,PageBean bean);
}
