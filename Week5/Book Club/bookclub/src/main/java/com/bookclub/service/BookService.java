package com.bookclub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookclub.models.Book;
import com.bookclub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	
	public List<Book> findAll(){
		return bookRepo.findAll();
	}
	public Book createBook(Book newBook) {
		return bookRepo.save(newBook);
	}
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	public Book findById(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
}
