package com.example.OAuth2.Security.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.OAuth2.Security.Entity.Product;
import com.example.OAuth2.Security.Service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final ProductService productService;

    // Constructor Injection (Recommended)
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/create")

    public Product createRandomProduct() {
        return productService.createProduct();
    }
}
