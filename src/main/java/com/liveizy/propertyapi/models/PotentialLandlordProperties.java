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
@Table(name = "potential_landlord_properties")
public class PotentialLandlordProperties implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer agentId;
    private Integer propertyId;
    private String landlordEmail;
    private String landlordName;
    private String landlordPhone;
    private Date createTime;
    private Date updateTime;

    public PotentialLandlordProperties() {
    }

    public PotentialLandlordProperties(Integer id, Integer agentId, Integer propertyId, String landlordEmail, String landlordName, String landlordPhone, Date createTime, Date updateTime) {
        this.id = id;
        this.agentId = agentId;
        this.propertyId = propertyId;
        this.landlordEmail = landlordEmail;
        this.landlordName = landlordName;
        this.landlordPhone = landlordPhone;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getLandlordEmail() {
        return landlordEmail;
    }

    public void setLandlordEmail(String landlordEmail) {
        this.landlordEmail = landlordEmail;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public String getLandlordPhone() {
        return landlordPhone;
    }

    public void setLandlordPhone(String landlordPhone) {
        this.landlordPhone = landlordPhone;
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
        return "PotentialLandlordProperties{" + "id=" + id + ", agentId=" + agentId + ", propertyId=" + propertyId + ", landlordEmail=" + landlordEmail + ", landlordName=" + landlordName + ", landlordPhone=" + landlordPhone + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
