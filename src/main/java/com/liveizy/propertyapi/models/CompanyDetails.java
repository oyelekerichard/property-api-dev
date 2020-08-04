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
public class CompanyDetails implements Serializable
{
    private Integer id;
    private String companyName;
    private String country;
    private String phoneNumber;
    private String city;
    private String street;
    private String contactPerson;
    private String state;
    private String companyAddress;
    private String incorporatonFiles;
    private Integer userId;
    private Date dateCreated;
    private Date dateUpdated;

    public CompanyDetails() {
    }

    public CompanyDetails(Integer id, String companyName, String country, String phoneNumber, String city, String street, String contactPerson, String state, String companyAddress, String incorporatonFiles, Integer userId, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.companyName = companyName;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.street = street;
        this.contactPerson = contactPerson;
        this.state = state;
        this.companyAddress = companyAddress;
        this.incorporatonFiles = incorporatonFiles;
        this.userId = userId;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getIncorporatonFiles() {
        return incorporatonFiles;
    }

    public void setIncorporatonFiles(String incorporatonFiles) {
        this.incorporatonFiles = incorporatonFiles;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        return "CompanyDetails{" + "id=" + id + ", companyName=" + companyName + ", country=" + country + ", phoneNumber=" + phoneNumber + ", city=" + city + ", street=" + street + ", contactPerson=" + contactPerson + ", state=" + state + ", companyAddress=" + companyAddress + ", incorporatonFiles=" + incorporatonFiles + ", userId=" + userId + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
