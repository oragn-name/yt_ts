package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectContractMapper;
import com.study.model.ProjectContract;
import com.study.service.ProjectContractService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service(value="projectContractService")
public class ProjectContractServiceImpl extends BaseService<ProjectContract> implements ProjectContractService {

  @Autowired
  private ProjectContractMapper projectContractMapper;

  @Override
  public List<ProjectContract> selectContractByAll(ProjectContract contract,
      PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectContract> selectContractByAll = projectContractMapper.selectContractByAll(contract);
    return selectContractByAll;
  }

}
