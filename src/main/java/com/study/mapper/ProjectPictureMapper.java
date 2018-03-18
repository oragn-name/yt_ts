package com.study.mapper;

import java.util.List;

import com.study.model.ProjectPicture;
import com.study.util.MyMapper;

public interface ProjectPictureMapper extends MyMapper<ProjectPicture> {
  public List<ProjectPicture> selectPictureByAll(ProjectPicture picture);
}