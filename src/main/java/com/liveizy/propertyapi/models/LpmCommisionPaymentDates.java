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
public class LpmCommisionPaymentDates implements Serializable
{
   private Integer id;
   private String firstMonth;
   private String secondMonth;
   private String thirdMonth;
   private String fourthMonth;
   private String fifthMonth;
   private String sixthMonth;
   private String seventhMonth;
   private String eightMonth;
   private String ninthMonth;
   private String tenthMonth;
   private String eleventhMonth;
   private String twelfthMonth;
   private Date dateCreated;
   private Date dateUpdated;

    public LpmCommisionPaymentDates() {
    }

    public LpmCommisionPaymentDates(Integer id, String firstMonth, String secondMonth, String thirdMonth, String fourthMonth, String fifthMonth, String sixthMonth, String seventhMonth, String eightMonth, String ninthMonth, String tenthMonth, String eleventhMonth, String twelfthMonth, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.firstMonth = firstMonth;
        this.secondMonth = secondMonth;
        this.thirdMonth = thirdMonth;
        this.fourthMonth = fourthMonth;
        this.fifthMonth = fifthMonth;
        this.sixthMonth = sixthMonth;
        this.seventhMonth = seventhMonth;
        this.eightMonth = eightMonth;
        this.ninthMonth = ninthMonth;
        this.tenthMonth = tenthMonth;
        this.eleventhMonth = eleventhMonth;
        this.twelfthMonth = twelfthMonth;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstMonth() {
        return firstMonth;
    }

    public void setFirstMonth(String firstMonth) {
        this.firstMonth = firstMonth;
    }

    public String getSecondMonth() {
        return secondMonth;
    }

    public void setSecondMonth(String secondMonth) {
        this.secondMonth = secondMonth;
    }

    public String getThirdMonth() {
        return thirdMonth;
    }

    public void setThirdMonth(String thirdMonth) {
        this.thirdMonth = thirdMonth;
    }

    public String getFourthMonth() {
        return fourthMonth;
    }

    public void setFourthMonth(String fourthMonth) {
        this.fourthMonth = fourthMonth;
    }

    public String getFifthMonth() {
        return fifthMonth;
    }

    public void setFifthMonth(String fifthMonth) {
        this.fifthMonth = fifthMonth;
    }

    public String getSixthMonth() {
        return sixthMonth;
    }

    public void setSixthMonth(String sixthMonth) {
        this.sixthMonth = sixthMonth;
    }

    public String getSeventhMonth() {
        return seventhMonth;
    }

    public void setSeventhMonth(String seventhMonth) {
        this.seventhMonth = seventhMonth;
    }

    public String getEightMonth() {
        return eightMonth;
    }

    public void setEightMonth(String eightMonth) {
        this.eightMonth = eightMonth;
    }

    public String getNinthMonth() {
        return ninthMonth;
    }

    public void setNinthMonth(String ninthMonth) {
        this.ninthMonth = ninthMonth;
    }

    public String getTenthMonth() {
        return tenthMonth;
    }

    public void setTenthMonth(String tenthMonth) {
        this.tenthMonth = tenthMonth;
    }

    public String getEleventhMonth() {
        return eleventhMonth;
    }

    public void setEleventhMonth(String eleventhMonth) {
        this.eleventhMonth = eleventhMonth;
    }

    public String getTwelfthMonth() {
        return twelfthMonth;
    }

    public void setTwelfthMonth(String twelfthMonth) {
        this.twelfthMonth = twelfthMonth;
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
        return "LpmCommisionPaymentDates{" + "id=" + id + ", firstMonth=" + firstMonth + ", secondMonth=" + secondMonth + ", thirdMonth=" + thirdMonth + ", fourthMonth=" + fourthMonth + ", fifthMonth=" + fifthMonth + ", sixthMonth=" + sixthMonth + ", seventhMonth=" + seventhMonth + ", eightMonth=" + eightMonth + ", ninthMonth=" + ninthMonth + ", tenthMonth=" + tenthMonth + ", eleventhMonth=" + eleventhMonth + ", twelfthMonth=" + twelfthMonth + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
           
}
