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
@Table(name = "management_fees")
public class ManagementFees implements Serializable 
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private double monthly;
    private double quarterly;
    private double biAnnually;
    private double defaultSettings;
    private Date dateCreated;
    private Date dateUpdated;

    public ManagementFees() {
    }

    public ManagementFees(Integer id, double monthly, double quarterly, double biAnnually, double defaultSettings, Date dateCreated, Date dateUpdated) {
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

    public double getMonthly() {
        return monthly;
    }

    public void setMonthly(double monthly) {
        this.monthly = monthly;
    }

    public double getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(double quarterly) {
        this.quarterly = quarterly;
    }

    public double getBiAnnually() {
        return biAnnually;
    }

    public void setBiAnnually(double biAnnually) {
        this.biAnnually = biAnnually;
    }

    public double getDefaultSettings() {
        return defaultSettings;
    }

    public void setDefaultSettings(double defaultSettings) {
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
        return "ManagementFees{" + "id=" + id + ", monthly=" + monthly + ", quarterly=" + quarterly + ", biAnnually=" + biAnnually + ", defaultSettings=" + defaultSettings + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
