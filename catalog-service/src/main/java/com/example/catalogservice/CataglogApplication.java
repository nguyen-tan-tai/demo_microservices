package com.example.catalogservice;

import com.example.catalogservice.repositories.ProductRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Catalog API", version = "1.0", description = "Documentation Catalog API v1.0"))
public class CataglogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CataglogApplication.class, args);
    }

    @Bean
    ProductRepository repository() {
        return new ProductRepository();
    }
}
