package com.study.model;

import javax.persistence.*;

@Table(name = "project_satety")
public class ProjectSatety {
    @Id
    @Column(name = "safety_id")
    private Integer safetyId;

    /**
     * 合格日期
     */
    @Column(name = "safety_qualified_time")
    private String safetyQualifiedTime;

    /**
     * 经手人
     */
    @Column(name = "safety_hand_man")
    private String safetyHandMan;

    /**
     * 修改次数
     */
    @Column(name = "safety_edit")
    private Integer safetyEdit;

    /**
     * 申报人
     */
    @Column(name = "safety_reporter")
    private String safetyReporter;

    /**
     * 现场负责人
     */
    @Column(name = "safety_principal")
    private String safetyPrincipal;

    /**
     * 联系电话
     */
    @Column(name = "safety_phone")
    private String safetyPhone;

    /**
     * 是否安全交底 1是 0否
     */
    @Column(name = "safety_safe")
    private String safetySafe;

    /**
     * 是否施工方案 1是 0 否
     */
    @Column(name = "safety_pro")
    private String safetyPro;

    /**
     * 是否治安消防 1是 0否
     */
    @Column(name = "safety_fire")
    private String safetyFire;

    /**
     * 安全措施 1是 0否
     */
    @Column(name = "safety_step")
    private String safetyStep;

    /**
     * 创建人
     */
    @Column(name = "safety_user")
    private Integer safetyUser;

    /**
     * 创建时间
     */
    @Column(name = "safety_user_time")
    private String safetyUserTime;
    
    @Column(name = "pro_id")
    private Integer proId;
     

    /**
     * @return safety_id
     */
    public Integer getSafetyId() {
        return safetyId;
    }

    /**
     * @param safetyId
     */
    public void setSafetyId(Integer safetyId) {
        this.safetyId = safetyId;
    }

    /**
     * 获取合格日期
     *
     * @return safety_qualified_time - 合格日期
     */
    public String getSafetyQualifiedTime() {
        return safetyQualifiedTime;
    }

    /**
     * 设置合格日期
     *
     * @param safetyQualifiedTime 合格日期
     */
    public void setSafetyQualifiedTime(String safetyQualifiedTime) {
        this.safetyQualifiedTime = safetyQualifiedTime;
    }

    /**
     * 获取经手人
     *
     * @return safety_hand_man - 经手人
     */
    public String getSafetyHandMan() {
        return safetyHandMan;
    }

    /**
     * 设置经手人
     *
     * @param safetyHandMan 经手人
     */
    public void setSafetyHandMan(String safetyHandMan) {
        this.safetyHandMan = safetyHandMan;
    }

    /**
     * 获取修改次数
     *
     * @return safety_edit - 修改次数
     */
    public Integer getSafetyEdit() {
        return safetyEdit;
    }

    /**
     * 设置修改次数
     *
     * @param safetyEdit 修改次数
     */
    public void setSafetyEdit(Integer safetyEdit) {
        this.safetyEdit = safetyEdit;
    }

    /**
     * 获取申报人
     *
     * @return safety_reporter - 申报人
     */
    public String getSafetyReporter() {
        return safetyReporter;
    }

    /**
     * 设置申报人
     *
     * @param safetyReporter 申报人
     */
    public void setSafetyReporter(String safetyReporter) {
        this.safetyReporter = safetyReporter;
    }

    /**
     * 获取现场负责人
     *
     * @return safety_principal - 现场负责人
     */
    public String getSafetyPrincipal() {
        return safetyPrincipal;
    }

    /**
     * 设置现场负责人
     *
     * @param safetyPrincipal 现场负责人
     */
    public void setSafetyPrincipal(String safetyPrincipal) {
        this.safetyPrincipal = safetyPrincipal;
    }

    /**
     * 获取联系电话
     *
     * @return safety_phone - 联系电话
     */
    public String getSafetyPhone() {
        return safetyPhone;
    }

    /**
     * 设置联系电话
     *
     * @param safetyPhone 联系电话
     */
    public void setSafetyPhone(String safetyPhone) {
        this.safetyPhone = safetyPhone;
    }

    /**
     * 获取是否安全交底 1是 0否
     *
     * @return safety_safe - 是否安全交底 1是 0否
     */
    public String getSafetySafe() {
        return safetySafe;
    }

    /**
     * 设置是否安全交底 1是 0否
     *
     * @param safetySafe 是否安全交底 1是 0否
     */
    public void setSafetySafe(String safetySafe) {
        this.safetySafe = safetySafe;
    }

    /**
     * 获取是否施工方案 1是 0 否
     *
     * @return safety_pro - 是否施工方案 1是 0 否
     */
    public String getSafetyPro() {
        return safetyPro;
    }

    /**
     * 设置是否施工方案 1是 0 否
     *
     * @param safetyPro 是否施工方案 1是 0 否
     */
    public void setSafetyPro(String safetyPro) {
        this.safetyPro = safetyPro;
    }

    /**
     * 获取是否治安消防 1是 0否
     *
     * @return safety_fire - 是否治安消防 1是 0否
     */
    public String getSafetyFire() {
        return safetyFire;
    }

    /**
     * 设置是否治安消防 1是 0否
     *
     * @param safetyFire 是否治安消防 1是 0否
     */
    public void setSafetyFire(String safetyFire) {
        this.safetyFire = safetyFire;
    }

    /**
     * 获取安全措施 1是 0否
     *
     * @return safety_step - 安全措施 1是 0否
     */
    public String getSafetyStep() {
        return safetyStep;
    }

    /**
     * 设置安全措施 1是 0否
     *
     * @param safetyStep 安全措施 1是 0否
     */
    public void setSafetyStep(String safetyStep) {
        this.safetyStep = safetyStep;
    }

    /**
     * 获取创建人
     *
     * @return safety_user - 创建人
     */
    public Integer getSafetyUser() {
        return safetyUser;
    }

    /**
     * 设置创建人
     *
     * @param safetyUser 创建人
     */
    public void setSafetyUser(Integer safetyUser) {
        this.safetyUser = safetyUser;
    }

    /**
     * 获取创建时间
     *
     * @return safety_user_time - 创建时间
     */
    public String getSafetyUserTime() {
        return safetyUserTime;
    }

    /**
     * 设置创建时间
     *
     * @param safetyUserTime 创建时间
     */
    public void setSafetyUserTime(String safetyUserTime) {
        this.safetyUserTime = safetyUserTime;
    }

    public Integer getProId() {
      return proId;
    }

    public void setProId(Integer proId) {
      this.proId = proId;
    }
    
}