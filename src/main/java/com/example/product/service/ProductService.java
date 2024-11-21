package com.example.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public Product addProduct(Product product) {	
		return productRepository.addProduct(product);
	}

	public List<Product> findAllProducts() {
		return productRepository.findAllProducts();
	}

	public void deleteProduct(int productId) {
		productRepository.deleteProduct(productId);
	}
}
