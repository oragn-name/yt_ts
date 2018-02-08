package com.study.model;

import javax.persistence.*;

@Table(name = "project_road_work")
public class ProjectRoadWork {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 完成DMA口径 数值
     */
    @Column(name = "prw_dma_caliber")
    private Integer prwDmaCaliber;

    /**
     * 完成DMA数量 数值
     */
    @Column(name = "prw_dma_count")
    private Integer prwDmaCount;

    /**
     * 完成倒流防止器口径
     */
    @Column(name = "prw_back_caliber")
    private Integer prwBackCaliber;

    /**
     * 完成倒流防止器数量
     */
    @Column(name = "prw_back_count")
    private Integer prwBackCount;

    /**
     * 下周计划
     */
    @Column(name = "prw_week_plan")
    private Double prwWeekPlan;

    /**
     * 下月计划
     */
    @Column(name = "prw_month_plan")
    private Double prwMonthPlan;

    /**
     * 计划开工时间
     */
    @Column(name = "prw_pst")
    private String prwPst;

    /**
     * 计划完工时间
     */
    @Column(name = "prw_pet")
    private String prwPet;

    /**
     * 计划总工期 
     */
    @Column(name = "prw_total_duration")
    private Integer prwTotalDuration;

    /**
     * 实际开工时间
     */
    @Column(name = "prw_ast")
    private String prwAst;

    /**
     * 实际竣工时间
     */
    @Column(name = "prw_aet")
    private String prwAet;

    /**
     * 竣工验收日期
     */
    @Column(name = "prw_reception_time")
    private String prwReceptionTime;

    /**
     * 转闸单日期
     */
    @Column(name = "prw_switching_date")
    private String prwSwitchingDate;

    /**
     * 转图日期
     */
    @Column(name = "prw_figure_date")
    private String prwFigureDate;

    /**
     * 工程进展问题
     */
    @Column(name = "prw_progress_report")
    private String prwProgressReport;

    /**
     * 未开工原因
     */
    @Column(name = "prw_reason")
    private String prwReason;

    /**
     * 未完工说明 
     */
    @Column(name = "prw_explain")
    private String prwExplain;

    /**
     * 预算价
     */
    @Column(name = "prw_budget")
    private Double prwBudget;

    /**
     * 结算价
     */
    @Column(name = "prw_settlement")
    private Double prwSettlement;

    /**
     * 累计投入人力
     */
    @Column(name = "prw_manpower")
    private Integer prwManpower;

    /**
     * 累计投入机械台班
     */
    @Column(name = "prw_road_work")
    private Double prwRoadWork;

    /**
     * 所属街道办事处
     */
    @Column(name = "prw_address")
    private String prwAddress;

    /**
     * 涉及道路名称
     */
    @Column(name = "prw_road_name")
    private String prwRoadName;

    /**
     * 起点
     */
    @Column(name = "prw_origin")
    private String prwOrigin;

    /**
     * 止点
     */
    @Column(name = "prw_stop")
    private String prwStop;

    /**
     * 道路权属
     */
    @Column(name = "prw_ownership")
    private Integer prwOwnership;
    @Transient
    private String prwOwnershipName;
    
    

    /**
     * 是否随大修路
     */
    @Column(name = "prw_repair")
    private Integer prwRepair;

    /**
     * 是否非开挖
     */
    @Column(name = "prw_excavation")
    private Integer prwExcavation;

    /**
     * 预判施工工时
     */
    @Column(name = "prw_preliminary_time")
    private String prwPreliminaryTime;

    /**
     * 施工员
     */
    @Column(name = "prw_user_id")
    private String prwUserId;

    /**
     * 电话
     */
    @Column(name = "prw_phone")
    private String prwPhone;

    /**
     * 路管情况
     */
    @Column(name = "prw_condition")
    private Integer prwCondition;
    @Transient
    private String prwConditionName;

    /**
     * 创建人
     */
    @Column(name = "prw_creator")
    private Integer prwCreator;

    /**
     * 创建时间
     */
    @Column(name = "prw_create_at")
    private String prwCreateAt;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取完成DMA口径 数值
     *
     * @return prw_dma_caliber - 完成DMA口径 数值
     */
    public Integer getPrwDmaCaliber() {
        return prwDmaCaliber;
    }

