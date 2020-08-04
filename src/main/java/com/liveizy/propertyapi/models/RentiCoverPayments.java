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
@Table(name = "renti_cover_payments")
public class RentiCoverPayments implements Serializable
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
    private short refunded;
    private String dateRefunded;
    private Date createTime;
    private Date updateTime;

    public RentiCoverPayments() {
    }

    public RentiCoverPayments(Integer id, Integer tenantId, Integer apartmentId, double amountPaid, short refunded, String dateRefunded, Date createTime, Date updateTime) {
        this.id = id;
        this.tenantId = tenantId;
        this.apartmentId = apartmentId;
        this.amountPaid = amountPaid;
        this.refunded = refunded;
        this.dateRefunded = dateRefunded;
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

    public short getRefunded() {
        return refunded;
    }

    public void setRefunded(short refunded) {
        this.refunded = refunded;
    }

    public String getDateRefunded() {
        return dateRefunded;
    }

    public void setDateRefunded(String dateRefunded) {
        this.dateRefunded = dateRefunded;
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
        return "RentiCoverPayments{" + "id=" + id + ", tenantId=" + tenantId + ", apartmentId=" + apartmentId + ", amountPaid=" + amountPaid + ", refunded=" + refunded + ", dateRefunded=" + dateRefunded + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
