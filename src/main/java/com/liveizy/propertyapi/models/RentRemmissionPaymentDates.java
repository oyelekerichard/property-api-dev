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
@Table(name = "rent_remmission_payment_dates")
public class RentRemmissionPaymentDates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String firstQuarter;
    private String secondQuarter;
    private String thirdQuarter;
    private String fourthQuarter;
    private Date createTime;
    private Date updateTime;

    public RentRemmissionPaymentDates() {
    }

    public RentRemmissionPaymentDates(Integer id, String firstQuarter, String secondQuarter, String thirdQuarter, String fourthQuarter, Date createTime, Date updateTime) {
        this.id = id;
        this.firstQuarter = firstQuarter;
        this.secondQuarter = secondQuarter;
        this.thirdQuarter = thirdQuarter;
        this.fourthQuarter = fourthQuarter;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstQuarter() {
        return firstQuarter;
    }

    public void setFirstQuarter(String firstQuarter) {
        this.firstQuarter = firstQuarter;
    }

    public String getSecondQuarter() {
        return secondQuarter;
    }

    public void setSecondQuarter(String secondQuarter) {
        this.secondQuarter = secondQuarter;
    }

    public String getThirdQuarter() {
        return thirdQuarter;
    }

    public void setThirdQuarter(String thirdQuarter) {
        this.thirdQuarter = thirdQuarter;
    }

    public String getFourthQuarter() {
        return fourthQuarter;
    }

    public void setFourthQuarter(String fourthQuarter) {
        this.fourthQuarter = fourthQuarter;
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
        return "RentRemmissionPaymentDates{" + "id=" + id + ", firstQuarter=" + firstQuarter + ", secondQuarter=" + secondQuarter + ", thirdQuarter=" + thirdQuarter + ", fourthQuarter=" + fourthQuarter + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
