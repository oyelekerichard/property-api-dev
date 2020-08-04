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
@Table(name = "rent_payment_histories")
public class RentPaymentsHistories implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id") 
    private Integer id;
    private Integer tenantId;
    private Integer apartmentId;
    private double amountPaid;
    private double rentValue;
    private String datePaid;
    private String billingCycle;
    private String paymentChannel;
    private String receiptId;
    private Integer packageId;
    private Date createTime;
    private Date updateTime;

    public RentPaymentsHistories() {
    }

    public RentPaymentsHistories(Integer id, Integer tenantId, Integer apartmentId, double amountPaid, double rentValue, String datePaid, String billingCycle, String paymentChannel, String receiptId, Integer packageId, Date createTime, Date updateTime) {
        this.id = id;
        this.tenantId = tenantId;
        this.apartmentId = apartmentId;
        this.amountPaid = amountPaid;
        this.rentValue = rentValue;
        this.datePaid = datePaid;
        this.billingCycle = billingCycle;
        this.paymentChannel = paymentChannel;
        this.receiptId = receiptId;
        this.packageId = packageId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getRentValue() {
        return rentValue;
    }

    public void setRentValue(double rentValue) {
        this.rentValue = rentValue;
    }

    public String getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
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
        return "RentPaymentsHistories{" + "id=" + id + ", tenantId=" + tenantId + ", apartmentId=" + apartmentId + ", amountPaid=" + amountPaid + ", rentValue=" + rentValue + ", datePaid=" + datePaid + ", billingCycle=" + billingCycle + ", paymentChannel=" + paymentChannel + ", receiptId=" + receiptId + ", packageId=" + packageId + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
