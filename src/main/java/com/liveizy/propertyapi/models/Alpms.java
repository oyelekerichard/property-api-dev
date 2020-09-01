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

/**
 *
 * @author richard.oyeleke
 */
@Getter
@Setter
@Data
public class Alpms 
{
    private Integer liveIzyId;
    private Integer agentId;
    private Integer alpmId;
    private Boolean isEnabled;
    private Date createdDate;
    private Date updatedDate;
}
