package com.book.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.models.Book;
import com.book.services.BookService;

@RestController
public class BookApi {
	private final BookService bookService;

	public BookApi(BookService bookService) {

		this.bookService = bookService;
	}

	@RequestMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}
	
	@PostMapping("/api/books")
	public Book create(@RequestParam(value="title") String title,
			@RequestParam(value="description") String desc,
			@RequestParam(value ="language")String lang,
			@RequestParam(value="pages")Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}
	@GetMapping("/api/books/{id}")
	public Book show(@PathVariable("id")Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
	    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	        Book book = new Book(title, desc, lang, numOfPages);
	        return bookService.updateBook(book);
	    }
	    
	    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
	    public void destroy(@PathVariable("id") Long id) {
	        bookService.deleteBook(id);
	    }

	
	
}
