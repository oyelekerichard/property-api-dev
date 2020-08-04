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
@Table(name = "tenant_apartment_invitations")
public class TenantApartmentInvitations implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer potentialTenantId;
    private Integer apartmentId;
    private Integer inviteeId;
    private String inviteeRole;
    private Date createTime;
    private Date updateTime;

    public TenantApartmentInvitations() {
    }

    public TenantApartmentInvitations(Integer id, Integer potentialTenantId, Integer apartmentId, Integer inviteeId, String inviteeRole, Date createTime, Date updateTime) {
        this.id = id;
        this.potentialTenantId = potentialTenantId;
        this.apartmentId = apartmentId;
        this.inviteeId = inviteeId;
        this.inviteeRole = inviteeRole;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPotentialTenantId() {
        return potentialTenantId;
    }

    public void setPotentialTenantId(Integer potentialTenantId) {
        this.potentialTenantId = potentialTenantId;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getInviteeId() {
        return inviteeId;
    }

    public void setInviteeId(Integer inviteeId) {
        this.inviteeId = inviteeId;
    }

    public String getInviteeRole() {
        return inviteeRole;
    }

    public void setInviteeRole(String inviteeRole) {
        this.inviteeRole = inviteeRole;
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
        return "TenantApartmentInvitations{" + "id=" + id + ", potentialTenantId=" + potentialTenantId + ", apartmentId=" + apartmentId + ", inviteeId=" + inviteeId + ", inviteeRole=" + inviteeRole + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
}
