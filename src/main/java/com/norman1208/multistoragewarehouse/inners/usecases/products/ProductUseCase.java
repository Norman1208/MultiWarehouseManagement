package com.norman1208.multistoragewarehouse.inners.usecases.products;

import com.norman1208.multistoragewarehouse.inners.models.entities.Product;
import com.norman1208.multistoragewarehouse.outers.repositories.ones.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductUseCase {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {return productRepository.findAll();}

    public Product addProduct(Product product) {return productRepository.save(product); }

    public Product updateProduct(UUID id, Product product) {
        product.setId(id);
        return productRepository.save(product); }

    public void deleteProduct(UUID id) {productRepository.deleteById(id); }
}
