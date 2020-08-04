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
@Table(name = "rent_payment_receipts")
public class RentPaymentsReceipts implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id") 
    private Integer id;
    private Integer paidTo;
    private Integer apartmentId;
    private Integer tenantId;
    private double amountPaid;
    private String rentPaymentDate;
    private String receiptImage;
    private enum payment_confirmation{pending,accepted,declined};
    private Date createTime;
    private Date updateTime;

    public RentPaymentsReceipts() {
    }

    public RentPaymentsReceipts(Integer id, Integer paidTo, Integer apartmentId, Integer tenantId, double amountPaid, String rentPaymentDate, String receiptImage, Date createTime, Date updateTime) {
        this.id = id;
        this.paidTo = paidTo;
        this.apartmentId = apartmentId;
        this.tenantId = tenantId;
        this.amountPaid = amountPaid;
        this.rentPaymentDate = rentPaymentDate;
        this.receiptImage = receiptImage;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaidTo() {
        return paidTo;
    }

    public void setPaidTo(Integer paidTo) {
        this.paidTo = paidTo;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getRentPaymentDate() {
        return rentPaymentDate;
    }

    public void setRentPaymentDate(String rentPaymentDate) {
        this.rentPaymentDate = rentPaymentDate;
    }

    public String getReceiptImage() {
        return receiptImage;
    }

    public void setReceiptImage(String receiptImage) {
        this.receiptImage = receiptImage;
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
        return "RentPaymentsReceipts{" + "id=" + id + ", paidTo=" + paidTo + ", apartmentId=" + apartmentId + ", tenantId=" + tenantId + ", amountPaid=" + amountPaid + ", rentPaymentDate=" + rentPaymentDate + ", receiptImage=" + receiptImage + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
