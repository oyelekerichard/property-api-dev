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
@Table(name = "packages")
public class Packages implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String name;
    private String alias;
    private short vacancyAdvert;
    private short rentCollecting;
    private short rentRemmitting;
    private short landlordSeeTenantRequest;
    private short lpmTotalCommission;
    private short rentSecurity;
    private short rentOnTime;
    private short repairs;
    private short maintenance;
    private short requireLpm;
    private short showAllStatesAndLgas;
    private Integer packagePercentage;
    private Date createTime;
    private Date updateTime;

    public Packages() {
    }

    public Packages(Integer id, String name, String alias, short vacancyAdvert, short rentCollecting, short rentRemmitting, short landlordSeeTenantRequest, short lpmTotalCommission, short rentSecurity, short rentOnTime, short repairs, short maintenance, short requireLpm, short showAllStatesAndLgas, Integer packagePercentage, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.vacancyAdvert = vacancyAdvert;
        this.rentCollecting = rentCollecting;
        this.rentRemmitting = rentRemmitting;
        this.landlordSeeTenantRequest = landlordSeeTenantRequest;
        this.lpmTotalCommission = lpmTotalCommission;
        this.rentSecurity = rentSecurity;
        this.rentOnTime = rentOnTime;
        this.repairs = repairs;
        this.maintenance = maintenance;
        this.requireLpm = requireLpm;
        this.showAllStatesAndLgas = showAllStatesAndLgas;
        this.packagePercentage = packagePercentage;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public short getVacancyAdvert() {
        return vacancyAdvert;
    }

    public void setVacancyAdvert(short vacancyAdvert) {
        this.vacancyAdvert = vacancyAdvert;
    }

    public short getRentCollecting() {
        return rentCollecting;
    }

    public void setRentCollecting(short rentCollecting) {
        this.rentCollecting = rentCollecting;
    }

    public short getRentRemmitting() {
        return rentRemmitting;
    }

    public void setRentRemmitting(short rentRemmitting) {
        this.rentRemmitting = rentRemmitting;
    }

    public short getLandlordSeeTenantRequest() {
        return landlordSeeTenantRequest;
    }

    public void setLandlordSeeTenantRequest(short landlordSeeTenantRequest) {
        this.landlordSeeTenantRequest = landlordSeeTenantRequest;
    }

    public short getLpmTotalCommission() {
        return lpmTotalCommission;
    }

    public void setLpmTotalCommission(short lpmTotalCommission) {
        this.lpmTotalCommission = lpmTotalCommission;
    }

    public short getRentSecurity() {
        return rentSecurity;
    }

    public void setRentSecurity(short rentSecurity) {
        this.rentSecurity = rentSecurity;
    }

    public short getRentOnTime() {
        return rentOnTime;
    }

    public void setRentOnTime(short rentOnTime) {
        this.rentOnTime = rentOnTime;
    }

    public short getRepairs() {
        return repairs;
    }

    public void setRepairs(short repairs) {
        this.repairs = repairs;
    }

    public short getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(short maintenance) {
        this.maintenance = maintenance;
    }

    public short getRequireLpm() {
        return requireLpm;
    }

    public void setRequireLpm(short requireLpm) {
        this.requireLpm = requireLpm;
    }

    public short getShowAllStatesAndLgas() {
        return showAllStatesAndLgas;
    }

    public void setShowAllStatesAndLgas(short showAllStatesAndLgas) {
        this.showAllStatesAndLgas = showAllStatesAndLgas;
    }

    public Integer getPackagePercentage() {
        return packagePercentage;
    }

    public void setPackagePercentage(Integer packagePercentage) {
        this.packagePercentage = packagePercentage;
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
        return "Packages{" + "id=" + id + ", name=" + name + ", alias=" + alias + ", vacancyAdvert=" + vacancyAdvert + ", rentCollecting=" + rentCollecting + ", rentRemmitting=" + rentRemmitting + ", landlordSeeTenantRequest=" + landlordSeeTenantRequest + ", lpmTotalCommission=" + lpmTotalCommission + ", rentSecurity=" + rentSecurity + ", rentOnTime=" + rentOnTime + ", repairs=" + repairs + ", maintenance=" + maintenance + ", requireLpm=" + requireLpm + ", showAllStatesAndLgas=" + showAllStatesAndLgas + ", packagePercentage=" + packagePercentage + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
