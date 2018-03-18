package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectSatetyMapper;
import com.study.model.ProjectSatety;
import com.study.service.ProjectSatetyService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service(value="projectSatetyService")
public class ProjectSatetyServiceImpl extends BaseService<ProjectSatety> implements ProjectSatetyService {
  @Autowired
  private ProjectSatetyMapper projectSatetyMapper;

  @Override
  public List<ProjectSatety> selectSafetyByAll(ProjectSatety projectSatety,
      PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectSatety> selectSafetyByAll = projectSatetyMapper.selectSafetyByAll(projectSatety);
    return selectSafetyByAll;
  }
}
