package com.study.mapper;

import java.util.List;

import com.study.model.ProjectRoadWordDetail;
import com.study.util.MyMapper;

public interface ProjectRoadWordDetailMapper extends MyMapper<ProjectRoadWordDetail> {
  public List<ProjectRoadWordDetail> getDetailByAll(ProjectRoadWordDetail detail);
  
  public List<ProjectRoadWordDetail> getDetailByCreateTime(ProjectRoadWordDetail detail);
  
  
  
  public List<ProjectRoadWordDetail> getDetailByCreateTimeByWater(ProjectRoadWordDetail detail);
  
  
  public List<ProjectRoadWordDetail>  getDetailBySum(ProjectRoadWordDetail detail);
}