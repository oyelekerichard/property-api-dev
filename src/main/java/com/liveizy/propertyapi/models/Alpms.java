/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author richard.oyeleke
 */
@Getter
@Setter
@Data
@Document
public class Alpms 
{
    private int alpmId;
    private int liveIzyId;
//    private int agentId;
    
    private Boolean isEnabled;
    private Date createdDate;
    private Date updatedDate;
}
