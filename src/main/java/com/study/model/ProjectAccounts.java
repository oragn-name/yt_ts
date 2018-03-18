package com.study.model;

import javax.persistence.*;

@Table(name = "project_accounts")
public class ProjectAccounts {
    @Id
    @Column(name = "accounts_id")
    private Integer accountsId;

    /**
     * 结算金额
     */
    @Column(name = "accounts_money")
    private Double accountsMoney;

    /**
     * 项目id
     */
    @Column(name = "pro_id")
    private Integer proId;

    /**
     * 结算日期
     */
    @Column(name = "accounts_time")
    private String accountsTime;

    /**
     * 创建人
     */
    @Column(name = "accounts_create_user")
    private Integer accountsCreateUser;

    /**
     * 创建时间
     */
    @Column(name = "accounts_create_time")
    private String accountsCreateTime;

    /**
     * 备注
     */
    @Column(name = "accounts_remark")
    private String accountsRemark;
    
    @Transient
    private String proNumber;//项目工号
    @Transient
    private String proConstName;//项目施工单位
    @Transient
    private String proDeptName;//项目转入单位、劳务单位
    @Transient
    private Double prwBudget;//预算金额
    @Transient
    private String prwRoadName;//所属道路名称
    
    
    
    
    
    /**
     * @return accounts_id
     */
    public Integer getAccountsId() {
        return accountsId;
    }

    /**
     * @param accountsId
     */
    public void setAccountsId(Integer accountsId) {
        this.accountsId = accountsId;
    }

    /**
     * 获取结算金额
     *
     * @return accounts_money - 结算金额
     */
    public Double getAccountsMoney() {
        return accountsMoney;
    }

    /**
     * 设置结算金额
     *
     * @param accountsMoney 结算金额
     */
    public void setAccountsMoney(Double accountsMoney) {
        this.accountsMoney = accountsMoney;
    }

    /**
     * 获取项目id
     *
     * @return pro_id - 项目id
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * 设置项目id
     *
     * @param proId 项目id
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * 获取结算日期
     *
     * @return accounts_time - 结算日期
     */
    public String getAccountsTime() {
        return accountsTime;
    }

    /**
     * 设置结算日期
     *
     * @param accountsTime 结算日期
     */
    public void setAccountsTime(String accountsTime) {
        this.accountsTime = accountsTime;
    }

    /**
     * 获取创建人
     *
     * @return accounts_create_user - 创建人
     */
    public Integer getAccountsCreateUser() {
        return accountsCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param accountsCreateUser 创建人
     */
    public void setAccountsCreateUser(Integer accountsCreateUser) {
        this.accountsCreateUser = accountsCreateUser;
    }

    /**
     * 获取创建时间
     *
     * @return accounts_create_time - 创建时间
     */
    public String getAccountsCreateTime() {
        return accountsCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param accountsCreateTime 创建时间
     */
    public void setAccountsCreateTime(String accountsCreateTime) {
        this.accountsCreateTime = accountsCreateTime;
    }

    /**
     * 获取备注
     *
     * @return accounts_remark - 备注
     */
    public String getAccountsRemark() {
        return accountsRemark;
    }

    /**
     * 设置备注
     *
     * @param accountsRemark 备注
     */
    public void setAccountsRemark(String accountsRemark) {
        this.accountsRemark = accountsRemark;
    }

    public String getProNumber() {
      return proNumber;
    }

    public void setProNumber(String proNumber) {
      this.proNumber = proNumber;
    }

    public String getProConstName() {
      return proConstName;
    }

    public void setProConstName(String proConstName) {
      this.proConstName = proConstName;
    }

    public String getProDeptName() {
      return proDeptName;
    }

    public void setProDeptName(String proDeptName) {
      this.proDeptName = proDeptName;
    }

    public Double getPrwBudget() {
      return prwBudget;
    }

    public void setPrwBudget(Double prwBudget) {
      this.prwBudget = prwBudget;
    }

    public String getPrwRoadName() {
      return prwRoadName;
    }

    public void setPrwRoadName(String prwRoadName) {
      this.prwRoadName = prwRoadName;
    }
    
}