package com.example.OAuth2.Security.Service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.OAuth2.Security.Entity.Product;
import com.example.OAuth2.Security.Repo.ProductRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepo productRepo;
	
	private final Random random = new Random();
	
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	public Product createProduct() {
		Product product = new Product();
		product.setName("Product"+random.nextInt(1000));
		product.setQuantity(random.nextInt(100));
		product.setPrice(random.nextDouble()*100);
		
		return productRepo.save(product);
	}

	
	
}
