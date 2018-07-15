package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectContractSend;
import com.study.model.ProjectPackage;
import com.study.model.vo.ContractProject;
import com.study.util.MyMapper;

public interface ProjectContractSendMapper extends MyMapper<ProjectContractSend> {
  public List<ProjectContractSend>  selectByAll(Map<String, Object> map);
  
  public List<ContractProject>  selectByAllProject(Map<String, Object> map);
  public List<ContractProject> selectByorder(Map<String, Object> map);
}