package com.example.orderservice.controllers;

import com.example.orderservice.repositories.OrderService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order/place")
    public Long order(@RequestBody OrderRequest orderRequest) {
        return orderService.placeOrder(orderRequest.getOrderDetails());
    }

    public static class OrderRequest {

        private List<OrderItem> orderDetails;

        public List<OrderItem> getOrderDetails() {
            return Collections.unmodifiableList(this.orderDetails);
        }

        public void setOrderDetails(List<OrderItem> orderDetails) {
            this.orderDetails = orderDetails;
        }
    }

    public static class OrderItem {

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
