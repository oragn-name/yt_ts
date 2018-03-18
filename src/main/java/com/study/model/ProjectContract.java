package com.study.model;

import javax.persistence.*;

@Table(name = "project_contract")
public class ProjectContract {
    @Id
    @Column(name = "contract_id")
    private Integer contractId;

    /**
     * 工程预算价
     */
    @Column(name = "contract_budget_price")
    private Double contractBudgetPrice;

    /**
     * 预算编制人
     */
    @Column(name = "contract_budget_price_user")
    private String contractBudgetPriceUser;

    /**
     * 招投标时间
     */
    @Column(name = "contract_bidding_time")
    private String contractBiddingTime;

    /**
     * 有无合同 1有 0无
     */
    @Column(name = "contract_type")
    private Integer contractType;

    /**
     * 合同号
     */
    @Column(name = "contract_number")
    private String contractNumber;

    /**
     * 是否单独合同
     */
    @Column(name = "contract_alone")
    private Integer contractAlone;

    /**
     * 原合同工程编号
     */
    @Column(name = "contract_pro_number")
    private String contractProNumber;

    /**
     * 合同归档日期
     */
    @Column(name = "contract_arch_time")
    private String contractArchTime;

    /**
     * 合同备注
     */
    @Column(name = "contract_remark")
    private String contractRemark;

    /**
     * 合同性质 
     */
    @Column(name = "contract_natrue")
    private Integer contractNatrue;
    @Transient
    private String contractNatrueName;
    

    /**
     * 合同金额
     */
    @Column(name = "contract_money")
    private Double contractMoney;

    /**
     * 是否招投标，1 是，0否
     */
    @Column(name = "contract_bidding_type")
    private Integer contractBiddingType;

    /**
     * 合同审核意见
     */
    @Column(name = "contract_advice")
    private String contractAdvice;

    /**
     * 合同审核人
     */
    @Column(name = "contract_check_user")
    private String contractCheckUser;

    /**
     * 合同审核时间
     */
    @Column(name = "contract_check_time")
    private String contractCheckTime;

    /**
     * 合同签订日期
     */
    @Column(name = "contract_sign_time")
    private String contractSignTime;

    /**
     * 合同盖章日期
     */
    @Column(name = "contract_stamp_time")
    private String contractStampTime;

    /**
     * 合同返回日期
     */
    @Column(name = "contract_back_time")
    private String contractBackTime;

    /**
     * 合同返回经手人
     */
    @Column(name = "contract_back_user")
    private String contractBackUser;

    /**
     * 合同签订人
     */
    @Column(name = "contract_sign_user")
    private String contractSignUser;

    /**
     * 工期
     */
    @Column(name = "contract_dur")
    private String contractDur;

    /**
     * 印花税金额
     */
    @Column(name = "contract_duty")
    private Double contractDuty;

    /**
     * 贴税日期
     */
    @Column(name = "contract_duty_time")
    private String contractDutyTime;

    @Column(name = "contract_create_user")
    private Integer contractCreateUser;
    
    @Column(name = "contract_create_time")
    private String contractCreateTime;
    
    
    
    
    /**
     * @return contract_id
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * @param contractId
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * 获取工程预算价
     *
     * @return contract_budget_price - 工程预算价
     */
    public Double getContractBudgetPrice() {
        return contractBudgetPrice;
    }

    /**
     * 设置工程预算价
     *
     * @param contractBudgetPrice 工程预算价
     */
    public void setContractBudgetPrice(Double contractBudgetPrice) {
        this.contractBudgetPrice = contractBudgetPrice;
    }

    /**
     * 获取预算编制人
     *
     * @return contract_budget_price_user - 预算编制人
     */
    public String getContractBudgetPriceUser() {
        return contractBudgetPriceUser;
    }

    /**
     * 设置预算编制人
     *
     * @param contractBudgetPriceUser 预算编制人
     */
    public void setContractBudgetPriceUser(String contractBudgetPriceUser) {
        this.contractBudgetPriceUser = contractBudgetPriceUser;
    }

