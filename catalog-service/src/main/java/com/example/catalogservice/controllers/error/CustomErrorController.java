package com.example.catalogservice.controllers.error;

import com.example.catalogservice.common.exceptions.ResourceNotFoundException;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class CustomErrorController implements ErrorController {

    @ExceptionHandler(Throwable.class)
    public ErrorResponse handleException(Throwable e) {
        return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "There is a problem. That's all we know.");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleValidationExceptions(MethodArgumentNotValidException e) {
        return new ErrorResponse(HttpStatus.BAD_REQUEST, "The resource you request does not exist.");
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ErrorResponse handleValidationExceptions(ResourceNotFoundException e) {
        return new ErrorResponse(HttpStatus.NOT_FOUND, "The resource you request does not exist.");
    }
}
