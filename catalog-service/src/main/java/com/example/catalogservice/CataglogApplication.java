package com.example.catalogservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Catalog API", version = "1.0", description = "Catalog API v1.0"))
public class CataglogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CataglogApplication.class, args);
    }
}
