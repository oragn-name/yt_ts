package com.study.model;

import javax.persistence.*;

@Table(name = "project_contract_send")
public class ProjectContractSend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pcs_year")
    private Integer pcsYear;

    @Column(name = "pcs_month")
    private String pcsMonth;

    @Column(name = "pcs_length")
    private Double pcsLength;

    @Column(name = "pcs_money")
    private Double pcsMoney;

    @Column(name = "pcs_remark")
    private String pcsRemark;

    @Column(name = "pc_id")
    private Integer pcId;

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
     * @return pcs_year
     */
    public Integer getPcsYear() {
        return pcsYear;
    }

    /**
     * @param pcsYear
     */
    public void setPcsYear(Integer pcsYear) {
        this.pcsYear = pcsYear;
    }

    /**
     * @return pcs_month
     */
    public String getPcsMonth() {
        return pcsMonth;
    }

    /**
     * @param pcsMonth
     */
    public void setPcsMonth(String pcsMonth) {
        this.pcsMonth = pcsMonth;
    }

    /**
     * @return pcs_length
     */
    public Double getPcsLength() {
        return pcsLength;
    }

    /**
     * @param pcsLength
     */
    public void setPcsLength(Double pcsLength) {
        this.pcsLength = pcsLength;
    }

    /**
     * @return pcs_money
     */
    public Double getPcsMoney() {
        return pcsMoney;
    }

    /**
     * @param pcsMoney
     */
    public void setPcsMoney(Double pcsMoney) {
        this.pcsMoney = pcsMoney;
    }

    /**
     * @return pcs_remark
     */
    public String getPcsRemark() {
        return pcsRemark;
    }

    /**
     * @param pcsRemark
     */
    public void setPcsRemark(String pcsRemark) {
        this.pcsRemark = pcsRemark;
    }

    /**
     * @return pc_id
     */
    public Integer getPcId() {
        return pcId;
    }

    /**
     * @param pcId
     */
    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }
}