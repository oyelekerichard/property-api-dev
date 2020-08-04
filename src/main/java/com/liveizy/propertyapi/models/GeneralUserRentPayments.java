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
public class GeneralUserRentPayments implements Serializable
{
    private Integer id;
    private Integer userId;
    private String propertyOwnerAccountName;
    private String propertyOwnerAccountNumber;
    private Integer propertyOwnerBankId;
    private double rentAmount;
    private String rentDate;
    private double amountPaidByUser;
    private double percentagePaidByUser;
    private short paidToPropertyOwner;
    private String paymentChannelByUser;
    private String paymentChannelByAdmin;
    private Integer adminId;
    private Date dteCreated;
    private Date dateUpdated;

    public GeneralUserRentPayments() {
    }

    public GeneralUserRentPayments(Integer id, Integer userId, String propertyOwnerAccountName, String propertyOwnerAccountNumber, Integer propertyOwnerBankId, double rentAmount, String rentDate, double amountPaidByUser, double percentagePaidByUser, short paidToPropertyOwner, String paymentChannelByUser, String paymentChannelByAdmin, Integer adminId, Date dteCreated, Date dateUpdated) {
        this.id = id;
        this.userId = userId;
        this.propertyOwnerAccountName = propertyOwnerAccountName;
        this.propertyOwnerAccountNumber = propertyOwnerAccountNumber;
        this.propertyOwnerBankId = propertyOwnerBankId;
        this.rentAmount = rentAmount;
        this.rentDate = rentDate;
        this.amountPaidByUser = amountPaidByUser;
        this.percentagePaidByUser = percentagePaidByUser;
        this.paidToPropertyOwner = paidToPropertyOwner;
        this.paymentChannelByUser = paymentChannelByUser;
        this.paymentChannelByAdmin = paymentChannelByAdmin;
        this.adminId = adminId;
        this.dteCreated = dteCreated;
        this.dateUpdated = dateUpdated;
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

    public String getPropertyOwnerAccountName() {
        return propertyOwnerAccountName;
    }

    public void setPropertyOwnerAccountName(String propertyOwnerAccountName) {
        this.propertyOwnerAccountName = propertyOwnerAccountName;
    }

    public String getPropertyOwnerAccountNumber() {
        return propertyOwnerAccountNumber;
    }

    public void setPropertyOwnerAccountNumber(String propertyOwnerAccountNumber) {
        this.propertyOwnerAccountNumber = propertyOwnerAccountNumber;
    }

    public Integer getPropertyOwnerBankId() {
        return propertyOwnerBankId;
    }

    public void setPropertyOwnerBankId(Integer propertyOwnerBankId) {
        this.propertyOwnerBankId = propertyOwnerBankId;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public double getAmountPaidByUser() {
        return amountPaidByUser;
    }

    public void setAmountPaidByUser(double amountPaidByUser) {
        this.amountPaidByUser = amountPaidByUser;
    }

    public double getPercentagePaidByUser() {
        return percentagePaidByUser;
    }

    public void setPercentagePaidByUser(double percentagePaidByUser) {
        this.percentagePaidByUser = percentagePaidByUser;
    }

    public short getPaidToPropertyOwner() {
        return paidToPropertyOwner;
    }

    public void setPaidToPropertyOwner(short paidToPropertyOwner) {
        this.paidToPropertyOwner = paidToPropertyOwner;
    }

    public String getPaymentChannelByUser() {
        return paymentChannelByUser;
    }

    public void setPaymentChannelByUser(String paymentChannelByUser) {
        this.paymentChannelByUser = paymentChannelByUser;
    }

    public String getPaymentChannelByAdmin() {
        return paymentChannelByAdmin;
    }

    public void setPaymentChannelByAdmin(String paymentChannelByAdmin) {
        this.paymentChannelByAdmin = paymentChannelByAdmin;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getDteCreated() {
        return dteCreated;
    }

    public void setDteCreated(Date dteCreated) {
        this.dteCreated = dteCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "GeneralUserRentPayments{" + "id=" + id + ", userId=" + userId + ", propertyOwnerAccountName=" + propertyOwnerAccountName + ", propertyOwnerAccountNumber=" + propertyOwnerAccountNumber + ", propertyOwnerBankId=" + propertyOwnerBankId + ", rentAmount=" + rentAmount + ", rentDate=" + rentDate + ", amountPaidByUser=" + amountPaidByUser + ", percentagePaidByUser=" + percentagePaidByUser + ", paidToPropertyOwner=" + paidToPropertyOwner + ", paymentChannelByUser=" + paymentChannelByUser + ", paymentChannelByAdmin=" + paymentChannelByAdmin + ", adminId=" + adminId + ", dteCreated=" + dteCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
