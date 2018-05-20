package com.study.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectPictureMapper;
import com.study.model.ProjectPicture;
import com.study.model.vo.PictureOrder;
import com.study.service.ProjectPictureService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service(value="projectPictureService")
public class ProjectPictureServiceImpl extends BaseService<ProjectPicture> implements ProjectPictureService {

  @Autowired
  private ProjectPictureMapper projectPictureMapper;

  @Override
  public List<ProjectPicture> selectPictureByAll(ProjectPicture picture,PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectPicture> selectPictureByAll = projectPictureMapper.selectPictureByAll(picture);
    return selectPictureByAll;
  }

  @Override
  public List<PictureOrder> getOrderDay(Map<String, Object> map) {
    return projectPictureMapper.getOrderDay(map);
  }

  @Override
  public List<PictureOrder> getOrderalarm(Map<String, Object> map) {
    return projectPictureMapper.getOrderalarm(map);
  }
  
  
}
