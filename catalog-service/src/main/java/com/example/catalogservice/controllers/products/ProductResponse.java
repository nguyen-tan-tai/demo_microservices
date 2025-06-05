package com.example.catalogservice.controllers.products;

import com.example.catalogservice.models.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductResponse {
    private Product product;

    @JsonProperty(value = "id", index = 1)
    public Long getId() {
        return product.getId();
    }

    @JsonProperty(value = "name", index = 2)
    public String getName() {
        return product.getName();
    }

    @JsonProperty(value = "desc", index = 3)
    public String getDesc() {
        return product.getDesc();
    }
}
