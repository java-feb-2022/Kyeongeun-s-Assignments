package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.models.Category;
import com.product.models.Product;
import com.product.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> findAll(){
		return productRepo.findAll();
	}
	
	public Product create(Product product) {
		return productRepo.save(product);
	}
	public Product update(Product product) {
		return productRepo.save(product);
	}
	public Product findById(Long id) {
		return productRepo.findById(id).orElse(null);
	}
	
	public List<Product> findByCategoriesNotContains(Category category){
		return productRepo.findByCategoriesNotContains(category);
	}
}
