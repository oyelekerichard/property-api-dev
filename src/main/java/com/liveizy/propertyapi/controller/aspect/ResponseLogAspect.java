package com.liveizy.propertyapi.controller.aspect;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liveizy.propertyapi.dto.output.StandardResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Aspect
@Configuration
@Slf4j
public class ResponseLogAspect {
    @Autowired
    private HttpServletResponse response;

    @Autowired
    private HttpServletRequest request;

    @AfterReturning(value = "execution(* com.liveizy.propertyapi.controller.*.*(..))",
            returning = "returned")
    public void updateHttpStatus(JoinPoint joinPoint, Object returned) {


        StandardResponseDTO responseDTO = (StandardResponseDTO) returned;
        switch (responseDTO.getStatus()) {
            case SUCCESS -> response.setStatus(HttpStatus.OK.value());
            case CREATED -> response.setStatus(HttpStatus.CREATED.value());
            case INTERNAL_ERROR -> response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            case NOT_FOUND -> response.setStatus(HttpStatus.NOT_FOUND.value());
            case NOT_PERMITTED -> response.setStatus(HttpStatus.FORBIDDEN.value());
            case PRECONDITION_FAILED -> response.setStatus(HttpStatus.PRECONDITION_FAILED.value());
            case PAYMENT_REQUIRED -> response.setStatus(HttpStatus.PAYMENT_REQUIRED.value());
            case NO_RECORDS -> response.setStatus(HttpStatus.NO_CONTENT.value());
            default -> response.setStatus(HttpStatus.BAD_REQUEST.value());
        }

        log.info("request to endpoint: " + request.getRequestURI());
        try {
            String response = new ObjectMapper().writeValueAsString(responseDTO);
            log.info("returning: " + response);

        } catch (JsonProcessingException e) {
            log.error("couldn't echo response");
        }
    }
}
