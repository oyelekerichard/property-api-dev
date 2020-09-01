/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 *
 * @author richard.oyeleke
 */
@Getter
@Setter
@Document
@Data
public class Properties extends GenericDocument
{
    @NotNull
    private String title;    
    @NotNull
    private String state;
    @NotNull
    private String lga;
    @NotNull
    private String street;
    @NotNull
    private String houseNumber;
    @NotNull
    private String addressLine2;
    
    private List<Images> image;
    
    private String country;
    private Integer editedBy;
    private String propertyType;
    private String liveizyId;
    private String status;
    private boolean editRequest;
    private boolean lpmCanEdit;
    @DBRef
    private Integer agentId;
    private Integer estateId;
    private Integer landlordId;
    private String agentVerify;
    private String adminVerify;
    private boolean regComplete;
    private Integer userinchargeId;
    private String userInChargeAs;
    private List<Apartment> apartments;
}
