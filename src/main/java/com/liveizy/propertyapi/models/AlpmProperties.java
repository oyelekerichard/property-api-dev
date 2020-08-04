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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author richard.oyeleke
 */

@Entity
@Table(name = "alpm_properties")
public class AlpmProperties implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer agentId;
    private Integer alpmId;
    private short isEnabled;
    @Basic(optional = false)
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    private Date dateUpdated; 

    public AlpmProperties() {
    }

    public AlpmProperties(Integer id) {
        this.id = id;
    }
    
    public AlpmProperties(Integer agentId, Integer alpmId, short isEnabled, Date dateCreated, Date dateUpdated) {
        this.agentId = agentId;
        this.alpmId = alpmId;
        this.isEnabled = isEnabled;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
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

    public short getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(short isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "AlpmProperties{" + "id=" + id + ", agentId=" + agentId + ", alpmId=" + alpmId + ", isEnabled=" + isEnabled + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }

}
