package com.book.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.book.models.Book;
import com.book.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> books= bookService.allBooks();
		model.addAttribute("books", books);
		return "/books/index.jsp";
	}
	@GetMapping("/books/new")
	public String add(Model model) {
		model.addAttribute("book", new Book());
		return "/books/new.jsp";
	}
	@PostMapping("/process/create")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "/books/new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	@GetMapping("/books/modify/{id}")
	public String modify(@PathVariable Long id, Model model) {
		Book b = bookService.findBook(id);
		model.addAttribute("book", b);
		
		return "/books/modify.jsp";
	}
	@PutMapping("/process/update/{id}")
	public String processUpdate(@Valid @ModelAttribute("book") Book book, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "/books/modify.jsp";
		} else {
			bookService.updateBook(book);
		
			return "redirect:/books";
		}
	}
	
	@DeleteMapping("/books/delete/{id}")
	public String delete(@PathVariable Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
	@GetMapping("/books/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Book b = bookService.findBook(id);
		
		model.addAttribute("book", b);
		return "/books/show.jsp";
	}
}
