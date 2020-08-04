/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author richard.oyeleke
 */
@Entity
@Table(name = "rent_payments")
public class RentPayments implements Serializable
{
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id") 
    private Integer id;
    private short hasPaid;
    private Integer tenantId;
    private Integer apartmentId;
    private String pastPaymentDate;
    private double repositoryFund;
    private short hasPaidFirstRent;
    private short hasPaidRentiCover;
    private String rentiCoverRefundDate;
    private Date createTime;
    private Date update;

    public RentPayments() {
    }

    public RentPayments(Integer id, short hasPaid, Integer tenantId, Integer apartmentId, String pastPaymentDate, double repositoryFund, short hasPaidFirstRent, short hasPaidRentiCover, String rentiCoverRefundDate, Date createTime, Date update) {
        this.id = id;
        this.hasPaid = hasPaid;
        this.tenantId = tenantId;
        this.apartmentId = apartmentId;
        this.pastPaymentDate = pastPaymentDate;
        this.repositoryFund = repositoryFund;
        this.hasPaidFirstRent = hasPaidFirstRent;
        this.hasPaidRentiCover = hasPaidRentiCover;
        this.rentiCoverRefundDate = rentiCoverRefundDate;
        this.createTime = createTime;
        this.update = update;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(short hasPaid) {
        this.hasPaid = hasPaid;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getPastPaymentDate() {
        return pastPaymentDate;
    }

    public void setPastPaymentDate(String pastPaymentDate) {
        this.pastPaymentDate = pastPaymentDate;
    }

    public double getRepositoryFund() {
        return repositoryFund;
    }

    public void setRepositoryFund(double repositoryFund) {
        this.repositoryFund = repositoryFund;
    }

    public short getHasPaidFirstRent() {
        return hasPaidFirstRent;
    }

    public void setHasPaidFirstRent(short hasPaidFirstRent) {
        this.hasPaidFirstRent = hasPaidFirstRent;
    }

    public short getHasPaidRentiCover() {
        return hasPaidRentiCover;
    }

    public void setHasPaidRentiCover(short hasPaidRentiCover) {
        this.hasPaidRentiCover = hasPaidRentiCover;
    }

    public String getRentiCoverRefundDate() {
        return rentiCoverRefundDate;
    }

    public void setRentiCoverRefundDate(String rentiCoverRefundDate) {
        this.rentiCoverRefundDate = rentiCoverRefundDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return "RentPayments{" + "id=" + id + ", hasPaid=" + hasPaid + ", tenantId=" + tenantId + ", apartmentId=" + apartmentId + ", pastPaymentDate=" + pastPaymentDate + ", repositoryFund=" + repositoryFund + ", hasPaidFirstRent=" + hasPaidFirstRent + ", hasPaidRentiCover=" + hasPaidRentiCover + ", rentiCoverRefundDate=" + rentiCoverRefundDate + ", createTime=" + createTime + ", update=" + update + '}';
    }
    
}
