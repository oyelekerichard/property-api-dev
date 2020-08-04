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
@Table(name = "property_apartments")
public class PropertyApartments implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String liveizyId;
    private double rent;
    private enum occupancy{vacant,occupied};
    private String floor;
    private String position;
    private short kitchen;
    private short verander;
    private short pool;
    private Integer rooms;
    private Integer toilets;
    private short parkingSpace;
    private Integer ensuites;
    private Integer entrances;
    private enum meter{prepaid,analog};
    private String finishing;
    private String image;
    private String otherFeature;
    private Integer tenantId;
    private Integer propertyId;
    private String rentPaymentDate;
    private enum advertisementStatus{Pending,Approved,Review,Decline}
    private Date createTime;
    private Date updateTime;

    public PropertyApartments() {
    }

    public PropertyApartments(Integer id, String liveizyId, double rent, String floor, String position, short kitchen, short verander, short pool, Integer rooms, Integer toilets, short parkingSpace, Integer ensuites, Integer entrances, String finishing, String image, String otherFeature, Integer tenantId, Integer propertyId, String rentPaymentDate, Date createTime, Date updateTime) {
        this.id = id;
        this.liveizyId = liveizyId;
        this.rent = rent;
        this.floor = floor;
        this.position = position;
        this.kitchen = kitchen;
        this.verander = verander;
        this.pool = pool;
        this.rooms = rooms;
        this.toilets = toilets;
        this.parkingSpace = parkingSpace;
        this.ensuites = ensuites;
        this.entrances = entrances;
        this.finishing = finishing;
        this.image = image;
        this.otherFeature = otherFeature;
        this.tenantId = tenantId;
        this.propertyId = propertyId;
        this.rentPaymentDate = rentPaymentDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public short getKitchen() {
        return kitchen;
    }

    public void setKitchen(short kitchen) {
        this.kitchen = kitchen;
    }

    public short getVerander() {
        return verander;
    }

    public void setVerander(short verander) {
        this.verander = verander;
    }

    public short getPool() {
        return pool;
    }

    public void setPool(short pool) {
        this.pool = pool;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getToilets() {
        return toilets;
    }

    public void setToilets(Integer toilets) {
        this.toilets = toilets;
    }

    public short getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(short parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public Integer getEnsuites() {
        return ensuites;
    }

    public void setEnsuites(Integer ensuites) {
        this.ensuites = ensuites;
    }

    public Integer getEntrances() {
        return entrances;
    }

    public void setEntrances(Integer entrances) {
        this.entrances = entrances;
    }

    public String getFinishing() {
        return finishing;
    }

    public void setFinishing(String finishing) {
        this.finishing = finishing;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOtherFeature() {
        return otherFeature;
    }

    public void setOtherFeature(String otherFeature) {
        this.otherFeature = otherFeature;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getRentPaymentDate() {
        return rentPaymentDate;
    }

    public void setRentPaymentDate(String rentPaymentDate) {
        this.rentPaymentDate = rentPaymentDate;
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
        return "PropertyApartments{" + "id=" + id + ", liveizyId=" + liveizyId + ", rent=" + rent + ", floor=" + floor + ", position=" + position + ", kitchen=" + kitchen + ", verander=" + verander + ", pool=" + pool + ", rooms=" + rooms + ", toilets=" + toilets + ", parkingSpace=" + parkingSpace + ", ensuites=" + ensuites + ", entrances=" + entrances + ", finishing=" + finishing + ", image=" + image + ", otherFeature=" + otherFeature + ", tenantId=" + tenantId + ", propertyId=" + propertyId + ", rentPaymentDate=" + rentPaymentDate + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
    
}
