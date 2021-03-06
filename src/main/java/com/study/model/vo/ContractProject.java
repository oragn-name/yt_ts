package com.study.model.vo;

import javax.persistence.Column;

public class ContractProject {
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
	   
	   private String contractNumber; //合同编号
	   private String proDeptName; //转入单位
	   
	   private String contractMoney;
	   
	   private String contractSignTime;
	   private Integer contractSource;
	   private Integer proId;
	   private String contractName;//合同名称
	   private String gzl;
	   
	   
	    private Integer pcsYear;

	    private String pcsMonth;

	    private Double pcsLength;

	    private Double pcsMoney;

	    private String pcsRemark;

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


	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getProDeptName() {
		return proDeptName;
	}

	public void setProDeptName(String proDeptName) {
		this.proDeptName = proDeptName;
	}

	public String getContractMoney() {
		return contractMoney;
	}

	public void setContractMoney(String contractMoney) {
		this.contractMoney = contractMoney;
	}

	public String getContractSignTime() {
		return contractSignTime;
	}

	public void setContractSignTime(String contractSignTime) {
		this.contractSignTime = contractSignTime;
	}

	public Integer getContractSource() {
		return contractSource;
	}

	public void setContractSource(Integer contractSource) {
		this.contractSource = contractSource;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Integer getPcsYear() {
		return pcsYear;
	}

	public void setPcsYear(Integer pcsYear) {
		this.pcsYear = pcsYear;
	}

	public String getPcsMonth() {
		return pcsMonth;
	}

	public void setPcsMonth(String pcsMonth) {
		this.pcsMonth = pcsMonth;
	}

	public Double getPcsLength() {
		return pcsLength;
	}

	public void setPcsLength(Double pcsLength) {
		this.pcsLength = pcsLength;
	}

	public Double getPcsMoney() {
		return pcsMoney;
	}

	public void setPcsMoney(Double pcsMoney) {
		this.pcsMoney = pcsMoney;
	}

	public String getPcsRemark() {
		return pcsRemark;
	}

	public void setPcsRemark(String pcsRemark) {
		this.pcsRemark = pcsRemark;
	}

	public String getGzl() {
		return gzl;
	}

	public void setGzl(String gzl) {
		this.gzl = gzl;
	}
	   
	   
	   
}
