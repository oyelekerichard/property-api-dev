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
@Table(name = "lpm_commission_fees")
public class LpmCommissionFees implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String monthly;
    private String quarterly;
    private String biAnnually;
    private String defaultSettings;
    private Date dateCreated;
    private Date dateUpdated;

    public LpmCommissionFees() {
    }

    public LpmCommissionFees(Integer id, String monthly, String quarterly, String biAnnually, String defaultSettings, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.monthly = monthly;
        this.quarterly = quarterly;
        this.biAnnually = biAnnually;
        this.defaultSettings = defaultSettings;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonthly() {
        return monthly;
    }

    public void setMonthly(String monthly) {
        this.monthly = monthly;
    }

    public String getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(String quarterly) {
        this.quarterly = quarterly;
    }

    public String getBiAnnually() {
        return biAnnually;
    }

    public void setBiAnnually(String biAnnually) {
        this.biAnnually = biAnnually;
    }

    public String getDefaultSettings() {
        return defaultSettings;
    }

    public void setDefaultSettings(String defaultSettings) {
        this.defaultSettings = defaultSettings;
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
        return "LpmCommissionFees{" + "id=" + id + ", monthly=" + monthly + ", quarterly=" + quarterly + ", biAnnually=" + biAnnually + ", defaultSettings=" + defaultSettings + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
