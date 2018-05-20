package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectAccounts;
import com.study.model.vo.AccountsOrder;
import com.study.util.MyMapper;

public interface ProjectAccountsMapper extends MyMapper<ProjectAccounts> {
  public List<ProjectAccounts> selectAccountsByAll(ProjectAccounts accounts);
  public List<AccountsOrder>  getOrderDay(Map<String, Object> map);
}