    /**
     * 设置完成DMA口径 数值
     *
     * @param prwDmaCaliber 完成DMA口径 数值
     */
    public void setPrwDmaCaliber(Integer prwDmaCaliber) {
        this.prwDmaCaliber = prwDmaCaliber;
    }

    /**
     * 获取完成DMA数量 数值
     *
     * @return prw_dma_count - 完成DMA数量 数值
     */
    public Integer getPrwDmaCount() {
        return prwDmaCount;
    }

    public String getPrwOwnershipName() {
      return prwOwnershipName;
    }

    public void setPrwOwnershipName(String prwOwnershipName) {
      this.prwOwnershipName = prwOwnershipName;
    }

    public String getPrwConditionName() {
      return prwConditionName;
    }

    public void setPrwConditionName(String prwConditionName) {
      this.prwConditionName = prwConditionName;
    }

    /**
     * 设置完成DMA数量 数值
     *
     * @param prwDmaCount 完成DMA数量 数值
     */
    public void setPrwDmaCount(Integer prwDmaCount) {
        this.prwDmaCount = prwDmaCount;
    }

    /**
     * 获取完成倒流防止器口径
     *
     * @return prw_back_caliber - 完成倒流防止器口径
     */
    public Integer getPrwBackCaliber() {
        return prwBackCaliber;
    }

    /**
     * 设置完成倒流防止器口径
     *
     * @param prwBackCaliber 完成倒流防止器口径
     */
    public void setPrwBackCaliber(Integer prwBackCaliber) {
        this.prwBackCaliber = prwBackCaliber;
    }

    /**
     * 获取完成倒流防止器数量
     *
     * @return prw_back_count - 完成倒流防止器数量
     */
    public Integer getPrwBackCount() {
        return prwBackCount;
    }

    /**
     * 设置完成倒流防止器数量
     *
     * @param prwBackCount 完成倒流防止器数量
     */
    public void setPrwBackCount(Integer prwBackCount) {
        this.prwBackCount = prwBackCount;
    }

    /**
     * 获取下周计划
     *
     * @return prw_week_plan - 下周计划
     */
    public Double getPrwWeekPlan() {
        return prwWeekPlan;
    }

    /**
     * 设置下周计划
     *
     * @param prwWeekPlan 下周计划
     */
    public void setPrwWeekPlan(Double prwWeekPlan) {
        this.prwWeekPlan = prwWeekPlan;
    }

    /**
     * 获取下月计划
     *
     * @return prw_month_plan - 下月计划
     */
    public Double getPrwMonthPlan() {
        return prwMonthPlan;
    }

    /**
     * 设置下月计划
     *
     * @param prwMonthPlan 下月计划
     */
    public void setPrwMonthPlan(Double prwMonthPlan) {
        this.prwMonthPlan = prwMonthPlan;
    }

    /**
     * 获取计划开工时间
     *
     * @return prw_pst - 计划开工时间
     */
    public String getPrwPst() {
        return prwPst;
    }

    /**
     * 设置计划开工时间
     *
     * @param prwPst 计划开工时间
     */
    public void setPrwPst(String prwPst) {
        this.prwPst = prwPst;
    }

    /**
     * 获取计划完工时间
     *
     * @return prw_pet - 计划完工时间
     */
    public String getPrwPet() {
        return prwPet;
    }

    /**
     * 设置计划完工时间
     *
     * @param prwPet 计划完工时间
     */
    public void setPrwPet(String prwPet) {
        this.prwPet = prwPet;
    }

    /**
     * 获取计划总工期 
     *
     * @return prw_total_duration - 计划总工期 
     */
    public Integer getPrwTotalDuration() {
        return prwTotalDuration;
    }

    /**
     * 设置计划总工期 
     *
     * @param prwTotalDuration 计划总工期 
     */
    public void setPrwTotalDuration(Integer prwTotalDuration) {
        this.prwTotalDuration = prwTotalDuration;
    }

    /**
     * 获取实际开工时间
     *
     * @return prw_ast - 实际开工时间
     */
    public String getPrwAst() {
        return prwAst;
    }

    /**
     * 设置实际开工时间
     *
     * @param prwAst 实际开工时间
     */
    public void setPrwAst(String prwAst) {
        this.prwAst = prwAst;
    }

    /**
     * 获取实际竣工时间
     *
     * @return prw_aet - 实际竣工时间
     */
    public String getPrwAet() {
        return prwAet;
    }

