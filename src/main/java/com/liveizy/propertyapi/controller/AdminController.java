package com.liveizy.propertyapi.controller;

import com.liveizy.propertyapi.dto.input.CreatePropertyInputDto;
import com.liveizy.propertyapi.dto.output.StandardResponseDTO;
import com.liveizy.propertyapi.models.Properties;
import com.liveizy.propertyapi.service.PropertyService;
import io.swagger.annotations.Api;
import javax.servlet.http.HttpServletRequest;
import com.google.gson.Gson;
import com.liveizy.propertyapi.dto.input.CreateApartmentInputDto;
import com.liveizy.propertyapi.models.Apartment;
import com.liveizy.propertyapi.service.ApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/v1/admin")
@Api(tags = "Admin")
//@ApiResponses({
//    @ApiResponse(code = 400, message = "Bad request", response = ApiFieldError[].class),})
@RequiredArgsConstructor
public class AdminController {

    @Autowired
    private HttpServletRequest request;
    private static final Gson gson = new Gson();
    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private ApartmentService apartmentService;

    @PostMapping("property")
    public StandardResponseDTO createProperty(@RequestBody @Valid CreatePropertyInputDto createPropertyInputDto, HttpServletRequest request) {
        return propertyService.createProperty(createPropertyInputDto);
    }

//    @GetMapping("getProperty/{createdBy}")
//    public StandardResponseDTO getProperty(@PathVariable("createdBy") @Valid String createdBy) {
//        return propertyService.getPropertiesByCreator(createdBy);
//    }

    @GetMapping("property/getPropertiesByCreator/{createdBy}")
    public StandardResponseDTO listAllPropertiesByCreator(@PathVariable("createdBy") @Valid String createdBy) {
        return propertyService.getPropertiesByCreator(createdBy);
    }

    @PostMapping("property/updateProperty")
    public StandardResponseDTO updateProperty(@PathVariable("propertyId") @Valid String propertyId, Properties properties , HttpServletRequest request) {
        return propertyService.updateProperty(propertyId, properties);
    }
    
    @PostMapping("apartment")
    public StandardResponseDTO createApartment(@RequestBody @Valid CreateApartmentInputDto createApartmentInputDto, HttpServletRequest request) {
        return apartmentService.createApartment(createApartmentInputDto);
    }
    
    @GetMapping("apartment/getApartment/{apartmentId}")
    public StandardResponseDTO getApartment(@PathVariable("apartmentId") @Valid String apartmentId, HttpServletRequest request) {
        return apartmentService.getApartment(apartmentId);
    }
    
    @GetMapping("apartment/getPropertyApartments/{propertyId}")
    public StandardResponseDTO getPropertyApartments(@PathVariable("propertyId") @Valid String propertyId, HttpServletRequest request) {
        return apartmentService.getApartmentsByPropertyId(propertyId);
    }
    
    @PostMapping("apartment/updateApartments/{apartmentId}")
    public StandardResponseDTO updateApartments(@PathVariable("apartmentId") @Valid String apartmentId, Apartment apartment, HttpServletRequest request) {
        return apartmentService.updateApartments(apartmentId, apartment);
    }
    
    @PostMapping("apartment/addApartmentToProperty/{propertyId}/{apartmentId}")
    public StandardResponseDTO addApartmentToProperty(@PathVariable("propertyId") @Valid String propertyId, @PathVariable("apartmentId") @Valid String apartmentId, HttpServletRequest request) {
        return apartmentService.addApartmentToProperty(propertyId, apartmentId);
    }
//    findByPropertyType
}