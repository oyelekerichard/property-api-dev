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
@Data
@Getter
@Setter
public class Tenant {
    private String tenantId;
    private String liveizyId;
    private Integer userId;
    private Integer occupiers;
    private Integer maleOccupants;
    private Integer femaleOccupants;
    private String employmentStatus;
    private String employerName;
    private String employerAddress;
    private String contactPersonWork;
    private String contactPersonPhone;
    private short specialNeeds;
    private String propertyOwnerName;
    private String propertyOwnerPhone;
    private String propertyManagerName;
    private String propertyManagerPhone;
    private String propertyOwnerBankId;
    private String propertyOwnerAccountNumber;
    private String propertyOwnerAccountName;
    private String guestTenantRentPaymentDate;
    private short canEditRentPaymentDate;
    private String guestTenantRentAmount;
    private Date createTime;
    private Date updateTime;

}
