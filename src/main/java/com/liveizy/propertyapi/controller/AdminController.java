package com.liveizy.propertyapi.controller;

import com.liveizy.propertyapi.dto.input.CreatePropertyInputDto;
import com.liveizy.propertyapi.dto.misc.ApiFieldError;
import com.liveizy.propertyapi.dto.output.StandardResponseDTO;
import com.liveizy.propertyapi.service.PropertyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/admin")
@Api(tags = "Admin")
@ApiResponses({
        @ApiResponse(code = 400, message = "Bad request", response = ApiFieldError[].class),
})
@RequiredArgsConstructor
public class AdminController {

    private final PropertyService propertyService;

    @PostMapping("property")
    public StandardResponseDTO createProperty(@RequestBody @Valid CreatePropertyInputDto createPropertyInputDto) {
        return propertyService.createProperty(createPropertyInputDto);
    }

}
