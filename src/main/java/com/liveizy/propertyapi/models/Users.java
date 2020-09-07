/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import java.util.Date;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author richard.oyeleke
 */
@Data
@Document
public class Users extends GenericDocument{

    public String id;
    public String liveizy_id;
    public String first_name;
    public String last_name;
    public String email;
    public String date_of_birth;
    public String phone;
    public String profile_image;
    public String gender;
    public String city_of_origin;
    public String state_of_origin;
    public String country;
    public String marital_status;
    public String monthly_income;
    public String number_of_children;
    public String office_address;
    public String place_of_business;
    public String previous_property_manager;
    public String referral_id;
    public Date email_verified_at;
    public String deleted_at;
    public Date created_at;
    public Date updated_at;

    public Users(String id, String liveizy_id, String first_name, String last_name, String email, int i, Date created_at, int i0) {
        
    }
}
