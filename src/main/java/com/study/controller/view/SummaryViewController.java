package com.study.controller.view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.Api;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.model.Dept;
import com.study.model.Dictionarydata;
import com.study.model.ProjectConstruction;
import com.study.model.ProjectProduce;
import com.study.model.ProjectRoadWordDetail;
import com.study.model.User;
import com.study.model.vo.DeptVo;
import com.study.model.vo.ProjectDetail;
import com.study.model.vo.ProjectDetailType;
import com.study.model.vo.ProjectItemConstruction;
import com.study.model.vo.ProjectType;
import com.study.service.DictdataService;
import com.study.service.ProjectConstructionService;
import com.study.service.ProjectProduceService;
import com.study.service.ProjectRoadWordDetailService;
import com.study.service.ProjectRoadWorkDailyService;
import com.study.service.impl.DeptServiceImpl;

@Api(value="SummaryViewController",description="汇总统计")
@Controller
public class SummaryViewController {
  @Autowired
  private ProjectRoadWorkDailyService roadWorkDailyService;
  @Autowired
  private DictdataService dictdataService;
  @Autowired
  private DeptServiceImpl deptService;
  @Autowired
  private ProjectRoadWordDetailService projectRoadWordDetailService;
  @Autowired
  private ProjectProduceService projectProduceService;
  @Autowired
  private ProjectConstructionService projectConstructionService;
  
