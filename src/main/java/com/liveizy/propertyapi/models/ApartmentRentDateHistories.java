/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author richard.oyeleke
 */
public class ApartmentRentDateHistories implements Serializable
{
    private Integer id;
    private Integer apartmentId;
    private Integer tenantId;
    private Date date;
    private String subject;
    private String details;
    private Integer packageId;
    private Date dateCreated;
    private Date dateUpdated;

    public ApartmentRentDateHistories() {
    }

    public ApartmentRentDateHistories(Integer id, Integer apartmentId, Integer tenantId, Date date, String subject, String details, Integer packageId, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.apartmentId = apartmentId;
        this.tenantId = tenantId;
        this.date = date;
        this.subject = subject;
        this.details = details;
        this.packageId = packageId;
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

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
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
        return "ApartmentRentDateHistories{" + "id=" + id + ", apartmentId=" + apartmentId + ", tenantId=" + tenantId + ", date=" + date + ", subject=" + subject + ", details=" + details + ", packageId=" + packageId + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }

}
