package com.norman1208.multistoragewarehouse.outers.repositories.ones;

import com.norman1208.multistoragewarehouse.inners.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
