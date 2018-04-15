package com.study.model;

import javax.persistence.*;

@Table(name = "project_road_word_detail")
public class ProjectRoadWordDetail {
    @Id
    private Integer id;

    /**
     * 施工单位id
     */
    @Column(name = "pc_id")
    private Integer pcId;

    /**
     * 项目id
     */
    @Column(name = "pro_id")
    private Integer proId;

    /**
     * 当日工作量长度
     */
    @Column(name = "detail_day")
    private Double detailDay;

    /**
     * 下一日工作量长度
     */
    @Column(name = "detail_next_day")
    private Double detailNextDay;

    /**
     * 当日dma个数
     */
    @Column(name = "detail_dma")
    private Double detailDma;

    /**
     * 下一日dma个数
     */
    @Column(name = "detail_next_dma")
    private Double detailNextDma;

    /**
     * 倒流防止器口径个数
     */
    @Column(name = "detail_anti")
    private Double detailAnti;

    /**
     * 下一日倒流防止器口径个数
     */
    @Column(name = "detail_next_anti")
    private Double detailNextAnti;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;
    
    @Column(name = "dn_id")
    private Integer dnId;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Integer createUser;
     /**
      * 创建人
      */
     @Column(name = "detail_remark")
     private Integer detailRemark;
     
     @Column(name = "detail_type")
     private Integer detailType;
     
     @Transient
     private String detailTypeName;
     @Transient
     private String dnIdName;
     @Transient
     private String userName;
     @Transient
     private String beginTime;
     @Transient
     private String endTime;
     

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
     * 获取施工单位id
     *
     * @return pc_id - 施工单位id
     */
    public Integer getPcId() {
        return pcId;
    }

    /**
     * 设置施工单位id
     *
     * @param pcId 施工单位id
     */
    public void setPcId(Integer pcId) {
        this.pcId = pcId;
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
     * 获取当日工作量长度
     *
     * @return detail_day - 当日工作量长度
     */
    public Double getDetailDay() {
        return detailDay;
    }

    /**
     * 设置当日工作量长度
     *
     * @param detailDay 当日工作量长度
     */
    public void setDetailDay(Double detailDay) {
        this.detailDay = detailDay;
    }

    /**
     * 获取下一日工作量长度
     *
     * @return detail_next_day - 下一日工作量长度
     */
    public Double getDetailNextDay() {
        return detailNextDay;
    }

    /**
     * 设置下一日工作量长度
     *
     * @param detailNextDay 下一日工作量长度
     */
    public void setDetailNextDay(Double detailNextDay) {
        this.detailNextDay = detailNextDay;
    }

    /**
     * 获取当日dma个数
     *
     * @return detail_dma - 当日dma个数
     */
    public Double getDetailDma() {
        return detailDma;
    }

    /**
     * 设置当日dma个数
     *
     * @param detailDma 当日dma个数
     */
    public void setDetailDma(Double detailDma) {
        this.detailDma = detailDma;
    }

    /**
     * 获取下一日dma个数
     *
     * @return detail_next_dma - 下一日dma个数
     */
    public Double getDetailNextDma() {
        return detailNextDma;
    }

    /**
     * 设置下一日dma个数
     *
     * @param detailNextDma 下一日dma个数
     */
    public void setDetailNextDma(Double detailNextDma) {
        this.detailNextDma = detailNextDma;
    }

    /**
     * 获取倒流防止器口径个数
     *
     * @return detail_anti - 倒流防止器口径个数
     */
    public Double getDetailAnti() {
        return detailAnti;
    }

    /**
     * 设置倒流防止器口径个数
     *
     * @param detailAnti 倒流防止器口径个数
     */
    public void setDetailAnti(Double detailAnti) {
        this.detailAnti = detailAnti;
    }

    /**
     * 获取下一日倒流防止器口径个数
     *
     * @return detail_next_anti - 下一日倒流防止器口径个数
     */
    public Double getDetailNextAnti() {
        return detailNextAnti;
    }

    /**
     * 设置下一日倒流防止器口径个数
     *
     * @param detailNextAnti 下一日倒流防止器口径个数
     */
    public void setDetailNextAnti(Double detailNextAnti) {
        this.detailNextAnti = detailNextAnti;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getDnId() {
      return dnId;
    }

    public void setDnId(Integer dnId) {
      this.dnId = dnId;
    }

    public Integer getDetailRemark() {
      return detailRemark;
    }

    public void setDetailRemark(Integer detailRemark) {
      this.detailRemark = detailRemark;
    }

    public String getDnIdName() {
      return dnIdName;
    }

    public void setDnIdName(String dnIdName) {
      this.dnIdName = dnIdName;
    }

    public String getUserName() {
      return userName;
    }

    public void setUserName(String userName) {
      this.userName = userName;
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

    public Integer getDetailType() {
      return detailType;
    }

    public void setDetailType(Integer detailType) {
      this.detailType = detailType;
    }

    public String getDetailTypeName() {
      return detailTypeName;
    }

    public void setDetailTypeName(String detailTypeName) {
      this.detailTypeName = detailTypeName;
    }
    
    
}