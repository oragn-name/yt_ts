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
     * DN15
     */
    @Column(name = "prwd_one_next")
    private Double prwdOneNext;

    /**
     * DN20
     */
    @Column(name = "prwd_two_next")
    private Double prwdTwoNext;

    /**
     * DN25
     */
    @Column(name = "prwd_three_next")
    private Double prwdThreeNext;

    /**
     * DN40
     */
    @Column(name = "prwd_four_next")
    private Double prwdFourNext;

    /**
     * DN50
     */
    @Column(name = "prwd_five_next")
    private Double prwdFiveNext;

    /**
     * DN75
     */
    @Column(name = "prwd_six_next")
    private Double prwdSixNext;

    /**
     * DN100
     */
    @Column(name = "prwd_seven_next")
    private Double prwdSevenNext;

    /**
     * DN150
     */
    @Column(name = "prwd_eight_next")
    private Double prwdEightNext;

    /**
     * DN200
     */
    @Column(name = "prwd_nine_next")
    private Double prwdNineNext;

    /**
     * 小计
     */
    @Column(name = "prwd_subtotal_next")
    private Double prwdSubtotalNext;
    
    
    @Column(name = "pr_dma_one")
    private Double prDmaOne;
    
    @Column(name = "pr_dma_two")
    private Double prDmaTwo;
    
    @Column(name = "pr_dma_three")
    private Double prDmaThree;
    
    @Column(name = "pr_dma_four")
    private Double prDmaFour;
    
    @Column(name = "pr_dma_five")
    private Double prDmaFive;
    
    @Column(name = "pr_dma_six")
    private Double prDmaSix;
    
    @Column(name = "pr_dma_seven")
    private Double prDmaSeven;
    
    @Column(name = "pr_dma_eight")
    private Double prDmaEight;
    
    @Column(name = "pr_dma_nine")
    private Double prDmaNine;
    
    @Column(name = "pr_dma_subtotal")
    private Double prDmaSubtotal;
    
    @Column(name = "pr_dma_one_next")
    private Double prDmaOneNext;
    
    @Column(name = "pr_dma_two_next")
    private Double prDmaTwoNext;
    
    @Column(name = "pr_dma_three_next")
    private Double prDmaThreeNext;
    
    @Column(name = "pr_dma_four_next")
    private Double prDmaFourNext;
    
    @Column(name = "pr_dma_five_next")
    private Double prDmaFiveNext;
    
    @Column(name = "pr_dma_six_next")
    private Double prDmaSixNext;
    
    @Column(name = "pr_dma_seven_next")
    private Double prDmaSevenNext;
    
    @Column(name = "pr_dma_eight_next")
    private Double prDmaEightNext;
    
    @Column(name = "pr_dma_nine_next")
    private Double prDmaNineNext;
    
    @Column(name = "pr_dma_subtotal_next")
    private Double prDmaSubtotal_next;
    
    
    @Column(name = "pr_tube")
    private Double prTube;
    @Column(name = "pr_tube_next")
    private Double prTubeNext;
    @Column(name = "pr_lining")
    private Double prLining;
    @Column(name = "pr_lining_next")
    private Double prLiningNext;
    @Column(name = "pr_enca")
    private Double prEnca;
    @Column(name = "pr_enca_next")
    private Double prEncaNext;
    @Column(name = "pr_head")
    private String prHead;
    @Column(name = "pr_rinse")
    private String prRinse;
    @Column(name = "pr_constru")
    private String prConstru;
    
    

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

    public Double getPrDmaOne() {
      return prDmaOne;
    }

    public void setPrDmaOne(Double prDmaOne) {
      this.prDmaOne = prDmaOne;
    }

    public Double getPrDmaTwo() {
      return prDmaTwo;
    }

    public void setPrDmaTwo(Double prDmaTwo) {
      this.prDmaTwo = prDmaTwo;
    }

    public Double getPrDmaThree() {
      return prDmaThree;
    }

    public void setPrDmaThree(Double prDmaThree) {
      this.prDmaThree = prDmaThree;
    }

    public Double getPrDmaFour() {
      return prDmaFour;
    }

    public void setPrDmaFour(Double prDmaFour) {
      this.prDmaFour = prDmaFour;
    }

    public Double getPrDmaFive() {
      return prDmaFive;
    }

    public void setPrDmaFive(Double prDmaFive) {
      this.prDmaFive = prDmaFive;
    }

    public Double getPrDmaSix() {
      return prDmaSix;
    }

    public void setPrDmaSix(Double prDmaSix) {
      this.prDmaSix = prDmaSix;
    }


    public Double getPrDmaEight() {
      return prDmaEight;
    }

    public void setPrDmaEight(Double prDmaEight) {
      this.prDmaEight = prDmaEight;
    }

    public Double getPrDmaNine() {
      return prDmaNine;
    }

    public void setPrDmaNine(Double prDmaNine) {
      this.prDmaNine = prDmaNine;
    }

    public Double getPrDmaSubtotal() {
      return prDmaSubtotal;
    }

    public void setPrDmaSubtotal(Double prDmaSubtotal) {
      this.prDmaSubtotal = prDmaSubtotal;
    }

    public Double getPrwdOneNext() {
      return prwdOneNext;
    }

    public void setPrwdOneNext(Double prwdOneNext) {
      this.prwdOneNext = prwdOneNext;
    }

    public Double getPrwdTwoNext() {
      return prwdTwoNext;
    }

    public void setPrwdTwoNext(Double prwdTwoNext) {
      this.prwdTwoNext = prwdTwoNext;
    }

    public Double getPrwdThreeNext() {
      return prwdThreeNext;
    }

    public void setPrwdThreeNext(Double prwdThreeNext) {
      this.prwdThreeNext = prwdThreeNext;
    }

    public Double getPrwdFourNext() {
      return prwdFourNext;
    }

    public void setPrwdFourNext(Double prwdFourNext) {
      this.prwdFourNext = prwdFourNext;
    }

    public Double getPrwdFiveNext() {
      return prwdFiveNext;
    }

    public void setPrwdFiveNext(Double prwdFiveNext) {
      this.prwdFiveNext = prwdFiveNext;
    }

    public Double getPrwdSixNext() {
      return prwdSixNext;
    }

    public void setPrwdSixNext(Double prwdSixNext) {
      this.prwdSixNext = prwdSixNext;
    }

    public Double getPrwdSevenNext() {
      return prwdSevenNext;
    }

    public void setPrwdSevenNext(Double prwdSevenNext) {
      this.prwdSevenNext = prwdSevenNext;
    }

    public Double getPrwdEightNext() {
      return prwdEightNext;
    }

    public void setPrwdEightNext(Double prwdEightNext) {
      this.prwdEightNext = prwdEightNext;
    }

    public Double getPrwdNineNext() {
      return prwdNineNext;
    }

    public void setPrwdNineNext(Double prwdNineNext) {
      this.prwdNineNext = prwdNineNext;
    }

    public Double getPrwdSubtotalNext() {
      return prwdSubtotalNext;
    }

    public void setPrwdSubtotalNext(Double prwdSubtotalNext) {
      this.prwdSubtotalNext = prwdSubtotalNext;
    }

    public Double getPrDmaSeven() {
      return prDmaSeven;
    }

    public void setPrDmaSeven(Double prDmaSeven) {
      this.prDmaSeven = prDmaSeven;
    }

    public Double getPrDmaOneNext() {
      return prDmaOneNext;
    }

    public void setPrDmaOneNext(Double prDmaOneNext) {
      this.prDmaOneNext = prDmaOneNext;
    }

    public Double getPrDmaTwoNext() {
      return prDmaTwoNext;
    }

    public void setPrDmaTwoNext(Double prDmaTwoNext) {
      this.prDmaTwoNext = prDmaTwoNext;
    }

    public Double getPrDmaThreeNext() {
      return prDmaThreeNext;
    }

    public void setPrDmaThreeNext(Double prDmaThreeNext) {
      this.prDmaThreeNext = prDmaThreeNext;
    }

    public Double getPrDmaFourNext() {
      return prDmaFourNext;
    }

    public void setPrDmaFourNext(Double prDmaFourNext) {
      this.prDmaFourNext = prDmaFourNext;
    }

    public Double getPrDmaFiveNext() {
      return prDmaFiveNext;
    }

    public void setPrDmaFiveNext(Double prDmaFiveNext) {
      this.prDmaFiveNext = prDmaFiveNext;
    }

    public Double getPrDmaSixNext() {
      return prDmaSixNext;
    }

    public void setPrDmaSixNext(Double prDmaSixNext) {
      this.prDmaSixNext = prDmaSixNext;
    }

    public Double getPrDmaSevenNext() {
      return prDmaSevenNext;
    }

    public void setPrDmaSevenNext(Double prDmaSevenNext) {
      this.prDmaSevenNext = prDmaSevenNext;
    }

    public Double getPrDmaEightNext() {
      return prDmaEightNext;
    }

    public void setPrDmaEightNext(Double prDmaEightNext) {
      this.prDmaEightNext = prDmaEightNext;
    }

    public Double getPrDmaNineNext() {
      return prDmaNineNext;
    }

    public void setPrDmaNineNext(Double prDmaNineNext) {
      this.prDmaNineNext = prDmaNineNext;
    }

    public Double getPrDmaSubtotal_next() {
      return prDmaSubtotal_next;
    }

    public void setPrDmaSubtotal_next(Double prDmaSubtotal_next) {
      this.prDmaSubtotal_next = prDmaSubtotal_next;
    }

    public Double getPrTube() {
      return prTube;
    }

    public void setPrTube(Double prTube) {
      this.prTube = prTube;
    }

    public Double getPrTubeNext() {
      return prTubeNext;
    }

    public void setPrTubeNext(Double prTubeNext) {
      this.prTubeNext = prTubeNext;
    }

    public Double getPrLining() {
      return prLining;
    }

    public void setPrLining(Double prLining) {
      this.prLining = prLining;
    }

    public Double getPrLiningNext() {
      return prLiningNext;
    }

    public void setPrLiningNext(Double prLiningNext) {
      this.prLiningNext = prLiningNext;
    }

    public Double getPrEnca() {
      return prEnca;
    }

    public void setPrEnca(Double prEnca) {
      this.prEnca = prEnca;
    }

    public Double getPrEncaNext() {
      return prEncaNext;
    }

    public void setPrEncaNext(Double prEncaNext) {
      this.prEncaNext = prEncaNext;
    }

    public String getPrHead() {
      return prHead;
    }

    public void setPrHead(String prHead) {
      this.prHead = prHead;
    }

    public String getPrRinse() {
      return prRinse;
    }

    public void setPrRinse(String prRinse) {
      this.prRinse = prRinse;
    }

    public String getPrConstru() {
      return prConstru;
    }

    public void setPrConstru(String prConstru) {
      this.prConstru = prConstru;
    }
    
}