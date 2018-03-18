package com.study.mapper;

import java.util.List;

import com.study.model.ProjectAccounts;
import com.study.util.MyMapper;

public interface ProjectAccountsMapper extends MyMapper<ProjectAccounts> {
  public List<ProjectAccounts> selectAccountsByAll(ProjectAccounts accounts);
}