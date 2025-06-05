package com.example.catalogservice.controllers.products;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

public class ProductAddRequest {
    @Setter
    @Getter
    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @Setter
    @Getter
    @NotNull
    @Size(min = 1, max = 255)
    private String desc;
}
