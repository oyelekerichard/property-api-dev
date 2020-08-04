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
public class LocalGovernmentAreas implements Serializable
{
   private Integer id;
   private String name;
   private Integer stateId;
   private Date dateCreated;
   private Date dateUpdated;

    public LocalGovernmentAreas() {
    }

    public LocalGovernmentAreas(Integer id, String name, Integer stateId, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.name = name;
        this.stateId = stateId;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
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
        return "LocalGovernmentAreas{" + "id=" + id + ", name=" + name + ", stateId=" + stateId + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
   
}
