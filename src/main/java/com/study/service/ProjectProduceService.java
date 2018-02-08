package com.study.service;

import java.util.List;

import com.study.model.ProjectProduce;
import com.study.util.bean.PageBean;

public interface ProjectProduceService extends IService<ProjectProduce> {

 public List<ProjectProduce> getProjectProduceAll(ProjectProduce produce,PageBean bean);
}
