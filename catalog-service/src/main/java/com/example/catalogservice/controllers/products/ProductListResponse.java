package com.example.catalogservice.controllers.products;

import com.example.catalogservice.models.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductListResponse extends ArrayList<ProductResponse> {

    private static final long serialVersionUID = -2454926736136331360L;

    public ProductListResponse(List<Product> list) {
        this.addAll(list.stream().map(p -> new ProductResponse(p)).toList());
    }

}
