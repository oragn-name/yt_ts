package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectContractSend;
import com.study.model.ProjectPackage;
import com.study.util.MyMapper;

public interface ProjectContractSendMapper extends MyMapper<ProjectContractSend> {
  public List<ProjectContractSend>  selectByAll(Map<String, Object> map);
}