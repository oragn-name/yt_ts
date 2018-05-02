package com.study.model.vo;

public class ProjectType {
 private String proEngineTypeName;//工程类别
  
  
  private String proPeriodName;//期次
  
  
  private Double prDmaTotal;//dma 当天总计
  
  private Double prDmaNextTotal;//dma 下一天总计
  
  private Double prwdTotal;// 倒流防止器 当天总计
  
  private Double prwdNextTotal;// 倒流防止器 下一天总计
  
private Double prwTotal;// 工作量 当天总计
  
  private Double prwNextTotal;// 工作量 下一天总计
  
  private Double dictdataLength;
  
  private Double dictdataNumber;
  
  private Double avg;
  
  private String beginTime;
  
  private String endTime;
  private Integer num;

  public String getProEngineTypeName() {
    return proEngineTypeName;
  }

  public void setProEngineTypeName(String proEngineTypeName) {
    this.proEngineTypeName = proEngineTypeName;
  }

  public String getProPeriodName() {
    return proPeriodName;
  }

  public void setProPeriodName(String proPeriodName) {
    this.proPeriodName = proPeriodName;
  }

  public double getPrDmaTotal() {
    return prDmaTotal;
  }

  public void setPrDmaTotal(double prDmaTotal) {
    this.prDmaTotal = prDmaTotal;
  }

  public double getPrDmaNextTotal() {
    return prDmaNextTotal;
  }

  public void setPrDmaNextTotal(double prDmaNextTotal) {
    this.prDmaNextTotal = prDmaNextTotal;
  }

  public double getPrwdTotal() {
    return prwdTotal;
  }

  public void setPrwdTotal(double prwdTotal) {
    this.prwdTotal = prwdTotal;
  }

  public double getPrwdNextTotal() {
    return prwdNextTotal;
  }

  public void setPrwdNextTotal(double prwdNextTotal) {
    this.prwdNextTotal = prwdNextTotal;
  }

  public Double getPrwTotal() {
    return prwTotal;
  }

  public void setPrwTotal(Double prwTotal) {
    this.prwTotal = prwTotal;
  }

  public Double getPrwNextTotal() {
    return prwNextTotal;
  }

  public void setPrwNextTotal(Double prwNextTotal) {
    this.prwNextTotal = prwNextTotal;
  }

  public void setPrDmaTotal(Double prDmaTotal) {
    this.prDmaTotal = prDmaTotal;
  }

  public void setPrDmaNextTotal(Double prDmaNextTotal) {
    this.prDmaNextTotal = prDmaNextTotal;
  }

  public void setPrwdTotal(Double prwdTotal) {
    this.prwdTotal = prwdTotal;
  }

  public void setPrwdNextTotal(Double prwdNextTotal) {
    this.prwdNextTotal = prwdNextTotal;
  }

  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public Double getDictdataLength() {
    return dictdataLength;
  }

  public void setDictdataLength(Double dictdataLength) {
    this.dictdataLength = dictdataLength;
  }

  public Double getDictdataNumber() {
    return dictdataNumber;
  }

  public void setDictdataNumber(Double dictdataNumber) {
    this.dictdataNumber = dictdataNumber;
  }

  public Double getAvg() {
    return avg;
  }

  public void setAvg(Double avg) {
    this.avg = avg;
  }
  
}
