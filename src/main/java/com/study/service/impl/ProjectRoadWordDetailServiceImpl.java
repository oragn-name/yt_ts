package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectRoadWordDetailMapper;
import com.study.model.ProjectRoadWordDetail;
import com.study.service.ProjectRoadWordDetailService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service(value="projectRoadWordDetailService")
public class ProjectRoadWordDetailServiceImpl extends BaseService<ProjectRoadWordDetail> implements ProjectRoadWordDetailService {

  @Autowired
  private ProjectRoadWordDetailMapper projectRoadWordDetailMapper;
  
  
  @Override
  public List<ProjectRoadWordDetail> getDetailByAll(ProjectRoadWordDetail detail,PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectRoadWordDetail> detailByAll = projectRoadWordDetailMapper.getDetailByAll(detail);
    return detailByAll;
  }


  @Override
  public List<ProjectRoadWordDetail> getDetailByCreateTime(
      ProjectRoadWordDetail detail) {
    return projectRoadWordDetailMapper.getDetailByCreateTime(detail);
  }

}
