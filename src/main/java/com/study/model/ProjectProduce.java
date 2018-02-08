package com.study.model;

import javax.persistence.*;

@Table(name = "project_produce")
public class ProjectProduce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 测量定线 1 是，0否
     */
    @Column(name = "pro_gauge")
    private Integer proGauge;

    /**
     * 工号类别 字典id
     */
    @Column(name = "pro_job_type")
    private Integer proJobType;

    /**
     * 工程类别 字典id
     */
    @Column(name = "pro_engine_type")
    private Integer proEngineType;

    /**
     * 工程性质 字典id
     */
    @Column(name = "pro_nature")
    private Integer proNature;

    /**
     * 工程名称
     */
    @Column(name = "pro_name")
    private String proName;

    /**
     * 工程来源 字典id
     */
    @Column(name = "pro_source")
    private Integer proSource;

    /**
     * 工号
     */
    @Column(name = "pro_number")
    private String proNumber;

    /**
     * 临时工号
     */
    @Column(name = "pro_snap_number")
    private String proSnapNumber;

    /**
     * 序号
     */
    @Column(name = "pro_serial_number")
    private String proSerialNumber;

    /**
     * 任务下达时间
     */
    @Column(name = "pro_lssued_time")
    private String proLssuedTime;

    /**
     * 工程所在区 字典id
     */
    @Column(name = "pro_area")
    private Integer proArea;

    /**
     * 路政报批时间
     */
    @Column(name = "pro_roads_time")
    private String proRoadsTime;

    /**
     * 交通报批时间
     */
    @Column(name = "pro_traffic_time")
    private String proTrafficTime;

    /**
     * 期次 字典id
     */
    @Column(name = "pro_period")
    private Integer proPeriod;

    /**
     * 施工单位 字典id
     */
    @Column(name = "pro_const")
    private Integer proConst;

    /**
     * 转入单位  部门id
     */
    @Column(name = "pro_dept")
    private Integer proDept;

    /**
     * 设计长度
     */
    @Column(name = "pro_design_length")
    private Double proDesignLength;

    /**
     * 管径
     */
    @Column(name = "pro_pipe_length")
    private Double proPipeLength;

    /**
     * 临时线长度
     */
    @Column(name = "pro_snap_length")
    private Double proSnapLength;

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
     * 获取测量定线 1 是，0否
     *
     * @return pro_gauge - 测量定线 1 是，0否
     */
    public Integer getProGauge() {
        return proGauge;
    }

    /**
     * 设置测量定线 1 是，0否
     *
     * @param proGauge 测量定线 1 是，0否
     */
    public void setProGauge(Integer proGauge) {
        this.proGauge = proGauge;
    }

    /**
     * 获取工号类别 字典id
     *
     * @return pro_job_type - 工号类别 字典id
     */
    public Integer getProJobType() {
        return proJobType;
    }

    /**
     * 设置工号类别 字典id
     *
     * @param proJobType 工号类别 字典id
     */
    public void setProJobType(Integer proJobType) {
        this.proJobType = proJobType;
    }

    /**
     * 获取工程类别 字典id
     *
     * @return pro_engine_type - 工程类别 字典id
     */
    public Integer getProEngineType() {
        return proEngineType;
    }

    /**
     * 设置工程类别 字典id
     *
     * @param proEngineType 工程类别 字典id
     */
    public void setProEngineType(Integer proEngineType) {
        this.proEngineType = proEngineType;
    }

    /**
     * 获取工程性质 字典id
     *
     * @return pro_nature - 工程性质 字典id
     */
    public Integer getProNature() {
        return proNature;
    }

    /**
     * 设置工程性质 字典id
     *
     * @param proNature 工程性质 字典id
     */
    public void setProNature(Integer proNature) {
        this.proNature = proNature;
    }

    /**
     * 获取工程名称
     *
     * @return pro_name - 工程名称
     */
    public String getProName() {
        return proName;
    }

    /**
     * 设置工程名称
     *
     * @param proName 工程名称
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * 获取工程来源 字典id
     *
     * @return pro_source - 工程来源 字典id
     */
    public Integer getProSource() {
        return proSource;
    }

    /**
     * 设置工程来源 字典id
     *
     * @param proSource 工程来源 字典id
     */
    public void setProSource(Integer proSource) {
        this.proSource = proSource;
    }

    /**
     * 获取工号
     *
     * @return pro_number - 工号
     */
    public String getProNumber() {
        return proNumber;
    }

    /**
     * 设置工号
     *
     * @param proNumber 工号
     */
    public void setProNumber(String proNumber) {
        this.proNumber = proNumber;
    }

    /**
     * 获取临时工号
     *
     * @return pro_snap_number - 临时工号
     */
    public String getProSnapNumber() {
        return proSnapNumber;
    }

    /**
     * 设置临时工号
     *
     * @param proSnapNumber 临时工号
     */
    public void setProSnapNumber(String proSnapNumber) {
        this.proSnapNumber = proSnapNumber;
    }

    /**
     * 获取序号
     *
     * @return pro_serial_number - 序号
     */
    public String getProSerialNumber() {
        return proSerialNumber;
    }

    /**
     * 设置序号
     *
     * @param proSerialNumber 序号
     */
    public void setProSerialNumber(String proSerialNumber) {
        this.proSerialNumber = proSerialNumber;
    }

    /**
     * 获取任务下达时间
     *
     * @return pro_lssued_time - 任务下达时间
     */
    public String getProLssuedTime() {
        return proLssuedTime;
    }

    /**
     * 设置任务下达时间
     *
     * @param proLssuedTime 任务下达时间
     */
    public void setProLssuedTime(String proLssuedTime) {
        this.proLssuedTime = proLssuedTime;
    }

    /**
     * 获取工程所在区 字典id
     *
     * @return pro_area - 工程所在区 字典id
     */
    public Integer getProArea() {
        return proArea;
    }

    /**
     * 设置工程所在区 字典id
     *
     * @param proArea 工程所在区 字典id
     */
    public void setProArea(Integer proArea) {
        this.proArea = proArea;
    }

    /**
     * 获取路政报批时间
     *
     * @return pro_roads_time - 路政报批时间
     */
    public String getProRoadsTime() {
        return proRoadsTime;
    }

    /**
     * 设置路政报批时间
     *
     * @param proRoadsTime 路政报批时间
     */
    public void setProRoadsTime(String proRoadsTime) {
        this.proRoadsTime = proRoadsTime;
    }

    /**
     * 获取交通报批时间
     *
     * @return pro_traffic_time - 交通报批时间
     */
    public String getProTrafficTime() {
        return proTrafficTime;
    }

    /**
     * 设置交通报批时间
     *
     * @param proTrafficTime 交通报批时间
     */
    public void setProTrafficTime(String proTrafficTime) {
        this.proTrafficTime = proTrafficTime;
    }

    /**
     * 获取期次 字典id
     *
     * @return pro_period - 期次 字典id
     */
    public Integer getProPeriod() {
        return proPeriod;
    }

    /**
     * 设置期次 字典id
     *
     * @param proPeriod 期次 字典id
     */
    public void setProPeriod(Integer proPeriod) {
        this.proPeriod = proPeriod;
    }

    /**
     * 获取施工单位 字典id
     *
     * @return pro_const - 施工单位 字典id
     */
    public Integer getProConst() {
        return proConst;
    }

    /**
     * 设置施工单位 字典id
     *
     * @param proConst 施工单位 字典id
     */
    public void setProConst(Integer proConst) {
        this.proConst = proConst;
    }

    /**
     * 获取转入单位  部门id
     *
     * @return pro_dept - 转入单位  部门id
     */
    public Integer getProDept() {
        return proDept;
    }

    /**
     * 设置转入单位  部门id
     *
     * @param proDept 转入单位  部门id
     */
    public void setProDept(Integer proDept) {
        this.proDept = proDept;
    }

    /**
     * 获取设计长度
     *
     * @return pro_design_length - 设计长度
     */
    public Double getProDesignLength() {
        return proDesignLength;
    }

    /**
     * 设置设计长度
     *
     * @param proDesignLength 设计长度
     */
    public void setProDesignLength(Double proDesignLength) {
        this.proDesignLength = proDesignLength;
    }

    /**
     * 获取管径
     *
     * @return pro_pipe_length - 管径
     */
    public Double getProPipeLength() {
        return proPipeLength;
    }

    /**
     * 设置管径
     *
     * @param proPipeLength 管径
     */
    public void setProPipeLength(Double proPipeLength) {
        this.proPipeLength = proPipeLength;
    }

    /**
     * 获取临时线长度
     *
     * @return pro_snap_length - 临时线长度
     */
    public Double getProSnapLength() {
        return proSnapLength;
    }

    /**
     * 设置临时线长度
     *
     * @param proSnapLength 临时线长度
     */
    public void setProSnapLength(Double proSnapLength) {
        this.proSnapLength = proSnapLength;
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