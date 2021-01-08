package com.bank.exception;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 12/09/2020
 *
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {
        //Create a payload containing exception in details
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        ApiException apiException = new ApiException(e.getMessage(),
                e,
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z")));
        //Return Response Entity
        return new ResponseEntity<>(apiException, badRequest);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleGlobalException(Exception e) {
        //Create a payload containing exception in details
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        ApiException apiException = new ApiException(e.getMessage(),
                e,
                httpStatus,
                ZonedDateTime.now(ZoneId.of("Z")));
        //Return Response Entity
        return new ResponseEntity<>(apiException, httpStatus);
    }
}
