package com.example.orderservice.models;

public class Product {

    private Long id;
    private String name;
    private String desc;
    private long stock;

    public Product(long id, String name, String desc, long stock) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
}
