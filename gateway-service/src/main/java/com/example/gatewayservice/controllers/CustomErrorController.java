package com.example.gatewayservice.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorController implements ErrorController {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<?> handleException(Throwable e) {
        e.printStackTrace();
        return new ResponseEntity<>("{}", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
