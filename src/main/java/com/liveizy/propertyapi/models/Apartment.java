/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

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
}
