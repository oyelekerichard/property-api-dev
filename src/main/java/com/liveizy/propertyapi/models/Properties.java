/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 *
 * @author richard.oyeleke
 */
@Getter
@Setter
@Document
public class Properties extends GenericDocument
{
    @NotNull
    private String title;
    private String propertyType;
    private String liveizyId;
    private String country;
    private String state;
    private String lga;
    private String street;
    private String houseNumber;
    private String addressLine2;
    private String image;
    private Integer editedBy;
    private String status;
    private boolean editRequest;
    private boolean lpmCanEdit;
    private Integer agentId;
    private Integer estateId;
    private Integer landlordId;
    private String agentVerify;
    private String adminVerify;
    private boolean regComplete;
    private Integer userinchargeId;
    private String userInChargeAs;


}
