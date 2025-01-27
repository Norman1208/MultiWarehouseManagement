package com.norman1208.multistoragewarehouse.outers.deliveries.rests;


//import com.norman1208.multistoragewarehouse.inners.models.valueobjects.statistics.StockMutationHistory;
import com.norman1208.multistoragewarehouse.inners.models.entities.Product;
import com.norman1208.multistoragewarehouse.inners.usecases.products.ProductUseCase;
//import com.norman1208.multistoragewarehouse.inners.usecases.statistics.StockMutationUseCase;
//import com.norman1208.multistoragewarehouse.outers.repositories.ones.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductUseCase productService;

//    @Autowired
//    private StockMutationUseCase stockMutationUseCase;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable UUID id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable UUID id) {
        productService.deleteProduct(id);
    }

//    @GetMapping("/{id}/mutations")
//    public List<StockMutationHistory> getStockMutations(@PathVariable UUID id) {
//        return stockMutationUseCase.getStockMutations(id);
//    }
}

