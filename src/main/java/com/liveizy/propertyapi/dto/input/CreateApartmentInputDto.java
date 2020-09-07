/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.dto.input;

import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author richard.oyeleke
 */
@Getter
@Setter
@Data
public class CreateApartmentInputDto {
    
    @NotNull
    private String apartmentId;
    @NotNull
    private String propertyId;
    @NotNull
    private String typeOfApartment;
    
    @NotNull
    private String alpmId;
    private String[] images;
    private double rentValue;
    private String occupancyStatus;
    private Date rentPaymentDate; 
    private String[] rentPaymentPlan; //annually, monthly, quarterly, biannual
    private int numberOfRooms;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private int numberOfRoomsEnsuite;
    private String typeOfMeter; //prepaid, Analog, none
    private String floorFinishing; // tiles
    private String numberOfSittingRooms;
    private String otherFeatures;
    
}
