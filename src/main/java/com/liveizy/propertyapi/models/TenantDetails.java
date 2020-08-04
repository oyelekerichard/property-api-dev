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
@Table(name = "tenant_details")
public class TenantDetails implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    private Integer userId;
    private Integer occupiers;
    private Integer maleOccupants;
    private Integer femaleOccupants;
    private String employmentStatus;
    private String employerName;
    private String employerAddress;
    private String contactPersonWork;
    private String contactPersonPhone;
    private short specialNeeds;
    private String propertyOwnerName;
    private String propertyOwnerPhone;
    private String propertyManagerName;
    private String propertyManagerPhone;
    private String propertyOwnerBankId;
    private String propertyOwnerAccountNumber;
    private String propertyOwnerAccountName;
    private String guestTenantRentPaymentDate;
    private short canEditRentPaymentDate;
    private String guestTenantRentAmount;
    private Date createTime;
    private Date updateTime;

    public TenantDetails() {
    }

    public TenantDetails(Integer id, Integer userId, Integer occupiers, Integer maleOccupants, Integer femaleOccupants, String employmentStatus, String employerName, String employerAddress, String contactPersonWork, String contactPersonPhone, short specialNeeds, String propertyOwnerName, String propertyOwnerPhone, String propertyManagerName, String propertyManagerPhone, String propertyOwnerBankId, String propertyOwnerAccountNumber, String propertyOwnerAccountName, String guestTenantRentPaymentDate, short canEditRentPaymentDate, String guestTenantRentAmount, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.occupiers = occupiers;
        this.maleOccupants = maleOccupants;
        this.femaleOccupants = femaleOccupants;
        this.employmentStatus = employmentStatus;
        this.employerName = employerName;
        this.employerAddress = employerAddress;
        this.contactPersonWork = contactPersonWork;
        this.contactPersonPhone = contactPersonPhone;
        this.specialNeeds = specialNeeds;
        this.propertyOwnerName = propertyOwnerName;
        this.propertyOwnerPhone = propertyOwnerPhone;
        this.propertyManagerName = propertyManagerName;
        this.propertyManagerPhone = propertyManagerPhone;
        this.propertyOwnerBankId = propertyOwnerBankId;
        this.propertyOwnerAccountNumber = propertyOwnerAccountNumber;
        this.propertyOwnerAccountName = propertyOwnerAccountName;
        this.guestTenantRentPaymentDate = guestTenantRentPaymentDate;
        this.canEditRentPaymentDate = canEditRentPaymentDate;
        this.guestTenantRentAmount = guestTenantRentAmount;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOccupiers() {
        return occupiers;
    }

    public void setOccupiers(Integer occupiers) {
        this.occupiers = occupiers;
    }

    public Integer getMaleOccupants() {
        return maleOccupants;
    }

    public void setMaleOccupants(Integer maleOccupants) {
        this.maleOccupants = maleOccupants;
    }

    public Integer getFemaleOccupants() {
        return femaleOccupants;
    }

    public void setFemaleOccupants(Integer femaleOccupants) {
        this.femaleOccupants = femaleOccupants;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    public String getContactPersonWork() {
        return contactPersonWork;
    }

    public void setContactPersonWork(String contactPersonWork) {
        this.contactPersonWork = contactPersonWork;
    }

    public String getContactPersonPhone() {
        return contactPersonPhone;
    }

    public void setContactPersonPhone(String contactPersonPhone) {
        this.contactPersonPhone = contactPersonPhone;
    }

    public short getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(short specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public String getPropertyOwnerName() {
        return propertyOwnerName;
    }

    public void setPropertyOwnerName(String propertyOwnerName) {
        this.propertyOwnerName = propertyOwnerName;
    }

    public String getPropertyOwnerPhone() {
        return propertyOwnerPhone;
    }

    public void setPropertyOwnerPhone(String propertyOwnerPhone) {
        this.propertyOwnerPhone = propertyOwnerPhone;
    }

    public String getPropertyManagerName() {
        return propertyManagerName;
    }

    public void setPropertyManagerName(String propertyManagerName) {
        this.propertyManagerName = propertyManagerName;
    }

    public String getPropertyManagerPhone() {
        return propertyManagerPhone;
    }

    public void setPropertyManagerPhone(String propertyManagerPhone) {
        this.propertyManagerPhone = propertyManagerPhone;
    }

    public String getPropertyOwnerBankId() {
        return propertyOwnerBankId;
    }

    public void setPropertyOwnerBankId(String propertyOwnerBankId) {
        this.propertyOwnerBankId = propertyOwnerBankId;
    }

    public String getPropertyOwnerAccountNumber() {
        return propertyOwnerAccountNumber;
    }

    public void setPropertyOwnerAccountNumber(String propertyOwnerAccountNumber) {
        this.propertyOwnerAccountNumber = propertyOwnerAccountNumber;
    }

    public String getPropertyOwnerAccountName() {
        return propertyOwnerAccountName;
    }

    public void setPropertyOwnerAccountName(String propertyOwnerAccountName) {
        this.propertyOwnerAccountName = propertyOwnerAccountName;
    }

    public String getGuestTenantRentPaymentDate() {
        return guestTenantRentPaymentDate;
    }

    public void setGuestTenantRentPaymentDate(String guestTenantRentPaymentDate) {
        this.guestTenantRentPaymentDate = guestTenantRentPaymentDate;
    }

    public short getCanEditRentPaymentDate() {
        return canEditRentPaymentDate;
    }

    public void setCanEditRentPaymentDate(short canEditRentPaymentDate) {
        this.canEditRentPaymentDate = canEditRentPaymentDate;
    }

    public String getGuestTenantRentAmount() {
        return guestTenantRentAmount;
    }

    public void setGuestTenantRentAmount(String guestTenantRentAmount) {
        this.guestTenantRentAmount = guestTenantRentAmount;
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
        return "TenantDetails{" + "id=" + id + ", userId=" + userId + ", occupiers=" + occupiers + ", maleOccupants=" + maleOccupants + ", femaleOccupants=" + femaleOccupants + ", employmentStatus=" + employmentStatus + ", employerName=" + employerName + ", employerAddress=" + employerAddress + ", contactPersonWork=" + contactPersonWork + ", contactPersonPhone=" + contactPersonPhone + ", specialNeeds=" + specialNeeds + ", propertyOwnerName=" + propertyOwnerName + ", propertyOwnerPhone=" + propertyOwnerPhone + ", propertyManagerName=" + propertyManagerName + ", propertyManagerPhone=" + propertyManagerPhone + ", propertyOwnerBankId=" + propertyOwnerBankId + ", propertyOwnerAccountNumber=" + propertyOwnerAccountNumber + ", propertyOwnerAccountName=" + propertyOwnerAccountName + ", guestTenantRentPaymentDate=" + guestTenantRentPaymentDate + ", canEditRentPaymentDate=" + canEditRentPaymentDate + ", guestTenantRentAmount=" + guestTenantRentAmount + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
