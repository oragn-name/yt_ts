package com.study.model.vo;

import java.io.Serializable;

import javax.persistence.Column;

public class ProjectDetail implements Serializable {
   private String proNumber;//工号
   
   private String proSnapNumber;//临时工号
   
   private String proSerialNumber;//序号
   
   private String proName;//项目名称
   
   private String proSourceName;//工程来源
   
   private String proNatureName;//工程性质
   
   private String proEngineTypeName;//工程类别
   
   private String proPeriodName;//期次
   
   private String prwAst;//实际开工时间
   
   private String prwAet;//实际竣工时间
   
   private String dateTime;//日期
   
   private String pcDeptName;//施工单位
   
   private Double prwBudget;//预算
   
   private Double proDesignLength;//设计长度

  
   /**
    * DN15
    */
   private Double prwdOne;

   /**
    * DN20
    */
   private Double prwdTwo;

   /**
    * DN25
    */
   private Double prwdThree;

   /**
    * DN40
    */
   private Double prwdFour;

   /**
    * DN50
    */
   private Double prwdFive;

   /**
    * DN75
    */
   private Double prwdSix;

   /**
    * DN100
    */
   private Double prwdSeven;

   /**
    * DN150
    */
   private Double prwdEight;

   /**
    * DN200
    */
   private Double prwdNine;

   /**
    * 小计
    */
   private Double prwdSubtotal;
   
   
   
   /**
    * DN15
    */
   private Double prwdOneNext;

   /**
    * DN20
    */
   private Double prwdTwoNext;

   /**
    * DN25
    */
   private Double prwdThreeNext;

   /**
    * DN40
    */
   private Double prwdFourNext;

   /**
    * DN50
    */
   private Double prwdFiveNext;

   /**
    * DN75
    */
   private Double prwdSixNext;

   /**
    * DN100
    */
   private Double prwdSevenNext;

   /**
    * DN150
    */
   private Double prwdEightNext;

   /**
    * DN200
    */
   private Double prwdNineNext;

   /**
    * 小计
    */
   private Double prwdSubtotalNext;
   
   
   private Double prDmaOne;
   
   private Double prDmaTwo;
   
   private Double prDmaThree;
   
   private Double prDmaFour;
   
   private Double prDmaFive;
   
   private Double prDmaSix;
   
   private Double prDmaSeven;
   
   private Double prDmaEight;
   
   private Double prDmaNine;
   
   private Double prDmaSubtotal;
   
   private Double prDmaOneNext;
   
   private Double prDmaTwoNext;
   
   private Double prDmaThreeNext;
   
   private Double prDmaFourNext;
   
   private Double prDmaFiveNext;
   
   private Double prDmaSixNext;
   
   private Double prDmaSevenNext;
   
   private Double prDmaEightNext;
   
   private Double prDmaNineNext;
   
   private Double prDmaSubtotalNext;
   
   
   private Double prTube;
   private Double prTubeNext;
   private Double prLining;
   private Double prLiningNext;
   private Double prEnca;
   private Double prEncaNext;
   private String prHead;
   private String prRinse;
   private String prConstru;
   
   
   
   
   private Double prwOne;
   
   private Double prwTwo;

   /**
    * DN25
    */
   private Double prwThree;

   /**
    * DN40
    */
   private Double prwFour;

   /**
    * DN50
    */
   private Double prwFive;

   /**
    * DN75
    */
   private Double prwSix;

   /**
    * DN100
    */
   private Double prwSeven;

   /**
    * DN150
    */
   private Double prwEight;

   /**
    * DN200
    */
   private Double prwNine;

   /**
    * 小计
    */
   private Double prwSubtotal;
   
   /**
    * DN15
    */
   private Double prwOneNext;

   /**
    * DN20
    */
   private Double prwTwoNext;

   /**
    * DN25
    */
   private Double prwThreeNext;

   /**
    * DN40
    */
   private Double prwFourNext;

   /**
    * DN50
    */
   private Double prwFiveNext;

   /**
    * DN75
    */
   private Double prwSixNext;

