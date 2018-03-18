package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectAccountsMapper;
import com.study.model.ProjectAccounts;
import com.study.service.ProjectAccountsService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service(value="projectAccountsService")
public class ProjectAccountsServiceImpl extends BaseService<ProjectAccounts> implements ProjectAccountsService {

  @Autowired
  private ProjectAccountsMapper projectAccountsMapper;

  @Override
  public List<ProjectAccounts> selectAccountsByAll(ProjectAccounts accounts,
      PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(),bean.getRows());
    }
    List<ProjectAccounts> selectAccountsByAll = projectAccountsMapper.selectAccountsByAll(accounts);
    return selectAccountsByAll;
  }
  
  
}
