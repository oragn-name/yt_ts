package com.study.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectContractSendMapper;
import com.study.model.ProjectContractSend;
import com.study.model.vo.ContractProject;
import com.study.service.ProjectContractSendService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service("projectContractSendService")
public class ProjectContractSendServiceImpl extends BaseService<ProjectContractSend> implements ProjectContractSendService {

  @Autowired
  private ProjectContractSendMapper projectContractSendMapper;
  @Override
  public List<ProjectContractSend> selectByAll(Map<String, Object> map, PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectContractSend> selectByAll = projectContractSendMapper.selectByAll(map);
    return selectByAll;
  }
@Override
public List<ContractProject> selectByAllProject(Map<String, Object> map,
		PageBean bean) {
	if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
	      PageHelper.startPage(bean.getPage(), bean.getRows());
	    }
	List<ContractProject> selectByAllProject = projectContractSendMapper.selectByAllProject(map);
	return selectByAllProject;
}
@Override
public List<ContractProject> selectByorder(Map<String, Object> map) {
	return projectContractSendMapper.selectByorder(map);
}

}
