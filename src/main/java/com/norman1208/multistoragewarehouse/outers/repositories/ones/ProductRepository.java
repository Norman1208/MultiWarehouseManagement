package com.norman1208.multistoragewarehouse.outers.repositories.ones;


import com.norman1208.multistoragewarehouse.inners.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

}

