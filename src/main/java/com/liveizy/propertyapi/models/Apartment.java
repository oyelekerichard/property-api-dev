/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author richard.oyeleke
 */
@Data
public class Apartment 
{
    private String propertyId;
    private String apartmentId;
    private String typeOfApartment;
    private String agentId;
    private List<String> images;
    private double rentValue;
    private String occupancyStatus;
    private Date rentPaymentDate; 
    private String rentPaymentPlan; //annually, monthly, quarterly, biannual
    private int numberOfRooms;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private int numberOfRoomsEnsuite;
    private String typeOfMeter; //prepaid, Analog, none
    private String floorFinishing; // tiles
    private String numberOfSittingRooms;
    private String otherFeatures;
    
    
//    
//    ,  status (Vacant/Occupied), rent payment date(Occupied- date,month), 
//            rent payment plan (selectable-Annual, monthly, quarterly, bi-annual), Number of room, number bathroom, 
//            number of toilet, number of room ensuite, Type of Metre (Prepaid, Analog, None),
//            Floor finishing (Input box), Number of sitting-room, Add multiple apartment images 
}
