package com.example.orderservice.models;

import java.util.Collections;
import java.util.List;

public class Order {

    private Long id;

    private List<OrderDetail> orderDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderDetail> getOrderDetail() {
        return Collections.unmodifiableList(orderDetail);
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }
}