    /**
     * 获取招投标时间
     *
     * @return contract_bidding_time - 招投标时间
     */
    public String getContractBiddingTime() {
        return contractBiddingTime;
    }

    /**
     * 设置招投标时间
     *
     * @param contractBiddingTime 招投标时间
     */
    public void setContractBiddingTime(String contractBiddingTime) {
        this.contractBiddingTime = contractBiddingTime;
    }

    /**
     * 获取有无合同 1有 0无
     *
     * @return contract_type - 有无合同 1有 0无
     */
    public Integer getContractType() {
        return contractType;
    }

    /**
     * 设置有无合同 1有 0无
     *
     * @param contractType 有无合同 1有 0无
     */
    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    /**
     * 获取合同号
     *
     * @return contract_number - 合同号
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * 设置合同号
     *
     * @param contractNumber 合同号
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * 获取是否单独合同
     *
     * @return contract_alone - 是否单独合同
     */
    public Integer getContractAlone() {
        return contractAlone;
    }

    /**
     * 设置是否单独合同
     *
     * @param contractAlone 是否单独合同
     */
    public void setContractAlone(Integer contractAlone) {
        this.contractAlone = contractAlone;
    }

    /**
     * 获取原合同工程编号
     *
     * @return contract_pro_number - 原合同工程编号
     */
    public String getContractProNumber() {
        return contractProNumber;
    }

    /**
     * 设置原合同工程编号
     *
     * @param contractProNumber 原合同工程编号
     */
    public void setContractProNumber(String contractProNumber) {
        this.contractProNumber = contractProNumber;
    }

    /**
     * 获取合同归档日期
     *
     * @return contract_arch_time - 合同归档日期
     */
    public String getContractArchTime() {
        return contractArchTime;
    }

    /**
     * 设置合同归档日期
     *
     * @param contractArchTime 合同归档日期
     */
    public void setContractArchTime(String contractArchTime) {
        this.contractArchTime = contractArchTime;
    }

    /**
     * 获取合同备注
     *
     * @return contract_remark - 合同备注
     */
    public String getContractRemark() {
        return contractRemark;
    }

    /**
     * 设置合同备注
     *
     * @param contractRemark 合同备注
     */
    public void setContractRemark(String contractRemark) {
        this.contractRemark = contractRemark;
    }

    /**
     * 获取合同性质 
     *
     * @return contract_natrue - 合同性质 
     */
    public Integer getContractNatrue() {
        return contractNatrue;
    }

    /**
     * 设置合同性质 
     *
     * @param contractNatrue 合同性质 
     */
    public void setContractNatrue(Integer contractNatrue) {
        this.contractNatrue = contractNatrue;
    }

    /**
     * 获取合同金额
     *
     * @return contract_money - 合同金额
     */
    public Double getContractMoney() {
        return contractMoney;
    }

    /**
     * 设置合同金额
     *
     * @param contractMoney 合同金额
     */
    public void setContractMoney(Double contractMoney) {
        this.contractMoney = contractMoney;
    }

    /**
     * 获取是否招投标，1 是，0否
     *
     * @return contract_bidding_type - 是否招投标，1 是，0否
     */
    public Integer getContractBiddingType() {
        return contractBiddingType;
    }

    /**
     * 设置是否招投标，1 是，0否
     *
     * @param contractBiddingType 是否招投标，1 是，0否
     */
    public void setContractBiddingType(Integer contractBiddingType) {
        this.contractBiddingType = contractBiddingType;
    }

    /**
     * 获取合同审核意见
     *
     * @return contract_advice - 合同审核意见
     */
    public String getContractAdvice() {
        return contractAdvice;
    }

    /**
     * 设置合同审核意见
     *
     * @param contractAdvice 合同审核意见
     */
    public void setContractAdvice(String contractAdvice) {
        this.contractAdvice = contractAdvice;
    }

    /**
     * 获取合同审核人
     *
     * @return contract_check_user - 合同审核人
     */
    public String getContractCheckUser() {
        return contractCheckUser;
    }

