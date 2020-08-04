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
@Table(name = "properties")
public class Properties implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String title;
    private String propertyType;
    private String liveizyId;
    private String country;
    private String state;
    private String lga;
    private String street;
    private String houseNumber;
    private String addressLine2;
    private String image;
    private Integer editedBy;
    private String status;
    private short editRequest;
    private short lpmCanEdit;
    private Integer agentId;
    private Integer estateId;
    private Integer landlordId;
    private String agentVerify;
    private String adminVerify;
    private short regComplete;
    private Integer userinchargeId;
    private String userInChargeAs;
    private Date createTime;
    private Date updateTime;

    public Properties() {
    }

    public Properties(Integer id, String title, String propertyType, String liveizyId, String country, String state, String lga, String street, String houseNumber, String addressLine2, String image, Integer editedBy, String status, short editRequest, short lpmCanEdit, Integer agentId, Integer estateId, Integer landlordId, String agentVerify, String adminVerify, short regComplete, Integer userinchargeId, String userInChargeAs, Date createTime, Date updateTime) {
        this.id = id;
        this.title = title;
        this.propertyType = propertyType;
        this.liveizyId = liveizyId;
        this.country = country;
        this.state = state;
        this.lga = lga;
        this.street = street;
        this.houseNumber = houseNumber;
        this.addressLine2 = addressLine2;
        this.image = image;
        this.editedBy = editedBy;
        this.status = status;
        this.editRequest = editRequest;
        this.lpmCanEdit = lpmCanEdit;
        this.agentId = agentId;
        this.estateId = estateId;
        this.landlordId = landlordId;
        this.agentVerify = agentVerify;
        this.adminVerify = adminVerify;
        this.regComplete = regComplete;
        this.userinchargeId = userinchargeId;
        this.userInChargeAs = userInChargeAs;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getLiveizyId() {
        return liveizyId;
    }

    public void setLiveizyId(String liveizyId) {
        this.liveizyId = liveizyId;
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

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
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

    public Integer getEditedBy() {
        return editedBy;
    }

    public void setEditedBy(Integer editedBy) {
        this.editedBy = editedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public short getEditRequest() {
        return editRequest;
    }

    public void setEditRequest(short editRequest) {
        this.editRequest = editRequest;
    }

    public short getLpmCanEdit() {
        return lpmCanEdit;
    }

    public void setLpmCanEdit(short lpmCanEdit) {
        this.lpmCanEdit = lpmCanEdit;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getEstateId() {
        return estateId;
    }

    public void setEstateId(Integer estateId) {
        this.estateId = estateId;
    }

    public Integer getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Integer landlordId) {
        this.landlordId = landlordId;
    }

    public String getAgentVerify() {
        return agentVerify;
    }

    public void setAgentVerify(String agentVerify) {
        this.agentVerify = agentVerify;
    }

    public String getAdminVerify() {
        return adminVerify;
    }

    public void setAdminVerify(String adminVerify) {
        this.adminVerify = adminVerify;
    }

    public short getRegComplete() {
        return regComplete;
    }

    public void setRegComplete(short regComplete) {
        this.regComplete = regComplete;
    }

    public Integer getUserinchargeId() {
        return userinchargeId;
    }

    public void setUserinchargeId(Integer userinchargeId) {
        this.userinchargeId = userinchargeId;
    }

    public String getUserInChargeAs() {
        return userInChargeAs;
    }

    public void setUserInChargeAs(String userInChargeAs) {
        this.userInChargeAs = userInChargeAs;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Properties{" + "id=" + id + ", title=" + title + ", propertyType=" + propertyType + ", liveizyId=" + liveizyId + ", country=" + country + ", state=" + state + ", lga=" + lga + ", street=" + street + ", houseNumber=" + houseNumber + ", addressLine2=" + addressLine2 + ", image=" + image + ", editedBy=" + editedBy + ", status=" + status + ", editRequest=" + editRequest + ", lpmCanEdit=" + lpmCanEdit + ", agentId=" + agentId + ", estateId=" + estateId + ", landlordId=" + landlordId + ", agentVerify=" + agentVerify + ", adminVerify=" + adminVerify + ", regComplete=" + regComplete + ", userinchargeId=" + userinchargeId + ", userInChargeAs=" + userInChargeAs + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
