package com.study.service;

import java.util.List;

import com.study.model.ProjectPicture;
import com.study.util.bean.PageBean;

public interface ProjectPictureService extends IService<ProjectPicture> {

  
  public List<ProjectPicture> selectPictureByAll(ProjectPicture picture,PageBean bean);
}
