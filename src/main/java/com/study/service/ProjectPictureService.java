package com.study.service;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectPicture;
import com.study.model.vo.PictureOrder;
import com.study.util.bean.PageBean;

public interface ProjectPictureService extends IService<ProjectPicture> {

  
  public List<ProjectPicture> selectPictureByAll(ProjectPicture picture,PageBean bean);
  
  public List<PictureOrder> getOrderDay(Map<String, Object> map);
  public List<PictureOrder> getOrderalarm(Map<String, Object> map);
}
