package com.example.orderservice.client;

import com.example.orderservice.models.Product;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service")
public interface CatalogClient {

    @GetMapping("/catalog/{id}")
    List<Product> findById(@PathVariable("id") Long id);
}
