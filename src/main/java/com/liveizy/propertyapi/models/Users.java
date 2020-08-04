/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import java.io.Serializable;
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
@Table(name = "users")
public class Users implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    private String liveizyId;
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String phone;
    private String phone2;
    private String profileImage;
    private String gender;
    private String cityOfOrigin;
    private String stateOfOrigin;
    private String streetOfResidence;
    private String cityOfResidence;
    private String stateOfResidence;
    private String country;
    private String password;
    private String fileUpload;
    private String maritalStatus;
    private enum adminVerifyTenant{pending,enabled,disabled};
    private enum adminVerifyLpm{pending,enabled,disabled};
    private enum adminVerifyLandlord{pending,enabled,disabled};
    private short emailVerify;
    private short landlordProfileComplete;
    private short lpmProfileComplete;
    private short tenantProfileComplete;

    public Users() {
    }

    public Users(Integer id, String liveizyId, String firstName, String lastName, String email, String dob, String phone, String phone2, String profileImage, String gender, String cityOfOrigin, String stateOfOrigin, String streetOfResidence, String cityOfResidence, String stateOfResidence, String country, String password, String fileUpload, String maritalStatus, short emailVerify, short landlordProfileComplete, short lpmProfileComplete, short tenantProfileComplete) {
        this.id = id;
        this.liveizyId = liveizyId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.phone2 = phone2;
        this.profileImage = profileImage;
        this.gender = gender;
        this.cityOfOrigin = cityOfOrigin;
        this.stateOfOrigin = stateOfOrigin;
        this.streetOfResidence = streetOfResidence;
        this.cityOfResidence = cityOfResidence;
        this.stateOfResidence = stateOfResidence;
        this.country = country;
        this.password = password;
        this.fileUpload = fileUpload;
        this.maritalStatus = maritalStatus;
        this.emailVerify = emailVerify;
        this.landlordProfileComplete = landlordProfileComplete;
        this.lpmProfileComplete = lpmProfileComplete;
        this.tenantProfileComplete = tenantProfileComplete;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCityOfOrigin() {
        return cityOfOrigin;
    }

    public void setCityOfOrigin(String cityOfOrigin) {
        this.cityOfOrigin = cityOfOrigin;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getStreetOfResidence() {
        return streetOfResidence;
    }

    public void setStreetOfResidence(String streetOfResidence) {
        this.streetOfResidence = streetOfResidence;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }

    public String getStateOfResidence() {
        return stateOfResidence;
    }

    public void setStateOfResidence(String stateOfResidence) {
        this.stateOfResidence = stateOfResidence;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(String fileUpload) {
        this.fileUpload = fileUpload;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public short getEmailVerify() {
        return emailVerify;
    }

    public void setEmailVerify(short emailVerify) {
        this.emailVerify = emailVerify;
    }

    public short getLandlordProfileComplete() {
        return landlordProfileComplete;
    }

    public void setLandlordProfileComplete(short landlordProfileComplete) {
        this.landlordProfileComplete = landlordProfileComplete;
    }

    public short getLpmProfileComplete() {
        return lpmProfileComplete;
    }

    public void setLpmProfileComplete(short lpmProfileComplete) {
        this.lpmProfileComplete = lpmProfileComplete;
    }

    public short getTenantProfileComplete() {
        return tenantProfileComplete;
    }

    public void setTenantProfileComplete(short tenantProfileComplete) {
        this.tenantProfileComplete = tenantProfileComplete;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", liveizyId=" + liveizyId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", dob=" + dob + ", phone=" + phone + ", phone2=" + phone2 + ", profileImage=" + profileImage + ", gender=" + gender + ", cityOfOrigin=" + cityOfOrigin + ", stateOfOrigin=" + stateOfOrigin + ", streetOfResidence=" + streetOfResidence + ", cityOfResidence=" + cityOfResidence + ", stateOfResidence=" + stateOfResidence + ", country=" + country + ", password=" + password + ", fileUpload=" + fileUpload + ", maritalStatus=" + maritalStatus + ", emailVerify=" + emailVerify + ", landlordProfileComplete=" + landlordProfileComplete + ", lpmProfileComplete=" + lpmProfileComplete + ", tenantProfileComplete=" + tenantProfileComplete + '}';
    }
    
}
