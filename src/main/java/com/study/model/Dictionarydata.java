package com.study.model;

import javax.persistence.*;

public class Dictionarydata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dictdata_name")
    private String dictdataName;

    @Column(name = "dictdata_code")
    private String dictdataCode;

    @Column(name = "dictdata_mark")
    private String dictdataMark;

    @Column(name = "dict_id")
    private Integer dictId;

    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "dictdata_number")
    private Double dictdataNumber;
    @Column(name = "dictdata_length")
    private Double dictdataLength;
    @Column(name = "dictdata_day")
    private Integer dictdataDay;
    
    @Transient
    private String parentName;
    @Transient
    private String parentdataName;
    
    @Transient
    private String dictCode;
    
    @Transient
    private Integer count;
    
    
    @Transient
    private Integer one;
    
    @Transient
    private Double oneDay;
    
    @Transient
    private Integer two;
    
    @Transient
    private Double twoDay;
    
    @Transient
    private Integer three;
    
    @Transient
    private Double threeDay;
    
    
    
    

    public Integer getOne() {
      return one;
    }

    public void setOne(Integer one) {
      this.one = one;
    }

    public Double getOneDay() {
      return oneDay;
    }

    public void setOneDay(Double oneDay) {
      this.oneDay = oneDay;
    }

    public Integer getTwo() {
      return two;
    }

    public void setTwo(Integer two) {
      this.two = two;
    }

    public Double getTwoDay() {
      return twoDay;
    }

    public void setTwoDay(Double twoDay) {
      this.twoDay = twoDay;
    }

    public Integer getThree() {
      return three;
    }

    public void setThree(Integer three) {
      this.three = three;
    }

    public Double getThreeDay() {
      return threeDay;
    }

    public void setThreeDay(Double threeDay) {
      this.threeDay = threeDay;
    }

    public Integer getCount() {
      return count;
    }

    public void setCount(Integer count) {
      this.count = count;
    }

    public String getDictCode() {
      return dictCode;
    }

    public void setDictCode(String dictCode) {
      this.dictCode = dictCode;
    }

    public String getParentdataName() {
      return parentdataName;
    }

    public void setParentdataName(String parentdataName) {
      this.parentdataName = parentdataName;
    }

    public String getParentName() {
      return parentName;
    }

    public void setParentName(String parentName) {
      this.parentName = parentName;
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
     * @return dictdata_name
     */
    public String getDictdataName() {
        return dictdataName;
    }

    /**
     * @param dictdataName
     */
    public void setDictdataName(String dictdataName) {
        this.dictdataName = dictdataName;
    }

    /**
     * @return dictdata_code
     */
    public String getDictdataCode() {
        return dictdataCode;
    }

    /**
     * @param dictdataCode
     */
    public void setDictdataCode(String dictdataCode) {
        this.dictdataCode = dictdataCode;
    }

    /**
     * @return dictdata_mark
     */
    public String getDictdataMark() {
        return dictdataMark;
    }

    /**
     * @param dictdataMark
     */
    public void setDictdataMark(String dictdataMark) {
        this.dictdataMark = dictdataMark;
    }

    /**
     * @return dict_id
     */
    public Integer getDictId() {
        return dictId;
    }

    /**
     * @param dictId
     */
    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Double getDictdataNumber() {
      return dictdataNumber;
    }

    public void setDictdataNumber(Double dictdataNumber) {
      this.dictdataNumber = dictdataNumber;
    }

    public Double getDictdataLength() {
      return dictdataLength;
    }

    public void setDictdataLength(Double dictdataLength) {
      this.dictdataLength = dictdataLength;
    }

    public Integer getDictdataDay() {
      return dictdataDay;
    }

    public void setDictdataDay(Integer dictdataDay) {
      this.dictdataDay = dictdataDay;
    }
    
    
}