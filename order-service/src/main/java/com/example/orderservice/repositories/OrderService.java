package com.example.orderservice.repositories;

import com.example.orderservice.controllers.OrderController.OrderItem;
import com.example.orderservice.models.Order;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Long placeOrder(List<OrderItem> list) {
        Order order = new Order();
        return order.getId();
    }
}