    /**
     * 设置合同审核人
     *
     * @param contractCheckUser 合同审核人
     */
    public void setContractCheckUser(String contractCheckUser) {
        this.contractCheckUser = contractCheckUser;
    }

    /**
     * 获取合同审核时间
     *
     * @return contract_check_time - 合同审核时间
     */
    public String getContractCheckTime() {
        return contractCheckTime;
    }

    /**
     * 设置合同审核时间
     *
     * @param contractCheckTime 合同审核时间
     */
    public void setContractCheckTime(String contractCheckTime) {
        this.contractCheckTime = contractCheckTime;
    }

    /**
     * 获取合同签订日期
     *
     * @return contract_sign_time - 合同签订日期
     */
    public String getContractSignTime() {
        return contractSignTime;
    }

    /**
     * 设置合同签订日期
     *
     * @param contractSignTime 合同签订日期
     */
    public void setContractSignTime(String contractSignTime) {
        this.contractSignTime = contractSignTime;
    }

    /**
     * 获取合同盖章日期
     *
     * @return contract_stamp_time - 合同盖章日期
     */
    public String getContractStampTime() {
        return contractStampTime;
    }

    /**
     * 设置合同盖章日期
     *
     * @param contractStampTime 合同盖章日期
     */
    public void setContractStampTime(String contractStampTime) {
        this.contractStampTime = contractStampTime;
    }

    /**
     * 获取合同返回日期
     *
     * @return contract_back_time - 合同返回日期
     */
    public String getContractBackTime() {
        return contractBackTime;
    }

    /**
     * 设置合同返回日期
     *
     * @param contractBackTime 合同返回日期
     */
    public void setContractBackTime(String contractBackTime) {
        this.contractBackTime = contractBackTime;
    }

    /**
     * 获取合同返回经手人
     *
     * @return contract_back_user - 合同返回经手人
     */
    public String getContractBackUser() {
        return contractBackUser;
    }

    /**
     * 设置合同返回经手人
     *
     * @param contractBackUser 合同返回经手人
     */
    public void setContractBackUser(String contractBackUser) {
        this.contractBackUser = contractBackUser;
    }

    /**
     * 获取合同签订人
     *
     * @return contract_sign_user - 合同签订人
     */
    public String getContractSignUser() {
        return contractSignUser;
    }

    /**
     * 设置合同签订人
     *
     * @param contractSignUser 合同签订人
     */
    public void setContractSignUser(String contractSignUser) {
        this.contractSignUser = contractSignUser;
    }

    /**
     * 获取工期
     *
     * @return contract_dur - 工期
     */
    public String getContractDur() {
        return contractDur;
    }

    /**
     * 设置工期
     *
     * @param contractDur 工期
     */
    public void setContractDur(String contractDur) {
        this.contractDur = contractDur;
    }

    /**
     * 获取印花税金额
     *
     * @return contract_duty - 印花税金额
     */
    public Double getContractDuty() {
        return contractDuty;
    }

    /**
     * 设置印花税金额
     *
     * @param contractDuty 印花税金额
     */
    public void setContractDuty(Double contractDuty) {
        this.contractDuty = contractDuty;
    }

    /**
     * 获取贴税日期
     *
     * @return contract_duty_time - 贴税日期
     */
    public String getContractDutyTime() {
        return contractDutyTime;
    }

    /**
     * 设置贴税日期
     *
     * @param contractDutyTime 贴税日期
     */
    public void setContractDutyTime(String contractDutyTime) {
        this.contractDutyTime = contractDutyTime;
    }

    public Integer getContractCreateUser() {
      return contractCreateUser;
    }

    public void setContractCreateUser(Integer contractCreateUser) {
      this.contractCreateUser = contractCreateUser;
    }

    public String getContractCreateTime() {
      return contractCreateTime;
    }

    public void setContractCreateTime(String contractCreateTime) {
      this.contractCreateTime = contractCreateTime;
    }

    public String getContractNatrueName() {
      return contractNatrueName;
    }

    public void setContractNatrueName(String contractNatrueName) {
      this.contractNatrueName = contractNatrueName;
    }
    
    
}