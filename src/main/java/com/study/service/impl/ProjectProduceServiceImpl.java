package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectProduceMapper;
import com.study.model.ProjectProduce;
import com.study.service.ProjectProduceService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service("projectProduceService")
public class ProjectProduceServiceImpl extends BaseService<ProjectProduce> implements ProjectProduceService {

  @Autowired
  private ProjectProduceMapper projectProduceMapper;
  @Override
  public List<ProjectProduce> getProjectProduceAll(ProjectProduce produce,
      PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectProduce> selectByExample = projectProduceMapper.selectProjectProAll(produce);
    return selectByExample;
  }

}
