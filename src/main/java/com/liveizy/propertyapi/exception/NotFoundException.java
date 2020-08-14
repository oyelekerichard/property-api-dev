package com.liveizy.propertyapi.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super("Not found", new HttpStatusCodeException(HttpStatus.NOT_FOUND) {
        });
    }
}

