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
@Table(name = "tenant_requests")
public class TenantRequests implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer landlordId;
    private Integer agentId;
    private Integer tenantId;
    private Integer apartmentId;
    private short hasVerified;
    private Date createTime;
    private Date updateTime;

    public TenantRequests() {
    }

    public TenantRequests(Integer id, Integer landlordId, Integer agentId, Integer tenantId, Integer apartmentId, short hasVerified, Date createTime, Date updateTime) {
        this.id = id;
        this.landlordId = landlordId;
        this.agentId = agentId;
        this.tenantId = tenantId;
        this.apartmentId = apartmentId;
        this.hasVerified = hasVerified;
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

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
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

    public short getHasVerified() {
        return hasVerified;
    }

    public void setHasVerified(short hasVerified) {
        this.hasVerified = hasVerified;
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
        return "TenantRequests{" + "id=" + id + ", landlordId=" + landlordId + ", agentId=" + agentId + ", tenantId=" + tenantId + ", apartmentId=" + apartmentId + ", hasVerified=" + hasVerified + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
