package com.example.orderservice.controllers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.models.Order;
import com.example.orderservice.models.OrderDetail;
import com.example.orderservice.repositories.OrderService;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<Order> order() {
        Order order = new Order();
        order.setId(Long.MAX_VALUE);
        OrderDetail od = new OrderDetail();
        od.setProductId(100L);
        od.setQuantity(1000);
        od.setPrice("100.2");
        order.setOrderDetail(Arrays.asList(od));
        return Arrays.asList(order);
    }

    @PostMapping("/order/place")
    public Long order(@RequestBody OrderRequest orderRequest) {
        throw new RuntimeException("Not implement");
    }

    public static class OrderRequest {

        private List<OrderItemRequest> orderDetails;

        public List<OrderItemRequest> getOrderDetails() {
            return Collections.unmodifiableList(this.orderDetails);
        }

        public void setOrderDetails(List<OrderItemRequest> orderDetails) {
            this.orderDetails = orderDetails;
        }
    }

    public static class OrderItemRequest {

        private long productId;
        private int quantity;

        public long getProductId() {
            return productId;
        }

        public void setProductId(long productId) {
            this.productId = productId;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
