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
@Table(name = "easy_pay_fees")
public class EasyPayFees implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private double monthly;
    private double quarterly;
    private double biAnnualy;
    private double defaultSetting;
    private Date dateCreated;
    private Date dateUpdated;

    public EasyPayFees() {
    }

    public EasyPayFees(Integer id, double monthly, double quarterly, double biAnnualy, double defaultSetting, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.monthly = monthly;
        this.quarterly = quarterly;
        this.biAnnualy = biAnnualy;
        this.defaultSetting = defaultSetting;
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

    public double getBiAnnualy() {
        return biAnnualy;
    }

    public void setBiAnnualy(double biAnnualy) {
        this.biAnnualy = biAnnualy;
    }

    public double getDefaultSetting() {
        return defaultSetting;
    }

    public void setDefaultSetting(double defaultSetting) {
        this.defaultSetting = defaultSetting;
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
        return "EasyPayFees{" + "id=" + id + ", monthly=" + monthly + ", quarterly=" + quarterly + ", biAnnualy=" + biAnnualy + ", defaultSetting=" + defaultSetting + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }

}
