package com.study.service;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectAccounts;
import com.study.model.vo.AccountsOrder;
import com.study.util.bean.PageBean;

public interface ProjectAccountsService extends IService<ProjectAccounts> {
  public List<ProjectAccounts> selectAccountsByAll(ProjectAccounts accounts,PageBean bean);
  public List<AccountsOrder>  getOrderDay(Map<String, Object> map);
}
