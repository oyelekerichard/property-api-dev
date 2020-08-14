package com.liveizy.propertyapi.dto.misc;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiFieldError {

    private final String field;
    private final String message;
    private final Object rejectedValue;

}
