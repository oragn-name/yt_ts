package com.study.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectPackageMapper;
import com.study.model.ProjectPackage;
import com.study.service.ProjectPackageService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service("projectPackageService")
public class ProjectPackageServiceImpl extends BaseService<ProjectPackage> implements ProjectPackageService {

  @Autowired
  private ProjectPackageMapper projectPackageMapper;
  @Override
  public List<ProjectPackage> selectByAll(Map<String, Object> map,PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectPackage> selectByAll = projectPackageMapper.selectByAll(map);
    return selectByAll;
  }

}
