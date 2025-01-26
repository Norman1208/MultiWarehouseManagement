package com.norman1208.multistoragewarehouse.inners.models.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;


@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    // Getters and Setters
}
