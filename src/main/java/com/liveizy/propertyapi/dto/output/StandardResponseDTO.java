package com.liveizy.propertyapi.dto.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.liveizy.propertyapi.dto.enums.Status;
import com.liveizy.propertyapi.dto.misc.ApiFieldError;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class StandardResponseDTO implements Serializable {

    @JsonProperty
    private final Status status;

    private final List<ApiFieldError> errors;

    private final Object data;

    public StandardResponseDTO(Status status, Object data){
        this.status =  status;
        this.data = data;
        this.errors = null;
    }

    public StandardResponseDTO(List<ApiFieldError> errors){
        this.status = Status.FAILED_VALIDATION;
        this.errors = errors;
        this.data = null;
    }


}
