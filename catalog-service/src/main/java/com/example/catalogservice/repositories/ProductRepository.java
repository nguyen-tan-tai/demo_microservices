package com.example.catalogservice.repositories;

import com.example.catalogservice.models.Product;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ProductRepository {

    private List<Product> products = Arrays.asList(
            new Product("P01", "Rasberry Pi 5", "", 101),
            new Product("P03", "Micro SD 128GB", "", 103),
            new Product("P05", "Power adapter 30W", "", 105),
            new Product("P09", "Type C cable", "", 109));

    public Product findByCode(String code) {
        return products.stream()
                .filter(a -> a.getCode().equals(code))
                .findFirst()
                .orElseThrow();
    }

    public List<Product> findAll() {
        return products;
    }

    public Product add(Product p) {
        p.setCode(UUID.randomUUID().toString());
        products.add(p);
        return p;
    }
}
