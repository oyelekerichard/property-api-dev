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
@Table(name = "landlord_agents")
public class LandlordAgents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private Integer landlordId;
    private Integer agentId;
    private short accepted;
    private String token;
    private Integer inviteNumber;
    private short canCreateProperty;
    private short createPropertyRequest;
    private Date dateCreated;
    private Date dateUpdated;

    public LandlordAgents() {
    }

    public LandlordAgents(Integer id, Integer landlordId, Integer agentId, short accepted, String token, Integer inviteNumber, short canCreateProperty, short createPropertyRequest, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.landlordId = landlordId;
        this.agentId = agentId;
        this.accepted = accepted;
        this.token = token;
        this.inviteNumber = inviteNumber;
        this.canCreateProperty = canCreateProperty;
        this.createPropertyRequest = createPropertyRequest;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public short getAccepted() {
        return accepted;
    }

    public void setAccepted(short accepted) {
        this.accepted = accepted;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getInviteNumber() {
        return inviteNumber;
    }

    public void setInviteNumber(Integer inviteNumber) {
        this.inviteNumber = inviteNumber;
    }

    public short getCanCreateProperty() {
        return canCreateProperty;
    }

    public void setCanCreateProperty(short canCreateProperty) {
        this.canCreateProperty = canCreateProperty;
    }

    public short getCreatePropertyRequest() {
        return createPropertyRequest;
    }

    public void setCreatePropertyRequest(short createPropertyRequest) {
        this.createPropertyRequest = createPropertyRequest;
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
        return "LandlordAgents{" + "id=" + id + ", landlordId=" + landlordId + ", agentId=" + agentId + ", accepted=" + accepted + ", token=" + token + ", inviteNumber=" + inviteNumber + ", canCreateProperty=" + canCreateProperty + ", createPropertyRequest=" + createPropertyRequest + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }

}
