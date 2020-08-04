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
public class Estates implements Serializable
{
    private Integer id;
    private String liveizyId;
    private String title;
    private String country;
    private String state;
    private String lga;
    private String street;
    private String addressLine2;
    private String image;
    private Integer landlordId;
    private Date dateCreated;
    private Date dateUpdated;

    public Estates() {
    }

    public Estates(Integer id, String liveizyId, String title, String country, String state, String lga, String street, String addressLine2, String image, Integer landlordId, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.liveizyId = liveizyId;
        this.title = title;
        this.country = country;
        this.state = state;
        this.lga = lga;
        this.street = street;
        this.addressLine2 = addressLine2;
        this.image = image;
        this.landlordId = landlordId;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLiveizyId() {
        return liveizyId;
    }

    public void setLiveizyId(String liveizyId) {
        this.liveizyId = liveizyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Integer landlordId) {
        this.landlordId = landlordId;
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
        return "Estates{" + "id=" + id + ", liveizyId=" + liveizyId + ", title=" + title + ", country=" + country + ", state=" + state + ", lga=" + lga + ", street=" + street + ", addressLine2=" + addressLine2 + ", image=" + image + ", landlordId=" + landlordId + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
