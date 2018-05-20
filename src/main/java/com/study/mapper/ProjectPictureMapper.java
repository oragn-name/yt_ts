package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectPicture;
import com.study.model.vo.PictureOrder;
import com.study.util.MyMapper;

public interface ProjectPictureMapper extends MyMapper<ProjectPicture> {
  public List<ProjectPicture> selectPictureByAll(ProjectPicture picture);
  
  public List<PictureOrder> getOrderDay(Map<String, Object> map);
  
  public List<PictureOrder> getOrderalarm(Map<String, Object> map);
}