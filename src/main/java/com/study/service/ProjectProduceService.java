package com.study.service;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectProduce;
import com.study.util.bean.PageBean;

public interface ProjectProduceService extends IService<ProjectProduce> {

 public List<ProjectProduce> getProjectProduceAll(ProjectProduce produce,PageBean bean);
 
 public List<ProjectProduce> selectProjectProAllMap(Map<String, Object> map,PageBean bean);
}
