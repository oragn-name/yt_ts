package com.study.model;

import javax.persistence.*;

@Table(name = "project_picture")
public class ProjectPicture {
    @Id
    @Column(name = "picture_id")
    private Integer pictureId;

    @Column(name = "pro_id")
    private Integer proId;

    /**
     * 图纸性质 字典id
     */
    @Column(name = "picture_nature")
    private Integer pictureNature;
    
    @Transient
    private String pictureNatureName;
    

    /**
     * 接受竣工图时间
     */
    @Column(name = "picture_time")
    private String pictureTime;

    /**
     * 竣工图是否合格 1 合格，0不合格
     */
    @Column(name = "picture_type")
    private Integer pictureType;

    /**
     * 竣工图合格时间
     */
    @Column(name = "picture_type_time")
    private String pictureTypeTime;

    /**
     * 备注
     */
    @Column(name = "picture_remark")
    private String pictureRemark;

    /**
     * 创建人id
     */
    @Column(name = "picture_create_user")
    private Integer pictureCreateUser;

    
    @Transient
    private String prwSwitchingDate;
    /**
     * 创建时间
     */
    @Column(name = "picture_create_time")
    private String pictureCreateTime;

    /**
     * @return picture_id
     */
    public Integer getPictureId() {
        return pictureId;
    }

    /**
     * @param pictureId
     */
    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    /**
     * @return pro_id
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * @param proId
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * 获取图纸性质 字典id
     *
     * @return picture_nature - 图纸性质 字典id
     */
    public Integer getPictureNature() {
        return pictureNature;
    }

    /**
     * 设置图纸性质 字典id
     *
     * @param pictureNature 图纸性质 字典id
     */
    public void setPictureNature(Integer pictureNature) {
        this.pictureNature = pictureNature;
    }

    /**
     * 获取接受竣工图时间
     *
     * @return picture_time - 接受竣工图时间
     */
    public String getPictureTime() {
        return pictureTime;
    }

    /**
     * 设置接受竣工图时间
     *
     * @param pictureTime 接受竣工图时间
     */
    public void setPictureTime(String pictureTime) {
        this.pictureTime = pictureTime;
    }

    /**
     * 获取竣工图是否合格 1 合格，0不合格
     *
     * @return picture_type - 竣工图是否合格 1 合格，0不合格
     */
    public Integer getPictureType() {
        return pictureType;
    }

    /**
     * 设置竣工图是否合格 1 合格，0不合格
     *
     * @param pictureType 竣工图是否合格 1 合格，0不合格
     */
    public void setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
    }

    /**
     * 获取竣工图合格时间
     *
     * @return picture_type_time - 竣工图合格时间
     */
    public String getPictureTypeTime() {
        return pictureTypeTime;
    }

    /**
     * 设置竣工图合格时间
     *
     * @param pictureTypeTime 竣工图合格时间
     */
    public void setPictureTypeTime(String pictureTypeTime) {
        this.pictureTypeTime = pictureTypeTime;
    }

    /**
     * 获取备注
     *
     * @return picture_remark - 备注
     */
    public String getPictureRemark() {
        return pictureRemark;
    }

    /**
     * 设置备注
     *
     * @param pictureRemark 备注
     */
    public void setPictureRemark(String pictureRemark) {
        this.pictureRemark = pictureRemark;
    }

    /**
     * 获取创建人id
     *
     * @return picture_create_user - 创建人id
     */
    public Integer getPictureCreateUser() {
        return pictureCreateUser;
    }

    /**
     * 设置创建人id
     *
     * @param pictureCreateUser 创建人id
     */
    public void setPictureCreateUser(Integer pictureCreateUser) {
        this.pictureCreateUser = pictureCreateUser;
    }

    /**
     * 获取创建时间
     *
     * @return picture_create_time - 创建时间
     */
    public String getPictureCreateTime() {
        return pictureCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param pictureCreateTime 创建时间
     */
    public void setPictureCreateTime(String pictureCreateTime) {
        this.pictureCreateTime = pictureCreateTime;
    }

    public String getPictureNatureName() {
      return pictureNatureName;
    }

    public void setPictureNatureName(String pictureNatureName) {
      this.pictureNatureName = pictureNatureName;
    }

    public String getPrwSwitchingDate() {
      return prwSwitchingDate;
    }

    public void setPrwSwitchingDate(String prwSwitchingDate) {
      this.prwSwitchingDate = prwSwitchingDate;
    }
    
    
}