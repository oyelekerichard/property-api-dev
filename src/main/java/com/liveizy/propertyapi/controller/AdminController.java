package com.liveizy.propertyapi.controller;

import com.liveizy.propertyapi.dto.input.CreatePropertyInputDto;
import com.liveizy.propertyapi.dto.misc.ApiFieldError;
import com.liveizy.propertyapi.dto.output.StandardResponseDTO;
import com.liveizy.propertyapi.models.Properties;
import com.liveizy.propertyapi.service.PropertyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import org.mapstruct.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/v1/admin")
@Api(tags = "Admin")
//@ApiResponses({
//    @ApiResponse(code = 400, message = "Bad request", response = ApiFieldError[].class),})
@RequiredArgsConstructor
public class AdminController {

    @Autowired
    private HttpServletRequest request;
    
    @Autowired
    private PropertyService propertyService;

    @PostMapping("property")
    public StandardResponseDTO createProperty(@RequestBody @Valid CreatePropertyInputDto createPropertyInputDto, HttpServletRequest request) {
        return propertyService.createProperty(createPropertyInputDto);
    }

    @GetMapping("getProperty/{createdBy}")
    public StandardResponseDTO getProperty(@PathVariable("createdBy") @Valid String createdBy) {
        return propertyService.getPropertyByCreatedBy(createdBy);
    }

    @GetMapping("getAllProperties/{createdBy}")
    public StandardResponseDTO listAllProperties(@PathVariable("createdBy") @Valid String createdBy) {
        return propertyService.getAllPropertiesByCreatedBy(createdBy);
    }

    @PutMapping("updateProperty/{createdBy}")
    public StandardResponseDTO updateProperty(@PathVariable("createdBy") @Valid String createdBy) {
        return propertyService.updateProperty(createdBy);
    }

    @DeleteMapping("deleteProperty/{createdBy}")
    public StandardResponseDTO deleteProperty(@PathVariable("createdBy") @Valid String createdBy) {
        return propertyService.updateProperty(createdBy);
    }

//    @PostMapping("assignProperty/{alpmId}")
//    public StandardResponseDTO assignProperty(@PathVariable("alpmId") @Valid String alpmId) {
//        /*
//        Expose endpoint to assign ALPM to property. 
//        the endpoint should accept the ID of the ALPM. 
//        the endpoint should also accept two extra (optional) fields: - 
//        can create property - can edit property
//        */
//        return propertyService.updateProperty(createdBy);
//    }
//
//    @PostMapping("showInterestProperty/{alpmId}/{propertyId}")
//    public StandardResponseDTO showInterestProperty(@PathVariable("alpmId") @Valid String alpmId) {
//        /*
//        When user click show interest, Pop-up form shows. 
//        Users provide the following details: Profile Image, Full name,
//        Date of Birthday, email, contact mobile number, state of origin, 
//        previous apartments detail (rent value, property manager/owner details- name, 
//        phone number), Address of previous apartment, Married or single, 
//        Number of expected occupant, Emergency contact details- 
//        (name, phone number, relationship). Work status (Business owner,Self-employed, Employee), 
//        office/ Business Address, Monthly Salary 
//
//        Details can be editable by the user after submitting.
//        */
//        return propertyService.updateProperty(createdBy);
//    }
//    
//    @PostMapping("updateshowInterestProperty/{alpmId}/{propertyId}")
//    public StandardResponseDTO updateshowInterestProperty(@PathVariable("alpmId") @Valid String alpmId) {
//        /*
//        When user click show interest, Pop-up form shows. 
//        Users provide the following details: Profile Image, Full name,
//        Date of Birthday, email, contact mobile number, state of origin, 
//        previous apartments detail (rent value, property manager/owner details- name, 
//        phone number), Address of previous apartment, Married or single, 
//        Number of expected occupant, Emergency contact details- 
//        (name, phone number, relationship). Work status (Business owner,Self-employed, Employee), 
//        office/ Business Address, Monthly Salary 
//
//        Details can be editable by the user after submitting.
//        */
//        return propertyService.updateProperty(createdBy);
//    }
//
//
//    @PostMapping("showInterestStatus/{alpmId}/{propertyId}")
//    public StandardResponseDTO showInterestStatus(@PathVariable("alpmId") @Valid String alpmId) {
//
//        /*
//        Accepted:
//
//            When user show of Interest is Accepted, User will receive alert and get the Tenancy Agreement (for apartment under subscription plan)
//            User will receive alert to contact PO/PM to complete their process (out of platform)
//        Accepted user can Pay rent from izyPay/izyInvest
//        Declined:
//
//        User see update
//        User can  delete apartment from list of show of interest 
//         */
//        return propertyService.updateProperty(createdBy);
//    }
//
//    @PostMapping("scheduleInspectionProperty/{alpmId}/{propertyId}")
//    public StandardResponseDTO scheduleInspectionProperty(@PathVariable("alpmId") @Valid String alpmId) {
//        /*
//        User will be able to schedule multiple apartment Inspection
//
//- User can reschedule Date and time selected based on available schedule available
//
//- User can be able to see Update status of show of Interest application- Pending/Accepted/ Declined 
//
//- User can be able to delete inspection schedule created
//
//user should be able to see the position of the property on the Map.
//         */
//        return propertyService.updateProperty(createdBy);
//    }
//
//    @PostMapping("addProperty/{alpmId}/{propertyId}")
//    public StandardResponseDTO addProperty(@PathVariable("alpmId") @Valid String alpmId) {
//        /*
//        PM/PO can add multiple apartment to Property created
//Each Apartment should generate unique id (11 digit strong)
//Apartment should contain: rent value,  status (Vacant/Occupied), rent payment date(Occupied- date,month), rent payment plan (selectable-Annual, monthly, quarterly, bi-annual), Number of room, number bathroom, number of toilet, number of room ensuite, Type of Metre (Prepaid, Analog, None), Floor finishing (Input box), Number of sitting-room, Add multiple apartment images 
//Other features (A description input box to list all other features)
//Add other charges- title, amount, frequency (once, annually, monthly, quarterly, Bi-annually) . Add more charges
//permission to advertise (vacant)- advertising apartment, all details is required
//Apartment details can be editable after created
//         */
//        return propertyService.updateProperty(createdBy);
//    }
//    
//    @PutMapping("referral/{createdBy}")
//    public StandardResponseDTO referral(@PathVariable("createdBy") @Valid String createdBy) {
//        return propertyService.updateProperty(createdBy);
//    
//    /*
//    User is able to refer other users using Liveizy ID, Unique link or send an email invite
//    Add referred to the referral's dashboard (show status: Active-when they verify email, Pending-when email is not verified)
//    Show- referral balance, phone number of referred
//    request- bank account details of user
//    Generate referral commission as % of credit to izyPay
//    Admin should be able to edit % commission value 
//    */
//    }
}
