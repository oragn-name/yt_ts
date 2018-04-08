package com.study.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectRoadWorkDailyMapper;
import com.study.model.ProjectRoadWorkDaily;
import com.study.model.vo.DeptVo;
import com.study.model.vo.ProjectDetail;
import com.study.model.vo.ProjectDetailType;
import com.study.model.vo.ProjectItemConstruction;
import com.study.model.vo.ProjectType;
import com.study.service.ProjectRoadWorkDailyService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service("roadWorkDailyService")
public class ProjectRoadWorkDailyServiceImpl extends BaseService<ProjectRoadWorkDaily> implements
		ProjectRoadWorkDailyService {

  @Autowired
  private ProjectRoadWorkDailyMapper roadWorkDailyMapper;
  @Override
  public List<ProjectRoadWorkDaily> selectWorkDailyAll(
      ProjectRoadWorkDaily daily,PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectRoadWorkDaily> selectByExample = roadWorkDailyMapper.selectRoadWorkDaily(daily);
    return selectByExample;
    
  }
  @Override
  public List<ProjectItemConstruction> selectProjectItemConstruction(
      ProjectItemConstruction itemConstruction, PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectItemConstruction> selectProjectItemConstruction = roadWorkDailyMapper.selectProjectItemConstruction(itemConstruction);
    return selectProjectItemConstruction;
  }
  @Override
  public List<ProjectDetail> selectProjectDetail(Map<String, Object> map) {
    return roadWorkDailyMapper.selectProjectDetail(map);
  }
  @Override
  public  List<ProjectType>  selectProjectByType(Map<String, Object> map){
    return roadWorkDailyMapper.selectProjectByType(map);
  }
  @Override
  public List<ProjectDetailType> selectProjectByTypeDetail(
      Map<String, Object> map) {
    return roadWorkDailyMapper.selectProjectByTypeDetail(map);
  }
  @Override
  public List<DeptVo> getDept(Map<String, Object> map) {
    return roadWorkDailyMapper.getDept(map);
  }
  @Override
  public List<ProjectDetail> getOrderDay(Map<String, Object> map) {
    return roadWorkDailyMapper.getOrderDay(map);
  }
  @Override
  public List<ProjectType> getOrderType(Map<String, Object> map) {
    return roadWorkDailyMapper.getOrderType(map);
  }

}
