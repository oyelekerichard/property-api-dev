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
@Table(name = "package_requests")
public class PackageRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String uuid;
    private Integer landlordId;
    private Integer packageId;
    private String propertiesId;
    private short verified;
    private short isActive;
    private String activationDate;
    private String agreementFile;
    private String agreeentFileType;
    private Date createTime;
    private Date updateTime;

    public PackageRequests() {
    }

    public PackageRequests(Integer id, String uuid, Integer landlordId, Integer packageId, String propertiesId, short verified, short isActive, String activationDate, String agreementFile, String agreeentFileType, Date createTime, Date updateTime) {
        this.id = id;
        this.uuid = uuid;
        this.landlordId = landlordId;
        this.packageId = packageId;
        this.propertiesId = propertiesId;
        this.verified = verified;
        this.isActive = isActive;
        this.activationDate = activationDate;
        this.agreementFile = agreementFile;
        this.agreeentFileType = agreeentFileType;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Integer landlordId) {
        this.landlordId = landlordId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPropertiesId() {
        return propertiesId;
    }

    public void setPropertiesId(String propertiesId) {
        this.propertiesId = propertiesId;
    }

    public short getVerified() {
        return verified;
    }

    public void setVerified(short verified) {
        this.verified = verified;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getAgreementFile() {
        return agreementFile;
    }

    public void setAgreementFile(String agreementFile) {
        this.agreementFile = agreementFile;
    }

    public String getAgreeentFileType() {
        return agreeentFileType;
    }

    public void setAgreeentFileType(String agreeentFileType) {
        this.agreeentFileType = agreeentFileType;
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
        return "PackageRequests{" + "id=" + id + ", uuid=" + uuid + ", landlordId=" + landlordId + ", packageId=" + packageId + ", propertiesId=" + propertiesId + ", verified=" + verified + ", isActive=" + isActive + ", activationDate=" + activationDate + ", agreementFile=" + agreementFile + ", agreeentFileType=" + agreeentFileType + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }

}
