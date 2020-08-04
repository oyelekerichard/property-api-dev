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
@Table(name = "rentremission_payment_history")
public class RentRemmissionPaymentHistory implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer landlordId;
    
    private Integer bankId;
    private Integer packageId;
    private String propertyIds;
    private double amountPaid;
    private Date createTime;
    private Date updateTime;

    public RentRemmissionPaymentHistory() {
    }

    public RentRemmissionPaymentHistory(Integer id, Integer landlordId, Integer bankId, Integer packageId, String propertyIds, double amountPaid, Date createTime, Date updateTime) {
        this.id = id;
        this.landlordId = landlordId;
        this.bankId = bankId;
        this.packageId = packageId;
        this.propertyIds = propertyIds;
        this.amountPaid = amountPaid;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Integer landlordId) {
        this.landlordId = landlordId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPropertyIds() {
        return propertyIds;
    }

    public void setPropertyIds(String propertyIds) {
        this.propertyIds = propertyIds;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "RentRemmissionPaymentHistory{" + "id=" + id + ", landlordId=" + landlordId + ", bankId=" + bankId + ", packageId=" + packageId + ", propertyIds=" + propertyIds + ", amountPaid=" + amountPaid + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
