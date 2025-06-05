package com.example.catalogservice.controllers.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class ErrorResponse {

    public ErrorResponse(HttpStatus status, String message) {
        this.status = status.value();
        this.message = message;
    }

    @Getter
    private int status;

    @Getter
    private String message;
}
