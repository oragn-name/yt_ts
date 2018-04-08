package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectRoadWorkDaily;
import com.study.model.vo.DeptVo;
import com.study.model.vo.ProjectDetail;
import com.study.model.vo.ProjectDetailType;
import com.study.model.vo.ProjectItemConstruction;
import com.study.model.vo.ProjectType;
import com.study.util.MyMapper;

public interface ProjectRoadWorkDailyMapper extends MyMapper<ProjectRoadWorkDaily> {
  
  public List<ProjectRoadWorkDaily> selectRoadWorkDaily(ProjectRoadWorkDaily daily);
  
  
  public List<ProjectItemConstruction> selectProjectItemConstruction(ProjectItemConstruction itemConstruction); 
  
  public List<ProjectDetail> selectProjectDetail(Map<String, Object> map);
  
  
  public  List<ProjectType>  selectProjectByType(Map<String, Object> map);
  
  public List<ProjectDetailType> selectProjectByTypeDetail(Map<String, Object> map);
  
  public List<DeptVo> getDept(Map<String, Object> map);
  
  
  
  public  List<ProjectDetail> getOrderDay(Map<String, Object> map);
  
}