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
@Table(name = "bank_details")
public class BankDetails implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer userId;
    private String accountName;
    private String accountNumber;
    private String rentRemissionInterval;
    private Integer bankId;
    private String remissionPaymentDate;
    private short editable;
    private short editRequest;
    private Date dateCreated;
    private Date dateUpdated;

    public BankDetails() {
    }

    public BankDetails(Integer id, Integer userId, String accountName, String accountNumber, String rentRemissionInterval, Integer bankId, String remissionPaymentDate, short editable, short editRequest, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.userId = userId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.rentRemissionInterval = rentRemissionInterval;
        this.bankId = bankId;
        this.remissionPaymentDate = remissionPaymentDate;
        this.editable = editable;
        this.editRequest = editRequest;
        this.dateCreated = dateCreated;
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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRentRemissionInterval() {
        return rentRemissionInterval;
    }

    public void setRentRemissionInterval(String rentRemissionInterval) {
        this.rentRemissionInterval = rentRemissionInterval;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getRemissionPaymentDate() {
        return remissionPaymentDate;
    }

    public void setRemissionPaymentDate(String remissionPaymentDate) {
        this.remissionPaymentDate = remissionPaymentDate;
    }

    public short getEditable() {
        return editable;
    }

    public void setEditable(short editable) {
        this.editable = editable;
    }

    public short getEditRequest() {
        return editRequest;
    }

    public void setEditRequest(short editRequest) {
        this.editRequest = editRequest;
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
        return "BankDetails{" + "id=" + id + ", userId=" + userId + ", accountName=" + accountName + ", accountNumber=" + accountNumber + ", rentRemissionInterval=" + rentRemissionInterval + ", bankId=" + bankId + ", remissionPaymentDate=" + remissionPaymentDate + ", editable=" + editable + ", editRequest=" + editRequest + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