    /**
     * 设置实际竣工时间
     *
     * @param prwAet 实际竣工时间
     */
    public void setPrwAet(String prwAet) {
        this.prwAet = prwAet;
    }

    /**
     * 获取竣工验收日期
     *
     * @return prw_reception_time - 竣工验收日期
     */
    public String getPrwReceptionTime() {
        return prwReceptionTime;
    }

    /**
     * 设置竣工验收日期
     *
     * @param prwReceptionTime 竣工验收日期
     */
    public void setPrwReceptionTime(String prwReceptionTime) {
        this.prwReceptionTime = prwReceptionTime;
    }

    /**
     * 获取转闸单日期
     *
     * @return prw_switching_date - 转闸单日期
     */
    public String getPrwSwitchingDate() {
        return prwSwitchingDate;
    }

    /**
     * 设置转闸单日期
     *
     * @param prwSwitchingDate 转闸单日期
     */
    public void setPrwSwitchingDate(String prwSwitchingDate) {
        this.prwSwitchingDate = prwSwitchingDate;
    }

    /**
     * 获取转图日期
     *
     * @return prw_figure_date - 转图日期
     */
    public String getPrwFigureDate() {
        return prwFigureDate;
    }

    /**
     * 设置转图日期
     *
     * @param prwFigureDate 转图日期
     */
    public void setPrwFigureDate(String prwFigureDate) {
        this.prwFigureDate = prwFigureDate;
    }

    /**
     * 获取工程进展问题
     *
     * @return prw_progress_report - 工程进展问题
     */
    public String getPrwProgressReport() {
        return prwProgressReport;
    }

    /**
     * 设置工程进展问题
     *
     * @param prwProgressReport 工程进展问题
     */
    public void setPrwProgressReport(String prwProgressReport) {
        this.prwProgressReport = prwProgressReport;
    }

    /**
     * 获取未开工原因
     *
     * @return prw_reason - 未开工原因
     */
    public String getPrwReason() {
        return prwReason;
    }

    /**
     * 设置未开工原因
     *
     * @param prwReason 未开工原因
     */
    public void setPrwReason(String prwReason) {
        this.prwReason = prwReason;
    }

    /**
     * 获取未完工说明 
     *
     * @return prw_explain - 未完工说明 
     */
    public String getPrwExplain() {
        return prwExplain;
    }

    /**
     * 设置未完工说明 
     *
     * @param prwExplain 未完工说明 
     */
    public void setPrwExplain(String prwExplain) {
        this.prwExplain = prwExplain;
    }

    /**
     * 获取预算价
     *
     * @return prw_budget - 预算价
     */
    public Double getPrwBudget() {
        return prwBudget;
    }

    /**
     * 设置预算价
     *
     * @param prwBudget 预算价
     */
    public void setPrwBudget(Double prwBudget) {
        this.prwBudget = prwBudget;
    }

    /**
     * 获取结算价
     *
     * @return prw_settlement - 结算价
     */
    public Double getPrwSettlement() {
        return prwSettlement;
    }

    /**
     * 设置结算价
     *
     * @param prwSettlement 结算价
     */
    public void setPrwSettlement(Double prwSettlement) {
        this.prwSettlement = prwSettlement;
    }

    /**
     * 获取累计投入人力
     *
     * @return prw_manpower - 累计投入人力
     */
    public Integer getPrwManpower() {
        return prwManpower;
    }

    /**
     * 设置累计投入人力
     *
     * @param prwManpower 累计投入人力
     */
    public void setPrwManpower(Integer prwManpower) {
        this.prwManpower = prwManpower;
    }

    /**
     * 获取施工
     *
     * @return prw_road_work - 施工
     */
    public Double getPrwRoadWork() {
        return prwRoadWork;
    }

    /**
     * 设置施工
     *
     * @param prwRoadWork 施工
     */
    public void setPrwRoadWork(Double prwRoadWork) {
        this.prwRoadWork = prwRoadWork;
    }

    /**
     * 获取所属街道办事处
     *
     * @return prw_address - 所属街道办事处
     */
    public String getPrwAddress() {
        return prwAddress;
    }

    /**
     * 设置所属街道办事处
     *
     * @param prwAddress 所属街道办事处
     */
    public void setPrwAddress(String prwAddress) {
        this.prwAddress = prwAddress;
    }

