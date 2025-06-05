package com.example.catalogservice.services;

import com.example.catalogservice.models.Product;
import com.example.catalogservice.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product create(String name, String desc) {
        return productRepository.save(name, desc);
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}
