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
@Table(name = "reports")
public class Reports implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String uuid;
    private String subject;
    private Integer senderId;
    private Integer recipientId;
    private String reportingAs;
    private Integer apartmentId;
    private Integer propertyId;
    private String file;
    private String fileType;
    private String message;
    private short fromAdmin;
    private Date createTime;
    private Date updateTime;

    public Reports() {
    }

    public Reports(Integer id, String uuid, String subject, Integer senderId, Integer recipientId, String reportingAs, Integer apartmentId, Integer propertyId, String file, String fileType, String message, short fromAdmin, Date createTime, Date updateTime) {
        this.id = id;
        this.uuid = uuid;
        this.subject = subject;
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.reportingAs = reportingAs;
        this.apartmentId = apartmentId;
        this.propertyId = propertyId;
        this.file = file;
        this.fileType = fileType;
        this.message = message;
        this.fromAdmin = fromAdmin;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public String getReportingAs() {
        return reportingAs;
    }

    public void setReportingAs(String reportingAs) {
        this.reportingAs = reportingAs;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public short getFromAdmin() {
        return fromAdmin;
    }

    public void setFromAdmin(short fromAdmin) {
        this.fromAdmin = fromAdmin;
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
        return "Reports{" + "id=" + id + ", uuid=" + uuid + ", subject=" + subject + ", senderId=" + senderId + ", recipientId=" + recipientId + ", reportingAs=" + reportingAs + ", apartmentId=" + apartmentId + ", propertyId=" + propertyId + ", file=" + file + ", fileType=" + fileType + ", message=" + message + ", fromAdmin=" + fromAdmin + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }  
}
