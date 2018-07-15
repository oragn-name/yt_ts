package com.study.model;

import javax.persistence.*;

@Table(name = "project_produce")
public class ProjectProduce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 合同编号
     */
    @Column(name = "pro_contract_number")
    private String proContractNumber;
    
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
    private String proConst;

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
     * 编号性质，字典id
     */
    @Column(name = "pro_number_type")
    private Integer proNumberType;
    
    /**
     * 联系人
     */
    @Column(name = "pro_user")
    private String proUser;
    
    /**
     * 联系人电话
     */
    @Column(name = "pro_user_phone")
    private String proUserPhone;
    
    /**
     * 备注
     */
    @Column(name = "pro_remark")
    private String proRemark;
    
    /**
     * 管阀口径
     */
    @Column(name = "pro_pipe")
    private Double proPipe;
    /**
     * 管阀长度
     */
    @Column(name = "pro_pipe_lengths")
    private Double proPipeLengths;
    
    /**
     * 水表口径
     */
    @Column(name = "pro_water")
    private Double proWater;
    
    /**
     * 水表数量
     */
    @Column(name = "pro_water_number")
    private Integer proWaterNumber;
    
    /**
     * 是否需要设计交底
     */
    @Column(name = "pro_design")
    private Integer proDesign;
    
    /**
     * 是否需要计费协议
     */
    @Column(name = "pro_billing")
    private Integer proBilling;
    
    /**
     * 临时水开始日期，工程性质如果是临水
     */
    @Column(name = "pro_water_begintime")
    private String proWaterBegintime;
    
    /**
     * 临时水结束日期，工程性质如果是临水
     */
    @Column(name = "pro_water_endtime")
    private String  proWaterEndtime;
    
    /**
     * 1、在施，有已开工无转闸日期；2、待施，无实际开工日；3、已完工，有转图日期的查询,4、待转图，有转闸但日期无转图日期
     */
    @Column(name = "pro_status")
    private Integer  proStatus;
    
    /**
     * 1打开，2关闭
     */
    @Column(name = "pro_type")
    private Integer  proType;
    
    /**
     * 建设单位
     */
    @Column(name = "pro_unit")
    private String  proUnit ;
    
    /**
     * 工程地址
     */
    @Column(name = "pro_address")
    private String  proAddress;
    

    
    
    @Transient
    private String proJobTypeName;
    @Transient
    private String proEngineTypeName;
    @Transient
    private String proNatureName;
    @Transient
    private String proSourceName;
    @Transient
    private String proAreaName;
    @Transient
    private String proPeriodName;
    @Transient
    private String proConstName;
    @Transient
    private String proDeptName;
    @Transient
    private String proNumberName;
    @Transient
    private Integer[] proDeptId;
    
    
    public String getProJobTypeName() {
      return proJobTypeName;
    }

    public void setProJobTypeName(String proJobTypeName) {
      this.proJobTypeName = proJobTypeName;
    }

    public String getProEngineTypeName() {
      return proEngineTypeName;
    }

    public void setProEngineTypeName(String proEngineTypeName) {
      this.proEngineTypeName = proEngineTypeName;
    }

    public String getProNatureName() {
      return proNatureName;
    }

    public void setProNatureName(String proNatureName) {
      this.proNatureName = proNatureName;
    }

    public String getProSourceName() {
      return proSourceName;
    }

    public void setProSourceName(String proSourceName) {
      this.proSourceName = proSourceName;
    }

    public String getProAreaName() {
      return proAreaName;
    }

    public void setProAreaName(String proAreaName) {
      this.proAreaName = proAreaName;
    }

    public String getProPeriodName() {
      return proPeriodName;
    }

    public void setProPeriodName(String proPeriodName) {
      this.proPeriodName = proPeriodName;
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
    public String getProConst() {
        return proConst;
    }

    /**
     * 设置施工单位 字典id
     *
     * @param proConst 施工单位 字典id
     */
    public void setProConst(String proConst) {
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

    public Integer getProNumberType() {
      return proNumberType;
    }

    public void setProNumberType(Integer proNumberType) {
      this.proNumberType = proNumberType;
    }

    public String getProUser() {
      return proUser;
    }

    public void setProUser(String proUser) {
      this.proUser = proUser;
    }

    public String getProUserPhone() {
      return proUserPhone;
    }

    public void setProUserPhone(String proUserPhone) {
      this.proUserPhone = proUserPhone;
    }

    public String getProRemark() {
      return proRemark;
    }

    public void setProRemark(String proRemark) {
      this.proRemark = proRemark;
    }

    public Double getProPipe() {
      return proPipe;
    }

    public void setProPipe(Double proPipe) {
      this.proPipe = proPipe;
    }

    public Double getProPipeLengths() {
      return proPipeLengths;
    }

    public void setProPipeLengths(Double proPipeLengths) {
      this.proPipeLengths = proPipeLengths;
    }

    public Double getProWater() {
      return proWater;
    }

    public void setProWater(Double proWater) {
      this.proWater = proWater;
    }

    public Integer getProWaterNumber() {
      return proWaterNumber;
    }

    public void setProWaterNumber(Integer proWaterNumber) {
      this.proWaterNumber = proWaterNumber;
    }

    public Integer getProDesign() {
      return proDesign;
    }

    public void setProDesign(Integer proDesign) {
      this.proDesign = proDesign;
    }

    public Integer getProBilling() {
      return proBilling;
    }

    public void setProBilling(Integer proBilling) {
      this.proBilling = proBilling;
    }

    public String getProWaterBegintime() {
      return proWaterBegintime;
    }

    public void setProWaterBegintime(String proWaterBegintime) {
      this.proWaterBegintime = proWaterBegintime;
    }

    public String getProWaterEndtime() {
      return proWaterEndtime;
    }

    public void setProWaterEndtime(String proWaterEndtime) {
      this.proWaterEndtime = proWaterEndtime;
    }

    public String getProNumberName() {
      return proNumberName;
    }

    public void setProNumberName(String proNumberName) {
      this.proNumberName = proNumberName;
    }

    public String getProContractNumber() {
      return proContractNumber;
    }

    public void setProContractNumber(String proContractNumber) {
      this.proContractNumber = proContractNumber;
    }

    public Integer getProStatus() {
      return proStatus;
    }

    public void setProStatus(Integer proStatus) {
      this.proStatus = proStatus;
    }

    public Integer getProType() {
      return proType;
    }

    public void setProType(Integer proType) {
      this.proType = proType;
    }

    public String getProUnit() {
      return proUnit;
    }

    public void setProUnit(String proUnit) {
      this.proUnit = proUnit;
    }

    public String getProAddress() {
      return proAddress;
    }

    public void setProAddress(String proAddress) {
      this.proAddress = proAddress;
    }

    public Integer[] getProDeptId() {
      return proDeptId;
    }

    public void setProDeptId(Integer[] proDeptId) {
      this.proDeptId = proDeptId;
    }


    
    
    
}