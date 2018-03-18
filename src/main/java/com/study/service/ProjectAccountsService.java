package com.study.service;

import java.util.List;

import com.study.model.ProjectAccounts;
import com.study.util.bean.PageBean;

public interface ProjectAccountsService extends IService<ProjectAccounts> {
  public List<ProjectAccounts> selectAccountsByAll(ProjectAccounts accounts,PageBean bean);
}
