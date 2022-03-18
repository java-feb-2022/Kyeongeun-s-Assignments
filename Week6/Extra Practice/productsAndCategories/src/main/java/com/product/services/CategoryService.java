package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.models.Category;
import com.product.models.Product;
import com.product.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> findAll(){
		return categoryRepo.findAll();
	}

	public Category create(Category category) {

		return categoryRepo.save(category);
	}
	
	public Category findById(Long id) {
		return categoryRepo.findById(id).orElse(null);
	}

	public List<Category> findByProductsNotContains(Product product) {
		return categoryRepo.findByProductsNotContains(product);
	}

	public void delete(Long id) {
		categoryRepo.deleteById(id);
		
	}

}
