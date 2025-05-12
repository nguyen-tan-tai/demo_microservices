package com.example.orderservice.repositories;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.orderservice.models.Order;
import com.example.orderservice.models.OrderDetail;

@Service
public class OrderService {

    public Long placeOrder(List<OrderDetail> list) {
        Order order = new Order();
        return order.getId();
    }
}
