/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author richard.oyeleke
 */
@Data
@Getter
@Setter
public class Users {
    
    private String userId;
    private String liveizyId;
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String phone;
    private String phone2;
    private String profileImage;
    private String gender;
    private String cityOfOrigin;
    private String stateOfOrigin;
    private String streetOfResidence;
    private String cityOfResidence;
    private String stateOfResidence;
    private String country;
    private String password;
    private String fileUpload;
    private String maritalStatus;
    private boolean adminVerifyTenant;
    private boolean adminVerifyLpm;
    private boolean adminVerifyLandlord;
    private short emailVerify;
    private short landlordProfileComplete;
    private short lpmProfileComplete;
    private short tenantProfileComplete;
}
