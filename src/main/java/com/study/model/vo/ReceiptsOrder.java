package com.study.model.vo;

import javax.persistence.Column;

public class ReceiptsOrder {
  private String proNumber;//工号
  
  private String proSnapNumber;//临时工号
  
  private String proSerialNumber;//序号
  
  private String proName;//项目名称
  
  private String proSourceName;//工程来源
  
  private String proNatureName;//工程性质
  
  private String proEngineTypeName;//工程类别
  
  private String proPeriodName;//期次
  
  private String prwAst;//实际开工时间
  
  private String prwAet;//实际竣工时间
  
  private String dateTime;//日期
  
  private String pcDeptName;//施工单位
  
  private Double prwBudget;//预算
  
  private Double proDesignLength;//设计长度
  
  private Integer proStatus;//项目状态
  
  private String proContractNumber; //合同编号
  private String proDeptName; //转入单位
  
  private String prwProgressReport;//工程进展问题
  
  private String contractName;//合同名称
  
  private String pcAddress;

  private Integer pcId;
  
  private Integer proId;
  
  private Double receiptsMoney;

  /**
   * 收款时间
   */
  private String receiptsTime;

  /**
   * 交款单位
   */
  private String receiptsUnit;

  /**
   * 收款经手人
   */
  private String receiptsUser;


  /**
   * 工程来源，1集团内，2集团外
   */
  private Integer receiptsSource;
  
  private String receiptsRemark;

  public String getProNumber() {
    return proNumber;
  }

  public void setProNumber(String proNumber) {
    this.proNumber = proNumber;
  }

  public String getProSnapNumber() {
    return proSnapNumber;
  }

  public void setProSnapNumber(String proSnapNumber) {
    this.proSnapNumber = proSnapNumber;
  }

  public String getProSerialNumber() {
    return proSerialNumber;
  }

  public void setProSerialNumber(String proSerialNumber) {
    this.proSerialNumber = proSerialNumber;
  }

  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }

  public String getProSourceName() {
    return proSourceName;
  }

  public void setProSourceName(String proSourceName) {
    this.proSourceName = proSourceName;
  }

  public String getProNatureName() {
    return proNatureName;
  }

  public void setProNatureName(String proNatureName) {
    this.proNatureName = proNatureName;
  }

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

  public String getPrwAst() {
    return prwAst;
  }

  public void setPrwAst(String prwAst) {
    this.prwAst = prwAst;
  }

  public String getPrwAet() {
    return prwAet;
  }

  public void setPrwAet(String prwAet) {
    this.prwAet = prwAet;
  }

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public String getPcDeptName() {
    return pcDeptName;
  }

  public void setPcDeptName(String pcDeptName) {
    this.pcDeptName = pcDeptName;
  }

  public Double getPrwBudget() {
    return prwBudget;
  }

  public void setPrwBudget(Double prwBudget) {
    this.prwBudget = prwBudget;
  }

  public Double getProDesignLength() {
    return proDesignLength;
  }

  public void setProDesignLength(Double proDesignLength) {
    this.proDesignLength = proDesignLength;
  }

  public Integer getProStatus() {
    return proStatus;
  }

  public void setProStatus(Integer proStatus) {
    this.proStatus = proStatus;
  }

  public String getProContractNumber() {
    return proContractNumber;
  }

  public void setProContractNumber(String proContractNumber) {
    this.proContractNumber = proContractNumber;
  }

  public String getProDeptName() {
    return proDeptName;
  }

  public void setProDeptName(String proDeptName) {
    this.proDeptName = proDeptName;
  }

  public String getPrwProgressReport() {
    return prwProgressReport;
  }

  public void setPrwProgressReport(String prwProgressReport) {
    this.prwProgressReport = prwProgressReport;
  }

  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public String getPcAddress() {
    return pcAddress;
  }

  public void setPcAddress(String pcAddress) {
    this.pcAddress = pcAddress;
  }

  public Integer getPcId() {
    return pcId;
  }

  public void setPcId(Integer pcId) {
    this.pcId = pcId;
  }

  public Integer getProId() {
    return proId;
  }

  public void setProId(Integer proId) {
    this.proId = proId;
  }

  public Double getReceiptsMoney() {
    return receiptsMoney;
  }

  public void setReceiptsMoney(Double receiptsMoney) {
    this.receiptsMoney = receiptsMoney;
  }

  public String getReceiptsTime() {
    return receiptsTime;
  }

  public void setReceiptsTime(String receiptsTime) {
    this.receiptsTime = receiptsTime;
  }

  public String getReceiptsUnit() {
    return receiptsUnit;
  }

  public void setReceiptsUnit(String receiptsUnit) {
    this.receiptsUnit = receiptsUnit;
  }

  public String getReceiptsUser() {
    return receiptsUser;
  }

  public void setReceiptsUser(String receiptsUser) {
    this.receiptsUser = receiptsUser;
  }

  public Integer getReceiptsSource() {
    return receiptsSource;
  }

  public void setReceiptsSource(Integer receiptsSource) {
    this.receiptsSource = receiptsSource;
  }

  public String getReceiptsRemark() {
    return receiptsRemark;
  }

  public void setReceiptsRemark(String receiptsRemark) {
    this.receiptsRemark = receiptsRemark;
  }
  
  
  
  
}