   /**
    * DN100
    */
   private Double prwSevenNext;

   /**
    * DN150
    */
   private Double prwEightNext;

   /**
    * DN200
    */
   private Double prwNineNext;

   /**
    * 小计
    */
   private Double prwSubtotalNext;
   
   
   public String getProNumber() {
    return proNumber;
  }

  public void setProNumber(String proNumber) {
    this.proNumber = proNumber;
  }

  public String getProSnapNumber() {
    return proSnapNumber;
  }

  public void setProSnapNumber(String proSnapNumber) {
    this.proSnapNumber = proSnapNumber;
  }

  public String getProSerialNumber() {
    return proSerialNumber;
  }

  public void setProSerialNumber(String proSerialNumber) {
    this.proSerialNumber = proSerialNumber;
  }

  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }

  public String getProSourceName() {
    return proSourceName;
  }

  public void setProSourceName(String proSourceName) {
    this.proSourceName = proSourceName;
  }

  public String getProNatureName() {
    return proNatureName;
  }

  public void setProNatureName(String proNatureName) {
    this.proNatureName = proNatureName;
  }

  public String getProEngineTypeName() {
    return proEngineTypeName;
  }

  public void setProEngineTypeName(String proEngineTypeName) {
    this.proEngineTypeName = proEngineTypeName;
  }

  public String getProPeriodName() {
    return proPeriodName;
  }

  public void setProPeriodName(String proPeriodName) {
    this.proPeriodName = proPeriodName;
  }

  public String getPrwAst() {
    return prwAst;
  }

  public void setPrwAst(String prwAst) {
    this.prwAst = prwAst;
  }

  public String getPrwAet() {
    return prwAet;
  }

  public void setPrwAet(String prwAet) {
    this.prwAet = prwAet;
  }

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public String getPcDeptName() {
    return pcDeptName;
  }

  public void setPcDeptName(String pcDeptName) {
    this.pcDeptName = pcDeptName;
  }

  public Double getPrwdOne() {
    return prwdOne;
  }

  public void setPrwdOne(Double prwdOne) {
    this.prwdOne = prwdOne;
  }

  public Double getPrwdTwo() {
    return prwdTwo;
  }

  public void setPrwdTwo(Double prwdTwo) {
    this.prwdTwo = prwdTwo;
  }

  public Double getPrwdThree() {
    return prwdThree;
  }

  public void setPrwdThree(Double prwdThree) {
    this.prwdThree = prwdThree;
  }

  public Double getPrwdFour() {
    return prwdFour;
  }

  public void setPrwdFour(Double prwdFour) {
    this.prwdFour = prwdFour;
  }

  public Double getPrwdFive() {
    return prwdFive;
  }

  public void setPrwdFive(Double prwdFive) {
    this.prwdFive = prwdFive;
  }

  public Double getPrwdSix() {
    return prwdSix;
  }

  public void setPrwdSix(Double prwdSix) {
    this.prwdSix = prwdSix;
  }

  public Double getPrwdSeven() {
    return prwdSeven;
  }

  public void setPrwdSeven(Double prwdSeven) {
    this.prwdSeven = prwdSeven;
  }

  public Double getPrwdEight() {
    return prwdEight;
  }

  public void setPrwdEight(Double prwdEight) {
    this.prwdEight = prwdEight;
  }

  public Double getPrwdNine() {
    return prwdNine;
  }

  public void setPrwdNine(Double prwdNine) {
    this.prwdNine = prwdNine;
  }

  public Double getPrwdSubtotal() {
    return prwdSubtotal;
  }

  public void setPrwdSubtotal(Double prwdSubtotal) {
    this.prwdSubtotal = prwdSubtotal;
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

  public Double getPrDmaSeven() {
    return prDmaSeven;
  }

  public void setPrDmaSeven(Double prDmaSeven) {
    this.prDmaSeven = prDmaSeven;
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


  public Double getPrDmaSubtotalNext() {
    return prDmaSubtotalNext;
  }

  public void setPrDmaSubtotalNext(Double prDmaSubtotalNext) {
    this.prDmaSubtotalNext = prDmaSubtotalNext;
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

  public Double getPrwOne() {
    return prwOne;
  }

  public void setPrwOne(Double prwOne) {
    this.prwOne = prwOne;
  }

  public Double getPrwTwo() {
    return prwTwo;
  }

  public void setPrwTwo(Double prwTwo) {
    this.prwTwo = prwTwo;
  }

  public Double getPrwThree() {
    return prwThree;
  }

  public void setPrwThree(Double prwThree) {
    this.prwThree = prwThree;
  }

  public Double getPrwFour() {
    return prwFour;
  }

  public void setPrwFour(Double prwFour) {
    this.prwFour = prwFour;
  }

  public Double getPrwFive() {
    return prwFive;
  }

  public void setPrwFive(Double prwFive) {
    this.prwFive = prwFive;
  }

  public Double getPrwSix() {
    return prwSix;
  }

  public void setPrwSix(Double prwSix) {
    this.prwSix = prwSix;
  }

  public Double getPrwSeven() {
    return prwSeven;
  }

  public void setPrwSeven(Double prwSeven) {
    this.prwSeven = prwSeven;
  }

  public Double getPrwEight() {
    return prwEight;
  }

  public void setPrwEight(Double prwEight) {
    this.prwEight = prwEight;
  }

  public Double getPrwNine() {
    return prwNine;
  }

  public void setPrwNine(Double prwNine) {
    this.prwNine = prwNine;
  }

  public Double getPrwSubtotal() {
    return prwSubtotal;
  }

  public void setPrwSubtotal(Double prwSubtotal) {
    this.prwSubtotal = prwSubtotal;
  }

  public Double getPrwOneNext() {
    return prwOneNext;
  }

  public void setPrwOneNext(Double prwOneNext) {
    this.prwOneNext = prwOneNext;
  }

  public Double getPrwTwoNext() {
    return prwTwoNext;
  }

  public void setPrwTwoNext(Double prwTwoNext) {
    this.prwTwoNext = prwTwoNext;
  }

  public Double getPrwThreeNext() {
    return prwThreeNext;
  }

  public void setPrwThreeNext(Double prwThreeNext) {
    this.prwThreeNext = prwThreeNext;
  }

  public Double getPrwFourNext() {
    return prwFourNext;
  }

  public void setPrwFourNext(Double prwFourNext) {
    this.prwFourNext = prwFourNext;
  }

  public Double getPrwFiveNext() {
    return prwFiveNext;
  }

  public void setPrwFiveNext(Double prwFiveNext) {
    this.prwFiveNext = prwFiveNext;
  }

  public Double getPrwSixNext() {
    return prwSixNext;
  }

  public void setPrwSixNext(Double prwSixNext) {
    this.prwSixNext = prwSixNext;
  }

  public Double getPrwSevenNext() {
    return prwSevenNext;
  }

  public void setPrwSevenNext(Double prwSevenNext) {
    this.prwSevenNext = prwSevenNext;
  }

  public Double getPrwEightNext() {
    return prwEightNext;
  }

  public void setPrwEightNext(Double prwEightNext) {
    this.prwEightNext = prwEightNext;
  }

  public Double getPrwNineNext() {
    return prwNineNext;
  }

  public void setPrwNineNext(Double prwNineNext) {
    this.prwNineNext = prwNineNext;
  }

  public Double getPrwSubtotalNext() {
    return prwSubtotalNext;
  }

  public void setPrwSubtotalNext(Double prwSubtotalNext) {
    this.prwSubtotalNext = prwSubtotalNext;
  }

  public Double getPrwBudget() {
    return prwBudget;
  }

  public void setPrwBudget(Double prwBudget) {
    this.prwBudget = prwBudget;
  }

  public Double getProDesignLength() {
    return proDesignLength;
  }

  public void setProDesignLength(Double proDesignLength) {
    this.proDesignLength = proDesignLength;
  }
   
   
   
   
   
}
