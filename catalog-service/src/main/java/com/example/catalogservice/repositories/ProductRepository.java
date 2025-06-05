package com.example.catalogservice.repositories;

import com.example.catalogservice.models.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private AtomicLong idSeq = new AtomicLong(1011L);

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.addAll(Arrays.asList(
                new Product(1001L, "Rasberry Pi 5", ""),
                new Product(1002L, "Micro SD 128GB", ""),
                new Product(1003L, "Power adapter 30W", ""),
                new Product(1004L, "Type C cable", ""),
                new Product(1005L, "DAC I2S PCM5102 High-Quality Lossless Digital Audio", ""),
                new Product(1006L, "DFRobot Gravity: BMX160+BMP388", ""),
                new Product(1007L, "Waveshare PCIe To M.2 NVMe PCIe SSD", ""),
                new Product(1008L, "AC8265 Wireless NIC for Jetson Nano", ""),
                new Product(1009L, "Waveshare Relay Expansion Board For Jetson Nano", ""),
                new Product(1010L, "AI NVIDIA Jetson Orin Nano Super Developer Kit", "")));
    }

    public Optional<Product> findById(Long id) {
        return products.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
    }

    public List<Product> findAll() {
        return products;
    }

    public Product save(String name, String desc) {
        Product p = new Product(idSeq.getAndIncrement(), name, desc);
        products.add(p);
        return p;
    }
}
