package com.study.service;

import java.util.List;

import com.study.model.ProjectRoadWordDetail;
import com.study.util.bean.PageBean;

public interface ProjectRoadWordDetailService extends IService<ProjectRoadWordDetail> {
   public List<ProjectRoadWordDetail>  getDetailByAll(ProjectRoadWordDetail detail,PageBean bean);
   
   
   public List<ProjectRoadWordDetail> getDetailByCreateTime(ProjectRoadWordDetail detail);
}
