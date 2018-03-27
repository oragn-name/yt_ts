package com.study.controller.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.model.Dept;
import com.study.model.Dictionarydata;
import com.study.model.vo.DeptVo;
import com.study.model.vo.ProjectDetail;
import com.study.model.vo.ProjectDetailType;
import com.study.model.vo.ProjectType;
import com.study.service.DictdataService;
import com.study.service.ProjectRoadWorkDailyService;

@Api(value="SummaryViewController",description="汇总统计")
@Controller
public class SummaryViewController {
  @Autowired
  private ProjectRoadWorkDailyService roadWorkDailyService;
  @Autowired
  private DictdataService dictdataService;
  
  @RequestMapping("/day/{menuName}/{id}")
  public String day(HttpServletRequest request,HttpServletResponse response,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime){
    Map<String,Object> map=new HashMap<String, Object>();
    map.put("proName", proName==null?"":proName.trim());
    map.put("proNumber", proNumber==null?"":proNumber.trim());
    map.put("proSerialNumber", proSerialNumber==null?"":proSerialNumber.trim());
    map.put("beginTime", beginTime==null?"":beginTime.trim());
    map.put("endTime", endTime==null?"":endTime.trim());
    List<ProjectDetail> selectProjectDetail = roadWorkDailyService.selectProjectDetail(map);
    request.setAttribute("proDetail", selectProjectDetail);
    request.setAttribute("proName", proName);
    request.setAttribute("proNumber", proNumber);
    request.setAttribute("proSerialNumber",proSerialNumber);
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);
    return "day/day";
  }
  @RequestMapping("/type/{menuName}/{id}")
  public String type(HttpServletRequest request,HttpServletResponse response,String type,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime,String proEngineType,String proPeriod){
    
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dicts);
    Map<String,Object> map=new HashMap<String, Object>();
   /* map.put("proName", proName==null?"":proName.trim());
    map.put("proNumber", proNumber==null?"":proNumber.trim());
    map.put("proSerialNumber", proSerialNumber==null?"":proSerialNumber.trim());
    map.put("beginTime", beginTime==null?"":beginTime.trim());
    map.put("endTime", endTime==null?"":endTime.trim());*/
    map.put("proEngineType", proEngineType==null?"":proEngineType.trim());
    map.put("proPeriod", proPeriod==null?"":proPeriod.trim());
    List<ProjectType> selectProjectDetail = roadWorkDailyService.selectProjectByType(map);
    request.setAttribute("proDetailType", selectProjectDetail);
    /*request.setAttribute("proName", proName);
    request.setAttribute("proNumber", proNumber);
    request.setAttribute("proSerialNumber",proSerialNumber);
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);*/
    request.setAttribute("proEngineType",proEngineType);
    request.setAttribute("proPeriod",proPeriod);
    return "day/type";
  }
  
  
  @RequestMapping("/typeDetail/{menuName}/{id}")
  public String typeDetail(HttpServletRequest request,HttpServletResponse response,String type,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime,String proEngineType,String proPeriod,Integer ids,String deptName){
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dicts);
    List<DeptVo> dept = roadWorkDailyService.getDept(null);
    request.setAttribute("dept", dept);
    Map<String,Object> map=new HashMap<String, Object>();
    /*map.put("proName", proName==null?"":proName.trim());
    map.put("proNumber", proNumber==null?"":proNumber.trim());
    map.put("proSerialNumber", proSerialNumber==null?"":proSerialNumber.trim());
    map.put("beginTime", beginTime==null?"":beginTime.trim());
    map.put("endTime", endTime==null?"":endTime.trim());*/
    map.put("proEngineType", proEngineType==null?"":proEngineType.trim());
    map.put("proPeriod", proPeriod==null?"":proPeriod.trim());
    Map<String, List<ProjectDetailType>> mapData=new HashMap<String,List<ProjectDetailType>>();
    if(ids!=null){
      map.put("deptId",ids);
      List<ProjectDetailType> selectProjectDetail = roadWorkDailyService.selectProjectByTypeDetail(map);
      if(selectProjectDetail!=null&&selectProjectDetail.size()>0){
        mapData.put(deptName, selectProjectDetail);
      }
    }else{
      if(dept!=null){
        for (DeptVo deptVo : dept) {
          map.put("deptId",deptVo.getId());
          List<ProjectDetailType> selectProjectDetail = roadWorkDailyService.selectProjectByTypeDetail(map);
          if(selectProjectDetail!=null&&selectProjectDetail.size()>0){
            mapData.put(deptVo.getName(), selectProjectDetail);
          }
          
        }
      }
    }
   
    
    request.setAttribute("mapData", mapData);
   /* request.setAttribute("proName", proName);
    request.setAttribute("proNumber", proNumber);
    request.setAttribute("proSerialNumber",proSerialNumber);
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);*/
    request.setAttribute("proEngineType",proEngineType);
    request.setAttribute("proPeriod",proPeriod);
    request.setAttribute("ids",ids);
    return "day/detail";
  }
}
