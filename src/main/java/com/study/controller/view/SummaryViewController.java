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
import com.study.model.ProjectRoadWordDetail;
import com.study.model.vo.DeptVo;
import com.study.model.vo.ProjectDetail;
import com.study.model.vo.ProjectDetailType;
import com.study.model.vo.ProjectType;
import com.study.service.DictdataService;
import com.study.service.ProjectRoadWordDetailService;
import com.study.service.ProjectRoadWorkDailyService;

@Api(value="SummaryViewController",description="汇总统计")
@Controller
public class SummaryViewController {
  @Autowired
  private ProjectRoadWorkDailyService roadWorkDailyService;
  @Autowired
  private DictdataService dictdataService;
  @Autowired
  private ProjectRoadWordDetailService projectRoadWordDetailService;
  
  @RequestMapping("/day/{menuName}/{id}")
  public String day(HttpServletRequest request,HttpServletResponse response,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime){
    Map<String,Object> map=new HashMap<String, Object>();
    map.put("proName", proName==null?"":proName.trim());
    map.put("proNumber", proNumber==null?"":proNumber.trim());
    map.put("proSerialNumber", proSerialNumber==null?"":proSerialNumber.trim());
    Map<String, Object> mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "GZL");
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(mapDic, null);
   /* List<ProjectDetail> selectProjectDetail = roadWorkDailyService.selectProjectDetail(map);
    request.setAttribute("proDetail", selectProjectDetail);*/
    StringBuffer buffer=new StringBuffer();
    buffer.append("<table id=\"tbHaederText\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"border-collapse: collapse; word-break: keep-all; border-color: Black;width: 100%;\">");
    buffer.append("<tr>");//第一行
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>工号</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>临时工号</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>序号</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap align=\"center\">工程来源</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap align=\"center\">工程性质</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap align=\"center\">工程类别</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>期次</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>实际开工时间</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>实际竣工时间</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>施工单位</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>设计长度</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>时间</td>");
    buffer.append("<td class=\"th\" colspan=\""+dicts.size()*2+"\"  nowrap>DMA口径(个数)</td>");
    buffer.append("<td class=\"th\" colspan=\""+dicts.size()*2+"\"  nowrap>倒流防止器口径(个数)</td>");
    buffer.append("<td class=\"th\" colspan=\""+dicts.size()*2+"\"  nowrap>工作量(长度)</td>");
    buffer.append("</tr>");
    
    
    buffer.append("<tr>");//第二行
    buffer.append("<td class=\"th\"  nowrap colspan=\""+dicts.size()+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+dicts.size()+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+dicts.size()+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+dicts.size()+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+dicts.size()+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+dicts.size()+"\" align=\"center\">次日计划完成</td>");
    buffer.append("</tr>");
    
    
    buffer.append("<tr>");//第三行
     for (int i = 0; i < 6; i++) {
       for (Dictionarydata dic : dicts) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+dic.getDictdataName()+"</td>");
       } 
     }
    buffer.append("</tr>");
    //=================表头end====================
    
    List<ProjectDetail> orderDay = roadWorkDailyService.getOrderDay(map);
    if(orderDay!=null&&orderDay.size()>0){
       for (ProjectDetail projectDetail : orderDay) {
         ProjectRoadWordDetail detail=new ProjectRoadWordDetail();
         detail.setProId(projectDetail.getProId());
         detail.setPcId(projectDetail.getPcId());
         detail.setBeginTime( beginTime==null?"":beginTime.trim());
         detail.setEndTime( endTime==null?"":endTime.trim());
         List<ProjectRoadWordDetail> prwd = projectRoadWordDetailService.getDetailByCreateTime(detail);
         int row=1;
         if(prwd!=null&&prwd.size()>0){
           row=prwd.size();
         }
         
         buffer.append("<tr>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\" >"+projectDetail.getProNumber()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProSnapNumber()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProSerialNumber()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProSourceName()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProNatureName()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProEngineTypeName()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProPeriodName()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getPrwAst()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getPrwAet()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getPcDeptName()+"</td>");
         buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProDesignLength()+"</td>");
         if(prwd==null||prwd.size()<=0){
           buffer.append("<td class=\"td\"></td>");
           for (int i = 0; i < 6; i++) {
             for (Dictionarydata dic : dicts) {
               buffer.append("<td class=\"td\" ></td>");
             }
           }
         }
         if(prwd!=null&&prwd.size()>=1){
           buffer.append("<td class=\"td\" >"+prwd.get(0).getCreateTime()+"</td>");
           for (int i = 0; i < 6; i++) {
             for (Dictionarydata dic : dicts) {
               ProjectRoadWordDetail det=new ProjectRoadWordDetail();
               det.setProId(projectDetail.getProId());
               det.setPcId(projectDetail.getPcId());
               det.setDnId(dic.getId());
               det.setCreateTime(prwd.get(0).getCreateTime());
               List<ProjectRoadWordDetail> prwds = projectRoadWordDetailService.getDetailByAll(det, null);
               ProjectRoadWordDetail wd=null;
               if(prwds!=null&&prwds.size()>0){
                 wd=prwds.get(0);
               }
               if(i==0||i==2||i==4){
                 if(i==0){
                    if(wd!=null){
                      buffer.append("<td class=\"td\" >"+wd.getDetailDma()+"</td>");
                    }else{
                      buffer.append("<td class=\"td\" ></td>");
                    }
                   
                 }
                 if(i==2){
                   if(wd!=null){
                     buffer.append("<td class=\"td\" >"+wd.getDetailAnti()+"</td>");
                   }else{
                     buffer.append("<td class=\"td\" ></td>");
                   }
                 }
                 if(i==4){
                   if(wd!=null){
                     buffer.append("<td class=\"td\" >"+wd.getDetailDay()+"</td>");
                   }else{
                     buffer.append("<td class=\"td\" ></td>");
                   }
                 }
               }else{
                 if(i==1){
                   if(wd!=null){
                     buffer.append("<td class=\"td\" >"+wd.getDetailNextDma()+"</td>");
                   }else{
                     buffer.append("<td class=\"td\" ></td>");
                   }
                 }
                 if(i==3){
                   if(wd!=null){
                     buffer.append("<td class=\"td\" >"+wd.getDetailNextAnti()+"</td>");
                   }else{
                     buffer.append("<td class=\"td\" ></td>");
                   }
                 }
                if(i==5){
                  if(wd!=null){
                    buffer.append("<td class=\"td\" >"+wd.getDetailNextDay()+"</td>");
                  }else{
                    buffer.append("<td class=\"td\" ></td>");
                  }
                }
               }
             }
           }
         }
         buffer.append("</tr>");
         if(prwd!=null&&prwd.size()>1){
           for (int k=1;k<prwd.size();k++) {
             buffer.append("<tr>");
             buffer.append("<td class=\"td\" >"+prwd.get(k).getCreateTime()+"</td>");
             for (int i = 0; i < 6; i++) {
               for (Dictionarydata dic : dicts) {
                 ProjectRoadWordDetail det=new ProjectRoadWordDetail();
                 det.setProId(projectDetail.getProId());
                 det.setPcId(projectDetail.getPcId());
                 det.setDnId(dic.getId());
                 det.setCreateTime(prwd.get(k).getCreateTime());
                 List<ProjectRoadWordDetail> prwds = projectRoadWordDetailService.getDetailByAll(det, null);
                 ProjectRoadWordDetail wd=null;
                 if(prwds!=null&&prwds.size()>0){
                   wd=prwds.get(0);
                 }
                 if(i==0||i==2||i==4){
                   if(i==0){
                      if(wd!=null){
                        buffer.append("<td class=\"td\" >"+wd.getDetailDma()+"</td>");
                      }else{
                        buffer.append("<td class=\"td\" ></td>");
                      }
                     
                   }
                   if(i==2){
                     if(wd!=null){
                       buffer.append("<td class=\"td\" >"+wd.getDetailAnti()+"</td>");
                     }else{
                       buffer.append("<td class=\"td\" ></td>");
                     }
                   }
                   if(i==4){
                     if(wd!=null){
                       buffer.append("<td class=\"td\" >"+wd.getDetailDay()+"</td>");
                     }else{
                       buffer.append("<td class=\"td\" ></td>");
                     }
                   }
                 }else{
                   if(i==1){
                     if(wd!=null){
                       buffer.append("<td class=\"td\" >"+wd.getDetailNextDma()+"</td>");
                     }else{
                       buffer.append("<td class=\"td\" ></td>");
                     }
                   }
                   if(i==3){
                     if(wd!=null){
                       buffer.append("<td class=\"td\" >"+wd.getDetailNextAnti()+"</td>");
                     }else{
                       buffer.append("<td class=\"td\" ></td>");
                     }
                   }
                  if(i==5){
                    if(wd!=null){
                      buffer.append("<td class=\"td\" >"+wd.getDetailNextDay()+"</td>");
                    }else{
                      buffer.append("<td class=\"td\" ></td>");
                    }
                  }
                 }
               }
             }
             
             buffer.append("</tr>");
          }
         }
         
      }
    }    
    
    
    buffer.append("</table>");
    
    request.setAttribute("html", buffer.toString());
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
