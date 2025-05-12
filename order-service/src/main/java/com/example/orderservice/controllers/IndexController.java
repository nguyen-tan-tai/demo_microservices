package com.example.orderservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
public class IndexController {

    @GetMapping("/")
    @Hidden
    public ResponseEntity<?> index() {
        return ResponseEntity.ok("{}");
    }
}
