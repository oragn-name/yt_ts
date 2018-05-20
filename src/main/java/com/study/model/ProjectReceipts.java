package com.study.model;

import javax.persistence.*;

@Table(name = "project_receipts")
public class ProjectReceipts {
    @Id
    @Column(name = "receipts_id")
    private Integer receiptsId;

    /**
     * 项目id
     */
    @Column(name = "pro_id")
    private Integer proId;

    /**
     * 收款金额
     */
    @Column(name = "receipts_money")
    private Double receiptsMoney;

    /**
     * 收款时间
     */
    @Column(name = "receipts_time")
    private String receiptsTime;

    /**
     * 交款单位
     */
    @Column(name = "receipts_unit")
    private String receiptsUnit;

    /**
     * 收款经手人
     */
    @Column(name = "receipts_user")
    private String receiptsUser;

    /**
     * 创建人
     */
    @Column(name = "receipts_create_user")
    private Integer receiptsCreateUser;

    /**
     * 创建时间
     */
    @Column(name = "receipts_create_time")
    private String receiptsCreateTime;

    /**
     * 工程来源，1集团内，2集团外
     */
    @Column(name = "receipts_source")
    private Integer receiptsSource;
    
    /**
     * 施工单位id
     */
    @Column(name = "pc_id")
    private Integer pcId;

    @Column(name = "receipts_remark")
    private String receiptsRemark;

    
    
    /**
     * @return receipts_id
     */
    public Integer getReceiptsId() {
        return receiptsId;
    }

    /**
     * @param receiptsId
     */
    public void setReceiptsId(Integer receiptsId) {
        this.receiptsId = receiptsId;
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
     * 获取收款金额
     *
     * @return receipts_money - 收款金额
     */
    public Double getReceiptsMoney() {
        return receiptsMoney;
    }

    /**
     * 设置收款金额
     *
     * @param receiptsMoney 收款金额
     */
    public void setReceiptsMoney(Double receiptsMoney) {
        this.receiptsMoney = receiptsMoney;
    }

    /**
     * 获取收款时间
     *
     * @return receipts_time - 收款时间
     */
    public String getReceiptsTime() {
        return receiptsTime;
    }

    /**
     * 设置收款时间
     *
     * @param receiptsTime 收款时间
     */
    public void setReceiptsTime(String receiptsTime) {
        this.receiptsTime = receiptsTime;
    }

    /**
     * 获取交款单位
     *
     * @return receipts_unit - 交款单位
     */
    public String getReceiptsUnit() {
        return receiptsUnit;
    }

    /**
     * 设置交款单位
     *
     * @param receiptsUnit 交款单位
     */
    public void setReceiptsUnit(String receiptsUnit) {
        this.receiptsUnit = receiptsUnit;
    }

    /**
     * 获取收款经手人
     *
     * @return receipts_user - 收款经手人
     */
    public String getReceiptsUser() {
        return receiptsUser;
    }

    /**
     * 设置收款经手人
     *
     * @param receiptsUser 收款经手人
     */
    public void setReceiptsUser(String receiptsUser) {
        this.receiptsUser = receiptsUser;
    }

    /**
     * 获取创建人
     *
     * @return receipts_create_user - 创建人
     */
    public Integer getReceiptsCreateUser() {
        return receiptsCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param receiptsCreateUser 创建人
     */
    public void setReceiptsCreateUser(Integer receiptsCreateUser) {
        this.receiptsCreateUser = receiptsCreateUser;
    }

    /**
     * 获取创建时间
     *
     * @return receipts_create_time - 创建时间
     */
    public String getReceiptsCreateTime() {
        return receiptsCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param receiptsCreateTime 创建时间
     */
    public void setReceiptsCreateTime(String receiptsCreateTime) {
        this.receiptsCreateTime = receiptsCreateTime;
    }

    /**
     * 获取工程来源，1集团内，2集团外
     *
     * @return receipts_source - 工程来源，1集团内，2集团外
     */
    public Integer getReceiptsSource() {
        return receiptsSource;
    }

    /**
     * 设置工程来源，1集团内，2集团外
     *
     * @param receiptsSource 工程来源，1集团内，2集团外
     */
    public void setReceiptsSource(Integer receiptsSource) {
        this.receiptsSource = receiptsSource;
    }

    public Integer getPcId() {
      return pcId;
    }

    public void setPcId(Integer pcId) {
      this.pcId = pcId;
    }

    public String getReceiptsRemark() {
      return receiptsRemark;
    }

    public void setReceiptsRemark(String receiptsRemark) {
      this.receiptsRemark = receiptsRemark;
    }
    
    
    
}