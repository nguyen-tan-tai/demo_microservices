package com.example.catalogservice.controllers;

import com.example.catalogservice.models.Product;
import com.example.catalogservice.repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository repository;

    @PostMapping("/product/add")
    public Product add(@RequestBody Product employee) {
        return repository.add(employee);
    }

    @GetMapping("/product/code/{code}")
    public Product findById(@PathVariable String code) {
        return repository.findByCode(code);
    }

    @GetMapping("/product/")
    public List<Product> findAll() {
        return repository.findAll();
    }
}
