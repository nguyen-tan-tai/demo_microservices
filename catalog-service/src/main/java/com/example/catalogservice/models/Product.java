package com.example.catalogservice.models;

public class Product {

    private String code;
    private String name;
    private String desc;
    private long stock;

    public Product(String code, String name, String desc, long stock) {
        this.code = code;
        this.name = name;
        this.desc = desc;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
