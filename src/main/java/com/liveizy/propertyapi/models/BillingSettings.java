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
@Table(name = "billing_settings")
public class BillingSettings implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer apartmentId;
    private String cycle;
    private short autoRenew;
    private short cannotEdit;
    private short editRequest;
    private Date dateCreated;
    private Date dateUpdated;

    public BillingSettings() {
    }

    public BillingSettings(Integer id, Integer apartmentId, String cycle, short autoRenew, short cannotEdit, short editRequest, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.apartmentId = apartmentId;
        this.cycle = cycle;
        this.autoRenew = autoRenew;
        this.cannotEdit = cannotEdit;
        this.editRequest = editRequest;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public short getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(short autoRenew) {
        this.autoRenew = autoRenew;
    }

    public short getCannotEdit() {
        return cannotEdit;
    }

    public void setCannotEdit(short cannotEdit) {
        this.cannotEdit = cannotEdit;
    }

    public short getEditRequest() {
        return editRequest;
    }

    public void setEditRequest(short editRequest) {
        this.editRequest = editRequest;
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
        return "BillingSettings{" + "id=" + id + ", apartmentId=" + apartmentId + ", cycle=" + cycle + ", autoRenew=" + autoRenew + ", cannotEdit=" + cannotEdit + ", editRequest=" + editRequest + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
