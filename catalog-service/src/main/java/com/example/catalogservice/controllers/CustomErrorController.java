package com.example.catalogservice.controllers;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorController implements ErrorController {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<?> handleException(Throwable e) {
        StringWriter errors = new StringWriter();
        e.printStackTrace(new PrintWriter(errors));
        return new ResponseEntity<>("{}", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
