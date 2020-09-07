package com.liveizy.propertyapi.dto.input;

import lombok.Getter;
import lombok.Setter;

import lombok.Data;

@Getter
@Setter
@Data
public class CreatePropertyInputDto {

    private String title;
    private String state;
    private String lga;
    private String street;
    private String houseNumber;
    private String addressLine2;
    
    private String[] images;
    
    private Integer editedBy;
    private String country;
    private String propertyType;
    private String liveizyId;
    private String status;
    private boolean editRequest;
    private boolean lpmCanEdit;
    private Integer agentId;
    private Integer estateId;
    private Integer landlordId;
}
