package com.norman1208.multistoragewarehouse.inners.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@Table(name = "product")
public class Product {
    private UUID id;
    private UUID categoryId;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity; // Current stock
    private byte[] image;

    // Getters and Setters
}
