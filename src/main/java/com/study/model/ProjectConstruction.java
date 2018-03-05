package com.study.model;

import javax.persistence.*;

@Table(name = "project_construction")
public class ProjectConstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目id
     */
    @Column(name = "proId")
    private Integer proid;

    /**
     * 项目基本信息id
     */
    @Column(name = "prwId")
    private Integer prwid;

    /**
     * 施工人员
     */
    @Column(name = "pc_workers")
    private String pcWorkers;

    /**
     * 联系电话
     */
    @Column(name = "pc_phone")
    private String pcPhone;

    /**
     * 下周计划
     */
    @Column(name = "pc_week_plan")
    private String pcWeekPlan;

    /**
     * 下月计划
     */
    @Column(name = "pc_month_plan")
    private String pcMonthPlan;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;
    
    /**
     * 施工单位
     */
    @Column(name = "pc_dept")
    private Integer pcDept;
    
    
    /**
     * 备注
     */
    @Column(name = "pc_remark")
    private String pcRemark;
    
    @Transient
    private String pcDeptName;
    
    
    

    public String getPcDeptName() {
      return pcDeptName;
    }

    public void setPcDeptName(String pcDeptName) {
      this.pcDeptName = pcDeptName;
    }

    public Integer getPcDept() {
      return pcDept;
    }

    public void setPcDept(Integer pcDept) {
      this.pcDept = pcDept;
    }

    public String getPcRemark() {
      return pcRemark;
    }

    public void setPcRemark(String pcRemark) {
      this.pcRemark = pcRemark;
    }

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
     * 获取项目id
     *
     * @return proId - 项目id
     */
    public Integer getProid() {
        return proid;
    }

    /**
     * 设置项目id
     *
     * @param proid 项目id
     */
    public void setProid(Integer proid) {
        this.proid = proid;
    }

    /**
     * 获取项目基本信息id
     *
     * @return prwId - 项目基本信息id
     */
    public Integer getPrwid() {
        return prwid;
    }

    /**
     * 设置项目基本信息id
     *
     * @param prwid 项目基本信息id
     */
    public void setPrwid(Integer prwid) {
        this.prwid = prwid;
    }

    /**
     * 获取施工人员
     *
     * @return pc_workers - 施工人员
     */
    public String getPcWorkers() {
        return pcWorkers;
    }

    /**
     * 设置施工人员
     *
     * @param pcWorkers 施工人员
     */
    public void setPcWorkers(String pcWorkers) {
        this.pcWorkers = pcWorkers;
    }

    /**
     * 获取联系电话
     *
     * @return pc_phone - 联系电话
     */
    public String getPcPhone() {
        return pcPhone;
    }

    /**
     * 设置联系电话
     *
     * @param pcPhone 联系电话
     */
    public void setPcPhone(String pcPhone) {
        this.pcPhone = pcPhone;
    }

    /**
     * 获取下周计划
     *
     * @return pc_week_plan - 下周计划
     */
    public String getPcWeekPlan() {
        return pcWeekPlan;
    }

    /**
     * 设置下周计划
     *
     * @param pcWeekPlan 下周计划
     */
    public void setPcWeekPlan(String pcWeekPlan) {
        this.pcWeekPlan = pcWeekPlan;
    }

    /**
     * 获取下月计划
     *
     * @return pc_month_plan - 下月计划
     */
    public String getPcMonthPlan() {
        return pcMonthPlan;
    }

    /**
     * 设置下月计划
     *
     * @param pcMonthPlan 下月计划
     */
    public void setPcMonthPlan(String pcMonthPlan) {
        this.pcMonthPlan = pcMonthPlan;
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
}