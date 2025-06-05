package com.example.catalogservice.controllers.products;

import com.example.catalogservice.common.exceptions.ResourceNotFoundException;
import com.example.catalogservice.models.Product;
import com.example.catalogservice.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product/add")
    public ProductResponse create(@Valid @RequestBody ProductAddRequest request) {
        return new ProductResponse(productService.create(request.getName(), request.getDesc()));
    }

    @GetMapping("/product/id/{id}")
    public ProductResponse findById(@PathVariable Long id) throws ResourceNotFoundException {
        Product p = productService.findById(id).orElseThrow(ResourceNotFoundException::new);
        return new ProductResponse(p);
    }

    @GetMapping("/products")
    public ProductListResponse findAll() {
        return new ProductListResponse(productService.findAll());
    }
}
