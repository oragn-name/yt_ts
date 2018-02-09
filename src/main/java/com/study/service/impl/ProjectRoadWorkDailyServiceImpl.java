package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectRoadWorkDailyMapper;
import com.study.model.ProjectRoadWorkDaily;
import com.study.service.ProjectRoadWorkDailyService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service("roadWorkDailyService")
public class ProjectRoadWorkDailyServiceImpl extends BaseService<ProjectRoadWorkDaily> implements
		ProjectRoadWorkDailyService {

  @Autowired
  private ProjectRoadWorkDailyMapper roadWorkDailyMapper;
  @Override
  public List<ProjectRoadWorkDaily> selectWorkDailyAll(
      ProjectRoadWorkDaily daily,PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectRoadWorkDaily> selectByExample = roadWorkDailyMapper.selectRoadWorkDaily(daily);
    return selectByExample;
    
  }

}
