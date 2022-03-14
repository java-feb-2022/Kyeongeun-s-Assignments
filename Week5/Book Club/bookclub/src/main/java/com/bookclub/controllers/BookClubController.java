package com.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.bookclub.models.Book;
import com.bookclub.service.BookService;
import com.login.models.User;

@Controller
public class BookClubController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String dashboard(Model model, HttpSession session){
		if(session.getAttribute("loggedInUser")!=null) {
			model.addAttribute("books", bookService.findAll());
			return "dashboard.jsp";
		} else {
			return "redirect:/";
		}
	}
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book, HttpSession session) {
		if(session.getAttribute("loggedInUser")!=null) {
			return "new.jsp";
		} else {
			return "redirect:/";
		}
	}
	
	@PostMapping("/books/create")
	public String createBook(@Valid @ModelAttribute("book")Book book,
			BindingResult result,
			HttpSession session
			) {
		if(session.getAttribute("loggedInUser")==null) {
			return "redirect:/";
		}	
		if (result.hasErrors()) {
			System.out.println(result.toString());
			return "new.jsp";
		} else {
			System.out.println("hey?");
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id")Long id, Model model,
			HttpSession session) {
		if(session.getAttribute("loggedInUser")==null) {
			return "redirect:/";
		}
		model.addAttribute(bookService.findById(id));
		return "show.jsp";
	}
	@GetMapping("/books/edit/{id}")
	public String editBook(@PathVariable("id")Long id, Model model,
			HttpSession session) {
		if(session.getAttribute("loggedInUser")==null) {
			return "redirect:/";
		}
		
		Book book = bookService.findById(id);
		User loggedInUser = (User)session.getAttribute("loggedInUser");
		//permission check
		if (loggedInUser.getId().equals(book.getUser().getId())) {
			model.addAttribute("book", book);
			return "edit.jsp";
		} else {
			//todo : raise permission error?
			return "redirect:/books/" + id;
		}
	}

	@PutMapping("/books/update/{id}")
	public String updateBook(@Valid @ModelAttribute("book")Book book,
			BindingResult result,
			HttpSession session
			) {
		if(session.getAttribute("loggedInUser")==null) {
			return "redirect:/";
		}	
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {

			bookService.updateBook(book);
			return "redirect:/books";
		}
	}
	
	
	
}
