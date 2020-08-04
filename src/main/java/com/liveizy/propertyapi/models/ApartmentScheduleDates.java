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
public class ApartmentScheduleDates implements Serializable
{
    private Integer id;
    private Integer apartmentId;
    private String scheduledDate;
    private String scheduledTime;
    private Date dateCreated;
    private Date dateUpdated;

    public ApartmentScheduleDates() {
    }

    public ApartmentScheduleDates(Integer id, Integer apartmentId, String scheduledDate, String scheduledTime, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.apartmentId = apartmentId;
        this.scheduledDate = scheduledDate;
        this.scheduledTime = scheduledTime;
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

    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
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
        return "ApartmentScheduleDates{" + "id=" + id + ", apartmentId=" + apartmentId + ", scheduledDate=" + scheduledDate + ", scheduledTime=" + scheduledTime + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
