package com.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.models.Category;
import com.product.models.Product;
import com.product.services.CategoryService;
import com.product.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	@GetMapping("/")
	public String index(Model model) {
		List<Category> categories = categoryService.findAll();
		model.addAttribute("categories", categories);
		return "index.jsp";
	}
	
	@GetMapping("/categories/new") 
	public String newCategory(@ModelAttribute Category category){
		
		return "newCategory.jsp";
	}
	@PostMapping("/categories/create")
	public String createCategory(@ModelAttribute Category category) { //todo : check validity
		
		categoryService.create(category);
		return "redirect:/";
	}
	@GetMapping("/categories/{id}")
	public String showCategory(@PathVariable Long id, Model model) {
		Category category = categoryService.findById(id);
		model.addAttribute("category", category);
		model.addAttribute("newProducts", productService.findByCategoriesNotContains(category));

		return "showCategory.jsp";
	}
	@PostMapping("/categories/addProduct/{id}")
	public String addProductToCategory(@PathVariable Long id, @RequestParam("product") Long product_id) {
		Product product = productService.findById(product_id);
		Category category = categoryService.findById(id);
		
		product.getCategories().add(category);
		productService.update(product);
		return "redirect:/categories/{id}";
		
	}
	@DeleteMapping("/categories/delete/{id}")
	public String deleteCategory(@PathVariable Long id) {
		categoryService.delete(id);
		return "redirect:/";
		
	}
	
	@GetMapping("/products/new") 
	public String newProduct(@ModelAttribute Product product){
		
		return "newProduct.jsp";
	}
	
	@PostMapping("/products/create")
	public String createProduct(@ModelAttribute Product product) { //todo : check validity
		
		productService.create(product);
		return "redirect:/";
	}
	@GetMapping("/products/{id}")
	public String showProduct(@PathVariable Long id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		model.addAttribute("newCategories", categoryService.findByProductsNotContains(product));
		return "showProduct.jsp";
	}
	
}
