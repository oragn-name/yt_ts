package com.study.model;

import javax.persistence.*;

@Table(name = "project_road_work_daily")
public class ProjectRoadWorkDaily {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pro_id")
    private Integer proId;
    
    @Column(name = "pc_id")
    private Integer pcId;
    
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * DN15
     */
    @Column(name = "prwd_one")
    private Double prwdOne;

    /**
     * DN20
     */
    @Column(name = "prwd_two")
    private Double prwdTwo;

    /**
     * DN25
     */
    @Column(name = "prwd_three")
    private Double prwdThree;

    /**
     * DN40
     */
    @Column(name = "prwd_four")
    private Double prwdFour;

    /**
     * DN50
     */
    @Column(name = "prwd_five")
    private Double prwdFive;

    /**
     * DN75
     */
    @Column(name = "prwd_six")
    private Double prwdSix;

    /**
     * DN100
     */
    @Column(name = "prwd_seven")
    private Double prwdSeven;

    /**
     * DN150
     */
    @Column(name = "prwd_eight")
    private Double prwdEight;

    /**
     * DN200
     */
    @Column(name = "prwd_nine")
    private Double prwdNine;

    /**
     * 小计
     */
    @Column(name = "prwd_subtotal")
    private Double prwdSubtotal;

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
     * 获取DN15
     *
     * @return prwd_one - DN15
     */
    public Double getPrwdOne() {
        return prwdOne;
    }

    /**
     * 设置DN15
     *
     * @param prwdOne DN15
     */
    public void setPrwdOne(Double prwdOne) {
        this.prwdOne = prwdOne;
    }

    /**
     * 获取DN20
     *
     * @return prwd_two - DN20
     */
    public Double getPrwdTwo() {
        return prwdTwo;
    }

    /**
     * 设置DN20
     *
     * @param prwdTwo DN20
     */
    public void setPrwdTwo(Double prwdTwo) {
        this.prwdTwo = prwdTwo;
    }

    /**
     * 获取DN25
     *
     * @return prwd_three - DN25
     */
    public Double getPrwdThree() {
        return prwdThree;
    }

    /**
     * 设置DN25
     *
     * @param prwdThree DN25
     */
    public void setPrwdThree(Double prwdThree) {
        this.prwdThree = prwdThree;
    }

    /**
     * 获取DN40
     *
     * @return prwd_four - DN40
     */
    public Double getPrwdFour() {
        return prwdFour;
    }

    /**
     * 设置DN40
     *
     * @param prwdFour DN40
     */
    public void setPrwdFour(Double prwdFour) {
        this.prwdFour = prwdFour;
    }

    /**
     * 获取DN50
     *
     * @return prwd_five - DN50
     */
    public Double getPrwdFive() {
        return prwdFive;
    }

    /**
     * 设置DN50
     *
     * @param prwdFive DN50
     */
    public void setPrwdFive(Double prwdFive) {
        this.prwdFive = prwdFive;
    }

    /**
     * 获取DN75
     *
     * @return prwd_six - DN75
     */
    public Double getPrwdSix() {
        return prwdSix;
    }

    /**
     * 设置DN75
     *
     * @param prwdSix DN75
     */
    public void setPrwdSix(Double prwdSix) {
        this.prwdSix = prwdSix;
    }

    /**
     * 获取DN100
     *
     * @return prwd_seven - DN100
     */
    public Double getPrwdSeven() {
        return prwdSeven;
    }

    /**
     * 设置DN100
     *
     * @param prwdSeven DN100
     */
    public void setPrwdSeven(Double prwdSeven) {
        this.prwdSeven = prwdSeven;
    }

    /**
     * 获取DN150
     *
     * @return prwd_eight - DN150
     */
    public Double getPrwdEight() {
        return prwdEight;
    }

    /**
     * 设置DN150
     *
     * @param prwdEight DN150
     */
    public void setPrwdEight(Double prwdEight) {
        this.prwdEight = prwdEight;
    }

    /**
     * 获取DN200
     *
     * @return prwd_nine - DN200
     */
    public Double getPrwdNine() {
        return prwdNine;
    }

    /**
     * 设置DN200
     *
     * @param prwdNine DN200
     */
    public void setPrwdNine(Double prwdNine) {
        this.prwdNine = prwdNine;
    }

    /**
     * 获取小计
     *
     * @return prwd_subtotal - 小计
     */
    public Double getPrwdSubtotal() {
        return prwdSubtotal;
    }

    public Integer getProId() {
      return proId;
    }

    public void setProId(Integer proId) {
      this.proId = proId;
    }

    /**
     * 设置小计
     *
     * @param prwdSubtotal 小计
     */
    public void setPrwdSubtotal(Double prwdSubtotal) {
        this.prwdSubtotal = prwdSubtotal;
    }

    public String getCreateTime() {
      return createTime;
    }

    public void setCreateTime(String createTime) {
      this.createTime = createTime;
    }

    public Integer getCreateUser() {
      return createUser;
    }

    public void setCreateUser(Integer createUser) {
      this.createUser = createUser;
    }

    public Integer getPcId() {
      return pcId;
    }

    public void setPcId(Integer pcId) {
      this.pcId = pcId;
    }
    
}