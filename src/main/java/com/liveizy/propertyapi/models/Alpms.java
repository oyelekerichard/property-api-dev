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
@Table(name = "alpms")
public class Alpms implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer agentId;
    private Integer alpmId;
    private Boolean isEnabled;
    private Date createdDate;
    private Date updatedDate;

    public Alpms() {
    }

    public Alpms(Integer id, Integer agentId, Integer alpmId, Boolean isEnabled, Date createdDate, Date updatedDate) {
        this.id = id;
        this.agentId = agentId;
        this.alpmId = alpmId;
        this.isEnabled = isEnabled;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
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

    public Integer getAlpmId() {
        return alpmId;
    }

    public void setAlpmId(Integer alpmId) {
        this.alpmId = alpmId;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Alpms{" + "id=" + id + ", agentId=" + agentId + ", alpmId=" + alpmId + ", isEnabled=" + isEnabled + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + '}';
    }
    
}
