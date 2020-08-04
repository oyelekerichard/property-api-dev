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
public class IzyBudgetConfigs implements Serializable
{
    private Integer id;
    private double amount;
    private double lowBudget;
    private double discount;
    private Date dateCreated;
    private Date dateUpdated;

    public IzyBudgetConfigs() {
    }

    public IzyBudgetConfigs(Integer id, double amount, double lowBudget, double discount, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.amount = amount;
        this.lowBudget = lowBudget;
        this.discount = discount;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getLowBudget() {
        return lowBudget;
    }

    public void setLowBudget(double lowBudget) {
        this.lowBudget = lowBudget;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
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
        return "IzyBudgetConfigs{" + "id=" + id + ", amount=" + amount + ", lowBudget=" + lowBudget + ", discount=" + discount + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
