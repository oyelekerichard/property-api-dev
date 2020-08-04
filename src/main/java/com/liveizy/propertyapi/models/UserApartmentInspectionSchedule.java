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
@Table(name = "user_apartment_inspection_schedule")
public class UserApartmentInspectionSchedule implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    private Integer apartmentId;
    private Integer landlordId;
    private Integer agentId;
    private Integer userId;
    private String scheduleDate;
    private String scheduleTime;
    private enum inspectionStatus{Pending,Acknowledged};
    private Date createTime;
    private Date updateTime;

    public UserApartmentInspectionSchedule() {
    }

    public UserApartmentInspectionSchedule(Integer id, Integer apartmentId, Integer landlordId, Integer agentId, Integer userId, String scheduleDate, String scheduleTime, Date createTime, Date updateTime) {
        this.id = id;
        this.apartmentId = apartmentId;
        this.landlordId = landlordId;
        this.agentId = agentId;
        this.userId = userId;
        this.scheduleDate = scheduleDate;
        this.scheduleTime = scheduleTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Integer landlordId) {
        this.landlordId = landlordId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
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
        return "UserApartmentInspectionSchedule{" + "id=" + id + ", apartmentId=" + apartmentId + ", landlordId=" + landlordId + ", agentId=" + agentId + ", userId=" + userId + ", scheduleDate=" + scheduleDate + ", scheduleTime=" + scheduleTime + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
