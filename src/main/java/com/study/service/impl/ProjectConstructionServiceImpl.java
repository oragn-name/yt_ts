package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectConstructionMapper;
import com.study.model.ProjectConstruction;
import com.study.service.ProjectConstructionService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;
@Service("projectConstructionService")
public class ProjectConstructionServiceImpl extends BaseService<ProjectConstruction> implements ProjectConstructionService{

  @Autowired
  private ProjectConstructionMapper projectConstructionMapper;
  @Override
  public List<ProjectConstruction> selectByAll(
      ProjectConstruction construction, PageBean page) {
      if(PageBeanUtil.pageBeanIsNotEmpty(page)){
        PageHelper.startPage(page.getPage(), page.getRows());
      }
      List<ProjectConstruction> selectByAll = projectConstructionMapper.selectByAll(construction);
    return selectByAll;
  }

}
