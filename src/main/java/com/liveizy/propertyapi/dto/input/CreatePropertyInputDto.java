package com.liveizy.propertyapi.dto.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreatePropertyInputDto {

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
}