  @RequestMapping("/day/{menuName}/{id}")
  public String day(HttpServletRequest request,HttpServletResponse response,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime,Integer proStatus,String proContractNumber,String proDeptName,String pcDeptName,String proEngineTypeName,String proSourceName,String proNatureName,String proPeriodName){
    long begintime=System.currentTimeMillis();
    Map<String,Object> map=new HashMap<String, Object>();
    map.put("proName", proName==null?"":proName.trim());
    map.put("proNumber", proNumber==null?"":proNumber.trim());
    /*Integer proStatus,String proContractNumber,String proDeptName,String pcDeptName,
    String proEngineTypeName,
    String proSourceName,String proNatureName,String proPeriodName*/
    map.put("proSerialNumber", proSerialNumber==null?"":proSerialNumber.trim());
    map.put("proStatus", proStatus);
    map.put("proContractNumber", proContractNumber==null?"":proContractNumber.trim());
    map.put("proDeptName", proDeptName==null?"":proDeptName.trim());
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    Dept selectByKey = deptService.selectByKey(user.getDeptId());
    if(!selectByKey.getCode().toUpperCase().equals("SCK")){
      map.put("pcDeptName",user.getDeptId());
    }else{
      map.put("pcDeptName", pcDeptName==null?"":pcDeptName.trim());
    }
    map.put("proEngineTypeName", proEngineTypeName==null?"":proEngineTypeName.trim());
    map.put("proSourceName", proSourceName==null?"":proSourceName.trim());
    map.put("proNatureName", proNatureName==null?"":proNatureName.trim());
    map.put("proPeriodName", proPeriodName==null?"":proPeriodName.trim());
    
    
    request.setAttribute("proStatus", proStatus);
    request.setAttribute("proContractNumber", proContractNumber);
    request.setAttribute("proDeptName", proDeptName);
    request.setAttribute("pcDeptName", pcDeptName);
    request.setAttribute("proEngineTypeName", proEngineTypeName);
    request.setAttribute("proSourceName", proSourceName);
    request.setAttribute("proNatureName", proNatureName);
    request.setAttribute("proPeriodName", proPeriodName);
    
    Map<String, Object> mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "GZL");
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "XHS");
    List<Dictionarydata> XHS = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "PQF");
    List<Dictionarydata> PQF = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "CL");
    List<Dictionarydata> CL = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "YJSBPT");
    List<Dictionarydata> YJSBPT = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "YJSBGJ");
    List<Dictionarydata> YJSBGJ = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "EJSBPT");
    List<Dictionarydata> EJSBPT = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "EJSBGJ");
    List<Dictionarydata> EJSBGJ = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "JJM");
    List<Dictionarydata> JJM = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "ZM");
    List<Dictionarydata> ZM = dictdataService.selectDictdataByParentId(mapDic, null);
    mapDic=new HashMap<String, Object>();
    mapDic.put("dictCode", "LLJ");
    List<Dictionarydata> LLJ = dictdataService.selectDictdataByParentId(mapDic, null);
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
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>合同编号</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>合同名称</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\" style=\"width:300px;\"  nowrap>工程进展问题</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>转入单位</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>项目状态</td>");
    
    
    
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>实际开工时间</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>实际竣工时间</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>施工单位</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>设计长度</td>");
    buffer.append("<td class=\"th\" rowspan=\"3\"  nowrap>时间</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(dicts.size()*2+2)+"\"  nowrap>DMA(个数)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(dicts.size()*2+2)+"\"  nowrap>倒流防止器(个数)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(dicts.size()*2+2)+"\"  nowrap>工作量(长度)</td>");
    
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(XHS.size()*2+2)+"\"  nowrap>消火栓</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(PQF.size()*2+2)+"\"  nowrap>排气阀</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(CL.size()*2+2)+"\"  nowrap>测流</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(YJSBPT.size()*2+2)+"\"  nowrap>一级水表(普通)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(YJSBGJ.size()*2+2)+"\"  nowrap>一级水表（高精)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(EJSBPT.size()*2+2)+"\"  nowrap>二级水表(普通)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(EJSBGJ.size()*2+2)+"\"  nowrap>二级水表（高精)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(JJM.size()*2+2)+"\"  nowrap>截门</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(ZM.size()*2+2)+"\"  nowrap>闸门</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\""+(LLJ.size()*2+2)+"\"  nowrap>流量计</td>");
    buffer.append("</tr>");
    
    
    buffer.append("<tr>");//第二行
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(dicts.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(dicts.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(dicts.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(dicts.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(dicts.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(dicts.size()+1)+"\" align=\"center\">次日计划完成</td>");
    
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(XHS.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(XHS.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(PQF.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(PQF.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(CL.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(CL.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(YJSBPT.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(YJSBPT.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(YJSBGJ.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(YJSBGJ.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(EJSBPT.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(EJSBPT.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(EJSBGJ.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(EJSBGJ.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(JJM.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(JJM.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(ZM.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(ZM.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(LLJ.size()+1)+"\" align=\"center\">当前实际完成</td>");
    buffer.append("<td class=\"th\"  nowrap colspan=\""+(LLJ.size()+1)+"\" align=\"center\">次日计划完成</td>");
    buffer.append("</tr>");
    
    
    buffer.append("<tr>");//第三行
     for (int i = 0; i < 6; i++) {
       for (int ii=0;ii<dicts.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+dicts.get(ii).getDictdataName()+"</td>");
         if(ii==dicts.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
     }
    isNotNull(XHS, PQF, CL, YJSBPT, YJSBGJ, EJSBPT, EJSBGJ, JJM,ZM,LLJ, buffer);
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
         if(prwd!=null&&prwd.size()>=1){
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
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProContractNumber()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getContractName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\" style=\"width:300px;word-wrap:break-word ;\">"+projectDetail.getPrwProgressReport()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProDeptName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+(projectDetail.getProStatus()==null?"":projectDetail.getProStatus()==1?"在施":projectDetail.getProStatus()==2?"待施":projectDetail.getProStatus()==3?"已完工":projectDetail.getProStatus()==4?"待转图":"")+"</td>");

           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getPrwAst()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getPrwAet()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getPcDeptName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProDesignLength()+"</td>");
           if(prwd==null||prwd.size()<=0){
             buffer.append("<td class=\"td\"></td>");
             for (int i = 0; i < 6; i++) {
               for (int ii=0;ii<dicts.size();ii++) {
                 buffer.append("<td class=\"td\" ></td>");
                 if(ii==dicts.size()-1){
                   buffer.append("<td class=\"td\"></td>");
                 }
               }
             }
             isNull(XHS, PQF, CL, YJSBPT, YJSBGJ, EJSBPT, EJSBGJ, JJM,ZM,LLJ,buffer);
           }
           buffer.append("<td class=\"td\" >"+prwd.get(0).getCreateTime()+"</td>");
           for (int i = 0; i < 6; i++) {
             BigDecimal one=new BigDecimal("0");
             BigDecimal one1=new BigDecimal("0");
             BigDecimal two=new BigDecimal("0");
             BigDecimal two1=new BigDecimal("0");
             BigDecimal three=new BigDecimal("0");
             BigDecimal three1=new BigDecimal("0");
             for (int ii=0;ii<dicts.size();ii++) {
               ProjectRoadWordDetail det=new ProjectRoadWordDetail();
               det.setProId(projectDetail.getProId());
               det.setPcId(projectDetail.getPcId());
               det.setDnId(dicts.get(ii).getId());
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
                      one=one.add(new BigDecimal(wd.getDetailDma()==null?"0":wd.getDetailDma().toString()));
                    }else{
                      buffer.append("<td class=\"td\" ></td>");
                    }
                   
                 }else if(i==2){
                   if(wd!=null){
                     buffer.append("<td class=\"td\" >"+wd.getDetailAnti()+"</td>");
                     two=two.add(new BigDecimal(wd.getDetailAnti()==null?"0":wd.getDetailAnti().toString()));
                   }else{
                     buffer.append("<td class=\"td\" ></td>");
                   }
                 }else if(i==4){
                   if(wd!=null){
                     buffer.append("<td class=\"td\" >"+wd.getDetailDay()+"</td>");
                     three=three.add(new BigDecimal(wd.getDetailDay()==null?"0":wd.getDetailDay().toString()));
                   }else{
                     buffer.append("<td class=\"td\" ></td>");
                   }
                 }
               }else{
                 if(i==1){
                   if(wd!=null){
                     buffer.append("<td class=\"td\" >"+wd.getDetailNextDma()+"</td>");
                     one1=one1.add(new BigDecimal(wd.getDetailNextDma()==null?"0":wd.getDetailNextDma().toString()));
                   }else{
                     buffer.append("<td class=\"td\" ></td>");
                   }
                 }else if(i==3){
                   if(wd!=null){
                     buffer.append("<td class=\"td\" >"+wd.getDetailNextAnti()+"</td>");
                     two1=two1.add(new BigDecimal(wd.getDetailNextAnti()==null?"0":wd.getDetailNextAnti().toString()));
                   }else{
                     buffer.append("<td class=\"td\" ></td>");
                   }
                 }else if(i==5){
                  if(wd!=null){
                    buffer.append("<td class=\"td\" >"+wd.getDetailNextDay()+"</td>");
                    three1=three1.add(new BigDecimal(wd.getDetailNextDay()==null?"0":wd.getDetailNextDay().toString()));
                  }else{
                    buffer.append("<td class=\"td\" ></td>");
                  }
                }
               }
               if(ii==dicts.size()-1){
                 if(i==0){
                   buffer.append("<td class=\"td\" >"+one.doubleValue()+"</td>");
                 }else if(i==1){
                   buffer.append("<td class=\"td\" >"+one1.doubleValue()+"</td>");
                 }else if(i==2){
                   buffer.append("<td class=\"td\" >"+two.doubleValue()+"</td>");
                 }else if(i==3){
                   buffer.append("<td class=\"td\" >"+two1.doubleValue()+"</td>");
                 }else if(i==4){
                   buffer.append("<td class=\"td\" >"+three.doubleValue()+"</td>");
                 }else if(i==5){
                   buffer.append("<td class=\"td\" >"+three1.doubleValue()+"</td>");
                 }
                 
               }
             }
           }
         //XHS, PQF, CL, YJSBPT, YJSBGJ, EJSBPT, EJSBGJ, JJM
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(XHS, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(PQF, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
          }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(CL, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(YJSBPT, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(YJSBGJ, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(EJSBPT, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(EJSBGJ, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(JJM, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(ZM, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           for (int j = 0; j <2; j++) {
             BigDecimal xhs=new BigDecimal("0");
             BigDecimal xhs1=new BigDecimal("0");
             GZL(LLJ, buffer, projectDetail, prwd.get(0).getCreateTime(), j, xhs, xhs1);
           }
           
         }
         buffer.append("</tr>");
         if(prwd!=null&&prwd.size()>1){
           for (int k=1;k<prwd.size();k++) {
             buffer.append("<tr>");
             buffer.append("<td class=\"td\" >"+prwd.get(k).getCreateTime()+"</td>");
             for (int i = 0; i < 6; i++) {
               BigDecimal one=new BigDecimal("0");
               BigDecimal one1=new BigDecimal("0");
               BigDecimal two=new BigDecimal("0");
               BigDecimal two1=new BigDecimal("0");
               BigDecimal three=new BigDecimal("0");
               BigDecimal three1=new BigDecimal("0");
               for (int ii=0;ii<dicts.size();ii++) {
                 ProjectRoadWordDetail det=new ProjectRoadWordDetail();
                 det.setProId(projectDetail.getProId());
                 det.setPcId(projectDetail.getPcId());
                 det.setDnId(dicts.get(ii).getId());
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
                        one=one.add(new BigDecimal(wd.getDetailDma()==null?"0":wd.getDetailDma().toString()));
                      }else{
                        buffer.append("<td class=\"td\" ></td>");
                      }
                     
                   }else if(i==2){
                     if(wd!=null){
                       buffer.append("<td class=\"td\" >"+wd.getDetailAnti()+"</td>");
                       two=two.add(new BigDecimal(wd.getDetailAnti()==null?"0":wd.getDetailAnti().toString()));
                     }else{
                       buffer.append("<td class=\"td\" ></td>");
                     }
                   }else if(i==4){
                     if(wd!=null){
                       buffer.append("<td class=\"td\" >"+wd.getDetailDay()+"</td>");
                       three=three.add(new BigDecimal(wd.getDetailDay()==null?"0":wd.getDetailDay().toString()));
                     }else{
                       buffer.append("<td class=\"td\" ></td>");
                     }
                   }
                 }else{
                   if(i==1){
                     if(wd!=null){
                       buffer.append("<td class=\"td\" >"+wd.getDetailNextDma()+"</td>");
                       one1=one1.add(new BigDecimal(wd.getDetailNextDma()==null?"0":wd.getDetailNextDma().toString()));
                     }else{
                       buffer.append("<td class=\"td\" ></td>");
                     }
                   }else if(i==3){
                     if(wd!=null){
                       buffer.append("<td class=\"td\" >"+wd.getDetailNextAnti()+"</td>");
                       two1=two1.add(new BigDecimal(wd.getDetailNextAnti()==null?"0":wd.getDetailNextAnti().toString()));
                     }else{
                       buffer.append("<td class=\"td\" ></td>");
                     }
                   }else if(i==5){
                    if(wd!=null){
                      buffer.append("<td class=\"td\" >"+wd.getDetailNextDay()+"</td>");
                      three1=three1.add(new BigDecimal(wd.getDetailNextDay()==null?"0":wd.getDetailNextDay().toString()));
                    }else{
                      buffer.append("<td class=\"td\" ></td>");
                    }
                  }
                 }
                 if(ii==dicts.size()-1){
                   if(i==0){
                     buffer.append("<td class=\"td\" >"+one.doubleValue()+"</td>");
                   }else if(i==1){
                     buffer.append("<td class=\"td\" >"+one1.doubleValue()+"</td>");
                   }else if(i==2){
                     buffer.append("<td class=\"td\" >"+two.doubleValue()+"</td>");
                   }else if(i==3){
                     buffer.append("<td class=\"td\" >"+two1.doubleValue()+"</td>");
                   }else if(i==4){
                     buffer.append("<td class=\"td\" >"+three.doubleValue()+"</td>");
                   }else if(i==5){
                     buffer.append("<td class=\"td\" >"+three1.doubleValue()+"</td>");
                   }
                   
                 }
               }
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(XHS, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(PQF, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
            }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(CL, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(YJSBPT, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(YJSBGJ, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(EJSBPT, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(EJSBGJ, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(JJM, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(ZM, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             for (int j = 0; j <2; j++) {
               BigDecimal xhs=new BigDecimal("0");
               BigDecimal xhs1=new BigDecimal("0");
               GZL(LLJ, buffer, projectDetail, prwd.get(k).getCreateTime(), j, xhs, xhs1);
             }
             
             buffer.append("</tr>");
          }
         }
         
      }
    }    
    
    
    buffer.append("</table>");
    List<Dictionarydata>  dd= dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dd);
    Dept dptt=new Dept(); 
    dptt.setParentCode("sgdw");
    List<Dept> dpt = deptService.selectAllDept(dptt, null);
    request.setAttribute("dept", dpt);
    request.setAttribute("html", buffer.toString().replaceAll("null", ""));
    request.setAttribute("proName", proName);
    request.setAttribute("proNumber", proNumber);
    request.setAttribute("proSerialNumber",proSerialNumber);
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);
    long endtime=System.currentTimeMillis();
    System.out.println("耗时:"+(endtime-begintime)/1000);
    return "day/day";
  }
  private void GZL(List<Dictionarydata> XHS, StringBuffer buffer, ProjectDetail projectDetail,
      String prwd, int j, BigDecimal xhs, BigDecimal xhs1) {
    for (int ii=0;ii<XHS.size();ii++) {
       ProjectRoadWordDetail det=new ProjectRoadWordDetail();
       det.setProId(projectDetail.getProId());
       det.setPcId(projectDetail.getPcId());
       det.setDnId(XHS.get(ii).getId());
       det.setCreateTime(prwd);
       List<ProjectRoadWordDetail> prwds = projectRoadWordDetailService.getDetailByAll(det, null);
       ProjectRoadWordDetail wd=null;
       if(prwds!=null&&prwds.size()>0){
         wd=prwds.get(0);
       }
       if(j==0){
         if(wd!=null){
           buffer.append("<td class=\"td\" >"+wd.getDetailDay()+"</td>");
           xhs=xhs.add(new BigDecimal(wd.getDetailDay()==null?"0":wd.getDetailDay().toString()));
         }else{
           buffer.append("<td class=\"td\" ></td>");
         }
       }else if(j==1){
         if(wd!=null){
           buffer.append("<td class=\"td\" >"+wd.getDetailNextDay()+"</td>");
           xhs1=xhs1.add(new BigDecimal(wd.getDetailNextDay()==null?"0":wd.getDetailNextDay().toString()));
         }else{
           buffer.append("<td class=\"td\" ></td>");
         }
       }
       if(ii==XHS.size()-1){
         if(j==0){
           buffer.append("<td class=\"td\" >"+xhs.doubleValue()+"</td>");
         }else if(j==1){
           buffer.append("<td class=\"td\" >"+xhs1.doubleValue()+"</td>");
         }
       }
     }
  }
  private void isNotNull(List<Dictionarydata> XHS, List<Dictionarydata> PQF, List<Dictionarydata> CL,
      List<Dictionarydata> YJSBPT, List<Dictionarydata> YJSBGJ, List<Dictionarydata> EJSBPT,
      List<Dictionarydata> EJSBGJ, List<Dictionarydata> JJM,List<Dictionarydata> ZM,List<Dictionarydata> LLJ, StringBuffer buffer) {
    for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<XHS.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+XHS.get(ii).getDictdataName()+"</td>");
         if(ii==XHS.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<PQF.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+PQF.get(ii).getDictdataName()+"</td>");
         if(ii==PQF.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<CL.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+CL.get(ii).getDictdataName()+"</td>");
         if(ii==CL.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<YJSBPT.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+YJSBPT.get(ii).getDictdataName()+"</td>");
         if(ii==YJSBPT.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<YJSBGJ.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+YJSBGJ.get(ii).getDictdataName()+"</td>");
         if(ii==YJSBGJ.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<EJSBPT.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+EJSBPT.get(ii).getDictdataName()+"</td>");
         if(ii==EJSBPT.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<EJSBGJ.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+EJSBGJ.get(ii).getDictdataName()+"</td>");
         if(ii==EJSBGJ.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<JJM.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+JJM.get(ii).getDictdataName()+"</td>");
         if(ii==JJM.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
    }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<ZM.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+ZM.get(ii).getDictdataName()+"</td>");
         if(ii==ZM.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
    }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<LLJ.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\">"+LLJ.get(ii).getDictdataName()+"</td>");
         if(ii==LLJ.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\">小计</td>");
         }
       } 
    }
  }
  private void isNull(List<Dictionarydata> XHS, List<Dictionarydata> PQF, List<Dictionarydata> CL,
      List<Dictionarydata> YJSBPT, List<Dictionarydata> YJSBGJ, List<Dictionarydata> EJSBPT,
      List<Dictionarydata> EJSBGJ, List<Dictionarydata> JJM,List<Dictionarydata> ZM,List<Dictionarydata> LLJ, StringBuffer buffer) {
    for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<XHS.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==XHS.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<PQF.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==PQF.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<CL.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==CL.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<YJSBPT.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==YJSBPT.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<YJSBGJ.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==YJSBGJ.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<EJSBPT.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==EJSBPT.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<EJSBGJ.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==EJSBGJ.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
     }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<JJM.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==JJM.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
    }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<ZM.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==ZM.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
    }
     for (int i = 0; i < 2; i++) {
       for (int ii=0;ii<LLJ.size();ii++) {
         buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         if(ii==LLJ.size()-1){
           buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
         }
       } 
    }
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
    map.put("beginTime", beginTime==null?"":beginTime.trim());
    map.put("endTime", endTime==null?"":endTime.trim());
    List<ProjectType> selectProjectDetail = roadWorkDailyService.getOrderType(map);
    request.setAttribute("proDetailType", selectProjectDetail);
    /*request.setAttribute("proName", proName);
    request.setAttribute("proNumber", proNumber);
    request.setAttribute("proSerialNumber",proSerialNumber);
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);*/
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);
    request.setAttribute("proEngineType",proEngineType);
    request.setAttribute("proPeriod",proPeriod);
    return "day/type";
  }
  @RequestMapping("/avg/{menuName}/{id}")
  public String avg(HttpServletRequest request,HttpServletResponse response,String type,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime,String proEngineType,String proPeriod){
    
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
    map.put("beginTime", beginTime==null?"":beginTime.trim());
    map.put("endTime", endTime==null?"":endTime.trim());
    List<ProjectType> selectProjectDetail = roadWorkDailyService.getOrderTypeByAvg(map);
    request.setAttribute("proDetailType", selectProjectDetail);
    /*request.setAttribute("proName", proName);
    request.setAttribute("proNumber", proNumber);
    request.setAttribute("proSerialNumber",proSerialNumber);
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);*/
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);
    request.setAttribute("proEngineType",proEngineType);
    request.setAttribute("proPeriod",proPeriod);
    return "day/avg";
  }
  @RequestMapping("/sum/{menuName}/{id}")
  public String sum(HttpServletRequest request,HttpServletResponse response,String type,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime,String proEngineType,String proPeriod){
    
    
    StringBuffer buffer=new StringBuffer();
    buffer.append("<table id=\"tbHaederText\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"border-collapse: collapse; word-break: keep-all; border-color: Black;width: 100%;\">");
    buffer.append("<tr>");//第一行
    buffer.append("<td class=\"th\" nowrap align=\"center\">工程类别</td>");
    buffer.append("<td class=\"th\" nowrap align=\"center\">期次</td>");
    buffer.append("<td class=\"th\" nowrap align=\"center\">任务户数</td>");
    buffer.append("<td class=\"th\" nowrap align=\"center\">任务长度</td>");
    buffer.append("<td class=\"th\" nowrap align=\"center\">项目状态</td>");
    buffer.append("<td class=\"th\" nowrap align=\"center\">实际户数</td>");
    buffer.append("<td class=\"th\" nowrap align=\"center\">实际工作量</td>");
    buffer.append("</tr>");

    
    Map<String,Object> map=new HashMap<String, Object>();
    List<Dictionarydata> dicts =dictdataService.selectDictdataBySum(map);
    String name="";
    for (int i=0;i< dicts.size();i++) {
      buffer.append("<tr>");
      if(i==0){
        buffer.append("<td class=\"th\" rowspan=\""+(dicts.get(i).getCount()==0?1*3:dicts.get(i).getCount()*3)+"\" nowrap align=\"center\">"+dicts.get(i).getParentName()+"</td>");
      }else{
        if(!name.equals(dicts.get(i).getParentName())){
          buffer.append("<td class=\"th\" rowspan=\""+(dicts.get(i).getCount()==0?1*3:dicts.get(i).getCount()*3)+"\" nowrap align=\"center\">"+dicts.get(i).getParentName()+"</td>");
        }
      }
      buffer.append("<td class=\"th\"  nowrap rowspan=\"3\"  align=\"center\">"+dicts.get(i).getDictdataName()+"</td>");
      buffer.append("<td class=\"th\"  nowrap rowspan=\"3\"  align=\"center\">"+dicts.get(i).getDictdataLength()+"</td>");
      buffer.append("<td class=\"th\"  nowrap rowspan=\"3\"  align=\"center\">"+dicts.get(i).getDictdataNumber()+"</td>");
      
      buffer.append("<td class=\"th\"  nowrap  align=\"center\">已完工</td>");
      buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
      buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
      name=dicts.get(i).getParentName();
      buffer.append("</tr>");
      buffer.append("<tr>");
      buffer.append("<td class=\"th\"  nowrap  align=\"center\">再施</td>");
      buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
      buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
      buffer.append("</tr>");
      buffer.append("<tr>");
      buffer.append("<td class=\"th\"  nowrap  align=\"center\">待转图</td>");
      buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
      buffer.append("<td class=\"th\"  nowrap  align=\"center\"></td>");
      buffer.append("</tr>");
      
    }
    
    buffer.append("</table>");
    request.setAttribute("html", buffer.toString().replaceAll("null", ""));
    return "day/sum";
  }
  @RequestMapping("/typeDetail/{menuName}/{id}")
  public String typeDetail(HttpServletRequest request,HttpServletResponse response,String type,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime,String proEngineType,String proPeriod,Integer ids,String deptName){
    List<Dictionarydata> dicts = dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dicts);
    Dept dptt=new Dept(); 
    dptt.setParentCode("sgdw");
    List<Dept> dpt = deptService.selectAllDept(dptt, null);
    request.setAttribute("dept", dpt);
    Dept d=new Dept(); 
    d.setParentCode("sgdw");
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    Dept selectByKey = deptService.selectByKey(user.getDeptId());
    if(!selectByKey.getCode().toUpperCase().equals("SCK")){
      d.setId(user.getDeptId());
    }else{
      d.setId(ids);
    }
    
    List<Dept> selectAllDept = deptService.selectAllDept(d, null);
    StringBuffer buffer=new StringBuffer();
    buffer.append("<table id=\"tbHaederText\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"border-collapse: collapse; word-break: keep-all; border-color: Black;width: 100%;\">");
    buffer.append("<tr>");//第一行
    buffer.append("<td class=\"th\" rowspan=\"2\"   nowrap align=\"center\">工程类别</td>");
    
    buffer.append("<td class=\"th\" rowspan=\"2\"   nowrap align=\"center\">DMA（个数）小计</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"   nowrap align=\"center\">倒流防止器(个数)小计</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"   nowrap align=\"center\">工作量(长度)小计</td>");
      
    for (int i=0;i<selectAllDept.size();i++) {
      buffer.append("<td class=\"th\" colspan=\"3\"   nowrap align=\"center\">"+selectAllDept.get(i).getName()+"</td>");
    }
    buffer.append("</tr>");
    
    buffer.append("<tr>");//第二行
    for (int i=0;i<selectAllDept.size();i++) {
      buffer.append("<td class=\"th\"   nowrap align=\"center\">DMA（个数）</td>");
      buffer.append("<td class=\"th\"   nowrap align=\"center\">倒流防止器(个数)</td>");
      buffer.append("<td class=\"th\"   nowrap align=\"center\">工作量(长度)</td>");
    }
    buffer.append("</tr>");
    
    
    Map<String, Object> mapDict=new HashMap<String, Object>();
    mapDict.put("dictCode", "GCLB");
    mapDict.put("id", proEngineType==null?"":proEngineType.trim());
    List<Dictionarydata> dd = dictdataService.selectDictdataByParentId(mapDict, null);//获取所有的工程类型
    BigDecimal one1=new BigDecimal("0");
    BigDecimal one2=new BigDecimal("0");
    BigDecimal one3=new BigDecimal("0");
    
    Double[][] list1=new Double[dd.size()][selectAllDept.size()];
    Double[][] list2=new Double[dd.size()][selectAllDept.size()];
    Double[][] list3=new Double[dd.size()][selectAllDept.size()];
    for (int i = 0; i < dd.size(); i++) {
      BigDecimal one=new BigDecimal("0");
      BigDecimal two=new BigDecimal("0");
      BigDecimal three=new BigDecimal("0");
      for (int j=0;j<selectAllDept.size();j++) {
        Map<String, Object> map2=new HashMap<String, Object>();
        map2.put("proEngineType", dd.get(i).getId());
        map2.put("pcDept", selectAllDept.get(j).getId());
        map2.put("beginTime", beginTime==null?"":beginTime.trim());
        map2.put("endTime", endTime==null?"":endTime.trim());
        List<ProjectDetailType> orderDetail = roadWorkDailyService.getOrderDetail(map2);
        if(orderDetail!=null&&orderDetail.size()>0){
          for (int k = 0; k < orderDetail.size(); k++) {
            list1[i][j]=orderDetail.get(k).getDmaTotal();
            list2[i][j]=orderDetail.get(k).getAntiTotal();
            list3[i][j]=orderDetail.get(k).getDayTotal();
            one=one.add(new BigDecimal(orderDetail.get(k).getDmaTotal()+""));
            two=two.add(new BigDecimal(orderDetail.get(k).getAntiTotal()+""));
            three=three.add(new BigDecimal(orderDetail.get(k).getDayTotal()+""));
          }
        }
      }
      one1=one1.add(one);
      one2=one2.add(two);
      one3=one3.add(three);
      buffer.append("<tr>");
      buffer.append("<td class=\"td\" >"+dd.get(i).getDictdataName()+"</td>");
      buffer.append("<td class=\"td\" >"+one.doubleValue()+"</td>");
      buffer.append("<td class=\"td\" >"+two.doubleValue()+"</td>");
      buffer.append("<td class=\"td\" >"+three.doubleValue()+"</td>");
      for (int j=0;j<selectAllDept.size();j++) {
        Map<String, Object> map2=new HashMap<String, Object>();
        map2.put("proEngineType", dd.get(i).getId());
        map2.put("pcDept", selectAllDept.get(j).getId());
        map2.put("beginTime", beginTime==null?"":beginTime.trim());
        map2.put("endTime", endTime==null?"":endTime.trim());
        List<ProjectDetailType> orderDetail = roadWorkDailyService.getOrderDetail(map2);
        if(orderDetail!=null&&orderDetail.size()>0){
          for (int k = 0; k < orderDetail.size(); k++) {
            buffer.append("<td class=\"td\" >"+orderDetail.get(k).getDmaTotal()+"</td>");
            buffer.append("<td class=\"td\" >"+orderDetail.get(k).getAntiTotal()+"</td>");
            buffer.append("<td class=\"td\" >"+orderDetail.get(k).getDayTotal()+"</td>");
          }
        }else{
          buffer.append("<td class=\"td\" ></td>");
          buffer.append("<td class=\"td\" ></td>");
          buffer.append("<td class=\"td\" ></td>");
        }
      }
      buffer.append("</tr>");
    }
    buffer.append("<tr>");//合计
    buffer.append("<td class=\"td\" >合计</td>");
    buffer.append("<td class=\"td\" >"+one1.doubleValue()+"</td>");
    buffer.append("<td class=\"td\" >"+one2.doubleValue()+"</td>");
    buffer.append("<td class=\"td\" >"+one3.doubleValue()+"</td>");
   System.out.println(list1.toString());
   Double[] doubles1=new Double[selectAllDept.size()];
   Double[] doubles2=new Double[selectAllDept.size()];
   Double[] doubles3=new Double[selectAllDept.size()];
   for (int j = 0; j < list1.length; j++) {
    for (int k = 0; k < list1[j].length; k++) {
      if(j!=0){
        doubles1[k]=(new BigDecimal(doubles1[k]+"").add(new BigDecimal(list1[j][k]+"")).doubleValue());
        doubles2[k]=(new BigDecimal(doubles2[k]+"").add(new BigDecimal(list2[j][k]+"")).doubleValue());
        doubles3[k]=(new BigDecimal(doubles3[k]+"").add(new BigDecimal(list3[j][k]+"")).doubleValue());
      }else{
        doubles1[k]=list1[j][k];
        doubles2[k]=list2[j][k];
        doubles3[k]=list3[j][k];
      }
      
    }
  }
   
    for (int i=0;i<doubles1.length;i++) {
      buffer.append("<td class=\"td\" >"+doubles1[i]+"</td>");
      buffer.append("<td class=\"td\" >"+doubles2[i]+"</td>");
      buffer.append("<td class=\"td\" >"+doubles3[i]+"</td>");
    }
    
    
    
    buffer.append("</tr>");
    
    
    buffer.append("<table>");
    
    request.setAttribute("html", buffer.toString().replaceAll("null", ""));
    
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);
    request.setAttribute("proEngineType",proEngineType);
    request.setAttribute("ids",ids);
    return "day/detail";
  }
  @RequestMapping("/water/{menuName}/{id}")
  public String water(HttpServletRequest request,HttpServletResponse response,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime,Integer proStatus,String proContractNumber,String proDeptName,String pcDeptName,String proEngineTypeName,String proSourceName,String proNatureName,String proPeriodName,Integer dnId){
    Map<String,Object> map=new HashMap<String, Object>();
    map.put("proName", proName==null?"":proName.trim());
    map.put("proNumber", proNumber==null?"":proNumber.trim());
    /*Integer proStatus,String proContractNumber,String proDeptName,String pcDeptName,
    String proEngineTypeName,
    String proSourceName,String proNatureName,String proPeriodName*/
    map.put("proSerialNumber", proSerialNumber==null?"":proSerialNumber.trim());
    map.put("proStatus", proStatus);
    map.put("proContractNumber", proContractNumber==null?"":proContractNumber.trim());
    map.put("proDeptName", proDeptName==null?"":proDeptName.trim());
    
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    Dept dps = deptService.selectByKey(user.getDeptId());
    if(!dps.getCode().toUpperCase().equals("SCK")){
      map.put("pcDeptName", user.getDeptId());
    }else{
      map.put("pcDeptName", pcDeptName==null?"":pcDeptName.trim());
    }
    map.put("proEngineTypeName", proEngineTypeName==null?"":proEngineTypeName.trim());
    map.put("proSourceName", proSourceName==null?"":proSourceName.trim());
    map.put("proNatureName", proNatureName==null?"":proNatureName.trim());
    map.put("proPeriodName", proPeriodName==null?"":proPeriodName.trim());
    
    
    request.setAttribute("proStatus", proStatus);
    request.setAttribute("proContractNumber", proContractNumber);
    request.setAttribute("proDeptName", proDeptName);
    request.setAttribute("pcDeptName", pcDeptName);
    request.setAttribute("proEngineTypeName", proEngineTypeName);
    request.setAttribute("proSourceName", proSourceName);
    request.setAttribute("proNatureName", proNatureName);
    request.setAttribute("proPeriodName", proPeriodName);
    request.setAttribute("dnId", dnId);
    
    StringBuffer buffer=new StringBuffer();
    buffer.append("<table id=\"tbHaederText\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"border-collapse: collapse; word-break: keep-all; border-color: Black;width: 100%;\">");
    buffer.append("<tr>");//第一行
    buffer.append("<td class=\"th\"  nowrap align=\"center\">工号</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">临时工号</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">序号</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">工程名称</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">工程来源</td>");
    buffer.append("<td class=\"th\"  nowrap align=\"center\">工程性质</td>");
    buffer.append("<td class=\"th\"  nowrap align=\"center\">工程类别</td>");
    buffer.append("<td class=\"th\"  nowrap align=\"center\">期次</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">转入单位</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">项目状态</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">施工单位</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">施工地点</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">时间</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">工作量</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">计划停水</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">计划冲水</td>");
    buffer.append("<td class=\"th\"   nowrap align=\"center\">计划过燃气</td>");
     buffer.append("</tr>");
     List<ProjectDetail> orderDay = roadWorkDailyService.getOrderDay(map);
     
     if(orderDay!=null&&orderDay.size()>0){
       for (ProjectDetail projectDetail : orderDay) {
         ProjectRoadWordDetail detail=new ProjectRoadWordDetail();
         detail.setProId(projectDetail.getProId());
         detail.setPcId(projectDetail.getPcId());
         detail.setBeginTime( beginTime==null?"":beginTime.trim());
         detail.setEndTime( endTime==null?"":endTime.trim());
         detail.setDnId(dnId);
         List<ProjectRoadWordDetail> prwd = projectRoadWordDetailService.getDetailByCreateTimeByWater(detail);
         if(prwd!=null&&prwd.size()>0){
           int row=1;
           if(prwd!=null&&prwd.size()>0){
             row=prwd.size();
           }
           buffer.append("<tr>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\" >"+projectDetail.getProNumber()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProSnapNumber()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProSerialNumber()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProSourceName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProNatureName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProEngineTypeName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProPeriodName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getProDeptName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+(projectDetail.getProStatus()==null?"":projectDetail.getProStatus()==1?"在施":projectDetail.getProStatus()==2?"待施":projectDetail.getProStatus()==3?"已完工":projectDetail.getProStatus()==4?"待转图":"")+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getPcDeptName()+"</td>");
           buffer.append("<td class=\"td\" rowspan=\""+row+"\">"+projectDetail.getPcAddress()+"</td>");
           if(prwd==null||prwd.size()<=0){
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
           }
           if(prwd!=null&&prwd.size()>=1){
             ProjectRoadWordDetail selectByKey = projectRoadWordDetailService.selectByKey(prwd.get(0).getId());
             Dictionarydata selectByKey2 = dictdataService.selectByKey(selectByKey.getDnId());
             String red="";
             String red1="";
             if(selectByKey2.getDictdataName()!=null){
               if(Integer.parseInt(selectByKey2.getDictdataName().substring(2, selectByKey2.getDictdataName().length()))>=300&&selectByKey.getDetailStopWater()!=null&&selectByKey.getDetailStopWater()==1){
                 red1="style=\"background-color:red;\"";
               }
             }
             buffer.append("<td class=\"td\" >"+prwd.get(0).getCreateTime()+"</td>");
             buffer.append("<td class=\"td\" >"+selectByKey2.getDictdataName()+"</td>");
             buffer.append("<td class=\"td\" "+red1+">"+(selectByKey.getDetailStopWater()==1?"是":"否")+"</td>");
             buffer.append("<td class=\"td\" >"+(selectByKey.getDetailRinse()==1?"是":"否")+"</td>");
             if(selectByKey.getDetailGas()!=null&&selectByKey.getDetailGas()==1){
               red="style=\"background-color:red;\"";
             }
             buffer.append("<td class=\"td\" "+red+">"+(selectByKey.getDetailGas()==1?"是":"否")+"</td>");
           }
           buffer.append("</tr>");
           
           for (int k=1; k<prwd.size(); k++) {
             ProjectRoadWordDetail selectByKey = projectRoadWordDetailService.selectByKey(prwd.get(k).getId());
             Dictionarydata selectByKey2 = dictdataService.selectByKey(selectByKey.getDnId());
             String red="";
             String red1="";
             if(selectByKey2.getDictdataName()!=null){
               if(Integer.parseInt(selectByKey2.getDictdataName().substring(2, selectByKey2.getDictdataName().length()))>=300&&selectByKey.getDetailStopWater()!=null&&selectByKey.getDetailStopWater()==1){
                 red1="style=\"background-color:red;\"";
               }
             }
             buffer.append("<tr >");
             buffer.append("<td class=\"td\" >"+prwd.get(k).getCreateTime()+"</td>");
             buffer.append("<td class=\"td\"  >"+selectByKey2.getDictdataName()+"</td>");
             buffer.append("<td class=\"td\" "+red1+">"+(selectByKey.getDetailStopWater()==1?"是":"否")+"</td>");
             buffer.append("<td class=\"td\" >"+(selectByKey.getDetailRinse()==1?"是":"否")+"</td>");
             if(selectByKey.getDetailGas()!=null&&selectByKey.getDetailGas()==1){
               red="style=\"background-color:red;\"";
             }
             buffer.append("<td class=\"td\" "+red+">"+(selectByKey.getDetailGas()==1?"是":"否")+"</td>");
             buffer.append("</tr>");
          }
           
           
         }
       }
       
       
      
    }
     
     
    buffer.append("<table>");
    
    List<Dictionarydata>  dd= dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dd);
    Dept dptt=new Dept(); 
    dptt.setParentCode("sgdw");
    List<Dept> dpt = deptService.selectAllDept(dptt, null);
    request.setAttribute("dept", dpt);
    request.setAttribute("html", buffer.toString().replaceAll("null", ""));
    request.setAttribute("proName", proName);
    request.setAttribute("proNumber", proNumber);
    request.setAttribute("proSerialNumber",proSerialNumber);
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);
    return "day/water";
  }
  @RequestMapping("/dayTotal/{menuName}/{id}")
  public String dayTotal(HttpServletRequest request,HttpServletResponse response,String proName,String proNumber,String proSerialNumber,String beginTime,String endTime,Integer proStatus,String proContractNumber,String proDeptName,String pcDeptName,String proEngineTypeName,String proSourceName,String proNatureName,String proPeriodName){
    Map<String,Object> map=new HashMap<String, Object>();
    map.put("proName", proName==null?"":proName.trim());
    map.put("proNumber", proNumber==null?"":proNumber.trim());
    /*Integer proStatus,String proContractNumber,String proDeptName,String pcDeptName,
    String proEngineTypeName,
    String proSourceName,String proNatureName,String proPeriodName*/
    map.put("proSerialNumber", proSerialNumber==null?"":proSerialNumber.trim());
    map.put("proStatus", proStatus);
    map.put("proContractNumber", proContractNumber==null?"":proContractNumber.trim());
    map.put("proDeptName", proDeptName==null?"":proDeptName.trim());
    Session session = SecurityUtils.getSubject().getSession();
    User user = (User)session.getAttribute("userSession");
    Dept selectByKey = deptService.selectByKey(user.getDeptId());
    if(!selectByKey.getCode().toUpperCase().equals("SCK")){
      map.put("pcDeptName",user.getDeptId());
    }else{
      map.put("pcDeptName", pcDeptName==null?"":pcDeptName.trim());
    }
    map.put("proEngineTypeName", proEngineTypeName==null?"":proEngineTypeName.trim());
    map.put("proSourceName", proSourceName==null?"":proSourceName.trim());
    map.put("proNatureName", proNatureName==null?"":proNatureName.trim());
    map.put("proPeriodName", proPeriodName==null?"":proPeriodName.trim());
    
    
    request.setAttribute("proStatus", proStatus);
    request.setAttribute("proContractNumber", proContractNumber);
    request.setAttribute("proDeptName", proDeptName);
    request.setAttribute("pcDeptName", pcDeptName);
    request.setAttribute("proEngineTypeName", proEngineTypeName);
    request.setAttribute("proSourceName", proSourceName);
    request.setAttribute("proNatureName", proNatureName);
    request.setAttribute("proPeriodName", proPeriodName);
    
    List<Dictionarydata>  dd= dictdataService.selectDictdataByParentId(null, null);
    request.setAttribute("dicts", dd);
    Dept dptt=new Dept(); 
    dptt.setParentCode("sgdw");
    List<Dept> dpt = deptService.selectAllDept(dptt, null);
    request.setAttribute("dept", dpt);
    
    
    StringBuffer buffer=new StringBuffer();
    buffer.append("<table id=\"tbHaederText\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"border-collapse: collapse; word-break: keep-all; border-color: Black;width: 100%;\">");
    buffer.append("<tr>");//第一行
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>工号</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>临时工号</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>序号</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap align=\"center\">工程来源</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap align=\"center\">工程性质</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap align=\"center\">工程类别</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>期次</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>合同编号</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>合同名称</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\" style=\"width:300px;\"  nowrap>工程进展问题</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>转入单位</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>项目状态</td>");
    
    
    
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>实际开工时间</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>实际竣工时间</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>施工单位</td>");
    buffer.append("<td class=\"th\" rowspan=\"2\"  nowrap>设计长度</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>DMA(个数)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>倒流防止器(个数)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>工作量(长度)</td>");
    
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>消火栓</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>排气阀</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>测流</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>一级水表(普通)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>一级水表（高精)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>二级水表(普通)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>二级水表（高精)</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>截门</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>闸门</td>");
    buffer.append("<td class=\"th\" align=\"center\" colspan=\"2\"  nowrap>流量计</td>");
    buffer.append("</tr>");
    buffer.append("<tr>");//第二行
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">当前实际完成(小计)</td>");
    buffer.append("<td class=\"th\"  nowrap  align=\"center\">次日计划完成(小计)</td>");
    buffer.append("</tr>");
    
    
    
    List<ProjectDetail> orderDay = roadWorkDailyService.getOrderDay(map);
    if(orderDay!=null&&orderDay.size()>0){
       for (ProjectDetail projectDetail : orderDay) {
         ProjectRoadWordDetail detail=new ProjectRoadWordDetail();
         detail.setProId(projectDetail.getProId());
         detail.setPcId(projectDetail.getPcId());
         detail.setBeginTime( beginTime==null?"":beginTime.trim());
         detail.setEndTime( endTime==null?"":endTime.trim());
         List<ProjectRoadWordDetail> prwd = projectRoadWordDetailService.getDetailByCreateTime(detail);
         if(prwd!=null&&prwd.size()>0){
           buffer.append("<tr>");
           buffer.append("<td class=\"td\"  >"+projectDetail.getProNumber()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProSnapNumber()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProSerialNumber()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProSourceName()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProNatureName()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProEngineTypeName()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProPeriodName()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProContractNumber()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getContractName()+"</td>");
           buffer.append("<td class=\"td\"  style=\"width:300px;word-wrap:break-word ;\">"+projectDetail.getPrwProgressReport()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProDeptName()+"</td>");
           buffer.append("<td class=\"td\" >"+(projectDetail.getProStatus()==null?"":projectDetail.getProStatus()==1?"在施":projectDetail.getProStatus()==2?"待施":projectDetail.getProStatus()==3?"已完工":projectDetail.getProStatus()==4?"待转图":"")+"</td>");

           buffer.append("<td class=\"td\" >"+projectDetail.getPrwAst()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getPrwAet()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getPcDeptName()+"</td>");
           buffer.append("<td class=\"td\" >"+projectDetail.getProDesignLength()+"</td>");
           
           ProjectRoadWordDetail detail1=new ProjectRoadWordDetail();
           detail1.setProId(projectDetail.getProId());
           detail1.setPcId(projectDetail.getPcId());
           detail1.setBeginTime( beginTime==null?"":beginTime.trim());
           detail1.setEndTime( endTime==null?"":endTime.trim());
           detail1.setDnIdName("GZL");
           List<ProjectRoadWordDetail> detailBySum = projectRoadWordDetailService.getDetailBySum(detail1);
           if(detailBySum!=null&&detailBySum.size()>0&&detailBySum.get(0)!=null){
             buffer.append("<td class=\"td\" >"+detailBySum.get(0).getDetailDma()+"</td>");
             buffer.append("<td class=\"td\" >"+detailBySum.get(0).getDetailNextDma()+"</td>");
             buffer.append("<td class=\"td\" >"+detailBySum.get(0).getDetailAnti()+"</td>");
             buffer.append("<td class=\"td\" >"+detailBySum.get(0).getDetailNextAnti()+"</td>");       
             buffer.append("<td class=\"td\" >"+detailBySum.get(0).getDetailDay()+"</td>");
             buffer.append("<td class=\"td\" >"+detailBySum.get(0).getDetailNextDay()+"</td>");
               
           }else{
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
             buffer.append("<td class=\"td\" ></td>");
               
           }
          
           total(buffer,"XHS",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"PQF",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"CL",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"YJSBPT",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"YJSBGJ",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"EJSBPT",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"EJSBGJ",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"JJM",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"ZM",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           total(buffer,"LLJ",projectDetail.getProId(),projectDetail.getPcId(),beginTime,endTime);
           
           buffer.append("</tr>");
         }
       }
    }
    
    
    buffer.append("</table>");
    request.setAttribute("html", buffer.toString().replaceAll("null", ""));
    request.setAttribute("proName", proName);
    request.setAttribute("proNumber", proNumber);
    request.setAttribute("proSerialNumber",proSerialNumber);
    request.setAttribute("beginTime", beginTime);
    request.setAttribute("endTime", endTime);
    
    return "day/dayTotal";
  }
  
  public void total(StringBuffer buffer,String code,Integer proId,Integer pcId,String beginTime,String endTime){
    ProjectRoadWordDetail detail1=new ProjectRoadWordDetail();
    detail1.setProId(proId);
    detail1.setPcId(pcId);
    detail1.setDnIdName(code);
    detail1.setBeginTime( beginTime==null?"":beginTime.trim());
    detail1.setEndTime( endTime==null?"":endTime.trim());
    List<ProjectRoadWordDetail> detailBySum = projectRoadWordDetailService.getDetailBySum(detail1);
    if(detailBySum!=null&&detailBySum.size()>0){
      buffer.append("<td class=\"td\" >"+detailBySum.get(0).getDetailDay()+"</td>");
      buffer.append("<td class=\"td\" >"+detailBySum.get(0).getDetailNextDay()+"</td>");
        
    }else{
      buffer.append("<td class=\"td\" ></td>");
      buffer.append("<td class=\"td\" ></td>");
    }
  }
  
}