    /**
     * 获取涉及道路名称
     *
     * @return prw_road_name - 涉及道路名称
     */
    public String getPrwRoadName() {
        return prwRoadName;
    }

    /**
     * 设置涉及道路名称
     *
     * @param prwRoadName 涉及道路名称
     */
    public void setPrwRoadName(String prwRoadName) {
        this.prwRoadName = prwRoadName;
    }

    /**
     * 获取起点
     *
     * @return prw_origin - 起点
     */
    public String getPrwOrigin() {
        return prwOrigin;
    }

    /**
     * 设置起点
     *
     * @param prwOrigin 起点
     */
    public void setPrwOrigin(String prwOrigin) {
        this.prwOrigin = prwOrigin;
    }

    /**
     * 获取止点
     *
     * @return prw_stop - 止点
     */
    public String getPrwStop() {
        return prwStop;
    }

    /**
     * 设置止点
     *
     * @param prwStop 止点
     */
    public void setPrwStop(String prwStop) {
        this.prwStop = prwStop;
    }

    /**
     * 获取道路权属
     *
     * @return prw_ownership - 道路权属
     */
    public Integer getPrwOwnership() {
        return prwOwnership;
    }

    /**
     * 设置道路权属
     *
     * @param prwOwnership 道路权属
     */
    public void setPrwOwnership(Integer prwOwnership) {
        this.prwOwnership = prwOwnership;
    }

    /**
     * 获取是否随大修路
     *
     * @return prw_repair - 是否随大修路
     */
    public Integer getPrwRepair() {
        return prwRepair;
    }

    /**
     * 设置是否随大修路
     *
     * @param prwRepair 是否随大修路
     */
    public void setPrwRepair(Integer prwRepair) {
        this.prwRepair = prwRepair;
    }

    /**
     * 获取是否非开挖
     *
     * @return prw_excavation - 是否非开挖
     */
    public Integer getPrwExcavation() {
        return prwExcavation;
    }

    /**
     * 设置是否非开挖
     *
     * @param prwExcavation 是否非开挖
     */
    public void setPrwExcavation(Integer prwExcavation) {
        this.prwExcavation = prwExcavation;
    }

    /**
     * 获取预判施工工时
     *
     * @return prw_preliminary_time - 预判施工工时
     */
    public String getPrwPreliminaryTime() {
        return prwPreliminaryTime;
    }

    /**
     * 设置预判施工工时
     *
     * @param prwPreliminaryTime 预判施工工时
     */
    public void setPrwPreliminaryTime(String prwPreliminaryTime) {
        this.prwPreliminaryTime = prwPreliminaryTime;
    }

    /**
     * 获取施工员
     *
     * @return prw_user_id - 施工员
     */
    public String getPrwUserId() {
        return prwUserId;
    }

    /**
     * 设置施工员
     *
     * @param prwUserId 施工员
     */
    public void setPrwUserId(String prwUserId) {
        this.prwUserId = prwUserId;
    }

    /**
     * 获取电话
     *
     * @return prw_phone - 电话
     */
    public String getPrwPhone() {
        return prwPhone;
    }

    /**
     * 设置电话
     *
     * @param prwPhone 电话
     */
    public void setPrwPhone(String prwPhone) {
        this.prwPhone = prwPhone;
    }

    /**
     * 获取路管情况
     *
     * @return prw_condition - 路管情况
     */
    public Integer getPrwCondition() {
        return prwCondition;
    }

    /**
     * 设置路管情况
     *
     * @param prwCondition 路管情况
     */
    public void setPrwCondition(Integer prwCondition) {
        this.prwCondition = prwCondition;
    }

    /**
     * 获取创建人
     *
     * @return prw_creator - 创建人
     */
    public Integer getPrwCreator() {
        return prwCreator;
    }

    /**
     * 设置创建人
     *
     * @param prwCreator 创建人
     */
    public void setPrwCreator(Integer prwCreator) {
        this.prwCreator = prwCreator;
    }

    /**
     * 获取创建时间
     *
     * @return prw_create_at - 创建时间
     */
    public String getPrwCreateAt() {
        return prwCreateAt;
    }

    /**
     * 设置创建时间
     *
     * @param prwCreateAt 创建时间
     */
    public void setPrwCreateAt(String prwCreateAt) {
        this.prwCreateAt = prwCreateAt;
    }
}