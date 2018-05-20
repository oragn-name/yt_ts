package com.study.model;

import javax.persistence.*;

@Table(name = "project_package")
public class ProjectPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 合同类别
     */
    @Column(name = "pack_type")
    private Integer packType;
    @Transient
    private String packTypeName;
    @Transient
    private String packReadUnitName;

    /**
     * 分包编号
     */
    @Column(name = "pack_number")
    private String packNumber;

    /**
     * 工号
     */
    @Column(name = "pack_num")
    private String packNum;

    /**
     * 单位
     */
    @Column(name = "pack_unit")
    private String packUnit;

    /**
     * 金额
     */
    @Column(name = "pack_money")
    private Double packMoney;

    /**
     * 签订单位
     */
    @Column(name = "pack_read_unit")
    private Integer packReadUnit;

    /**
     * 签订时间
     */
    @Column(name = "pack_time")
    private String packTime;

    /**
     * 签订人
     */
    @Column(name = "pack_user")
    private String packUser;

    /**
     * 开工日期
     */
    @Column(name = "pack_begin_time")
    private String packBeginTime;

    /**
     * 竣工日期
     */
    @Column(name = "pack_end_time")
    private String packEndTime;

    /**
     * 工期
     */
    @Column(name = "pack_toal_time")
    private String packToalTime;

    /**
     * 备注
     */
    @Column(name = "pack_remark")
    private String packRemark;

    /**
     * 合同id
     */
    @Column(name = "pc_id")
    private Integer pcId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取合同类别
     *
     * @return pack_type - 合同类别
     */
    public Integer getPackType() {
        return packType;
    }

    /**
     * 设置合同类别
     *
     * @param packType 合同类别
     */
    public void setPackType(Integer packType) {
        this.packType = packType;
    }

    /**
     * 获取分包编号
     *
     * @return pack_number - 分包编号
     */
    public String getPackNumber() {
        return packNumber;
    }

    /**
     * 设置分包编号
     *
     * @param packNumber 分包编号
     */
    public void setPackNumber(String packNumber) {
        this.packNumber = packNumber;
    }

    /**
     * 获取工号
     *
     * @return pack_num - 工号
     */
    public String getPackNum() {
        return packNum;
    }

    /**
     * 设置工号
     *
     * @param packNum 工号
     */
    public void setPackNum(String packNum) {
        this.packNum = packNum;
    }

    /**
     * 获取单位
     *
     * @return pack_unit - 单位
     */
    public String getPackUnit() {
        return packUnit;
    }

    /**
     * 设置单位
     *
     * @param packUnit 单位
     */
    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    /**
     * 获取金额
     *
     * @return pack_money - 金额
     */
    public Double getPackMoney() {
        return packMoney;
    }

    /**
     * 设置金额
     *
     * @param packMoney 金额
     */
    public void setPackMoney(Double packMoney) {
        this.packMoney = packMoney;
    }

    /**
     * 获取签订单位
     *
     * @return pack_read_unit - 签订单位
     */
    public Integer getPackReadUnit() {
        return packReadUnit;
    }

    /**
     * 设置签订单位
     *
     * @param packReadUnit 签订单位
     */
    public void setPackReadUnit(Integer packReadUnit) {
        this.packReadUnit = packReadUnit;
    }

    /**
     * 获取签订时间
     *
     * @return pack_time - 签订时间
     */
    public String getPackTime() {
        return packTime;
    }

    /**
     * 设置签订时间
     *
     * @param packTime 签订时间
     */
    public void setPackTime(String packTime) {
        this.packTime = packTime;
    }

    /**
     * 获取签订人
     *
     * @return pack_user - 签订人
     */
    public String getPackUser() {
        return packUser;
    }

    /**
     * 设置签订人
     *
     * @param packUser 签订人
     */
    public void setPackUser(String packUser) {
        this.packUser = packUser;
    }

    /**
     * 获取开工日期
     *
     * @return pack_begin_time - 开工日期
     */
    public String getPackBeginTime() {
        return packBeginTime;
    }

    /**
     * 设置开工日期
     *
     * @param packBeginTime 开工日期
     */
    public void setPackBeginTime(String packBeginTime) {
        this.packBeginTime = packBeginTime;
    }

    /**
     * 获取竣工日期
     *
     * @return pack_end_time - 竣工日期
     */
    public String getPackEndTime() {
        return packEndTime;
    }

    /**
     * 设置竣工日期
     *
     * @param packEndTime 竣工日期
     */
    public void setPackEndTime(String packEndTime) {
        this.packEndTime = packEndTime;
    }

    /**
     * 获取工期
     *
     * @return pack_toal_time - 工期
     */
    public String getPackToalTime() {
        return packToalTime;
    }

    /**
     * 设置工期
     *
     * @param packToalTime 工期
     */
    public void setPackToalTime(String packToalTime) {
        this.packToalTime = packToalTime;
    }

    /**
     * 获取备注
     *
     * @return pack_remark - 备注
     */
    public String getPackRemark() {
        return packRemark;
    }

    /**
     * 设置备注
     *
     * @param packRemark 备注
     */
    public void setPackRemark(String packRemark) {
        this.packRemark = packRemark;
    }

    /**
     * 获取合同id
     *
     * @return pc_id - 合同id
     */
    public Integer getPcId() {
        return pcId;
    }

    /**
     * 设置合同id
     *
     * @param pcId 合同id
     */
    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    public String getPackTypeName() {
      return packTypeName;
    }

    public void setPackTypeName(String packTypeName) {
      this.packTypeName = packTypeName;
    }

    public String getPackReadUnitName() {
      return packReadUnitName;
    }

    public void setPackReadUnitName(String packReadUnitName) {
      this.packReadUnitName = packReadUnitName;
    }
    
    
}