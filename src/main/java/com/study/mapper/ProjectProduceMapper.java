package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectProduce;
import com.study.util.MyMapper;
import com.study.util.bean.PageBean;

public interface ProjectProduceMapper extends MyMapper<ProjectProduce> {
  public List<ProjectProduce> selectProjectProAll(ProjectProduce produce);
  
  
  public List<ProjectProduce> selectProjectProAllMap(Map<String, Object> map);
}