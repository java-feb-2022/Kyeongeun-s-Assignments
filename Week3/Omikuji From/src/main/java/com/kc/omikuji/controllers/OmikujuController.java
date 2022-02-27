package com.kc.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujuController {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String process(@RequestParam Integer number, @RequestParam String city,
			@RequestParam String person, @RequestParam String hobby, @RequestParam String thing, 
			@RequestParam String comment, HttpSession session) {
		
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);		
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("comment", comment);
		
		return "redirect:/show";
	}
	
	@GetMapping("/show")
	public String show(HttpSession session, Model viewModel) {
		viewModel.addAttribute("number", session.getAttribute("number"));
		viewModel.addAttribute("city", session.getAttribute("city"));
		viewModel.addAttribute("person", session.getAttribute("person"));
		viewModel.addAttribute("hobby", session.getAttribute("hobby"));
		viewModel.addAttribute("thing", session.getAttribute("thing"));
		viewModel.addAttribute("comment", session.getAttribute("comment"));
		return "omikuji.jsp";
	}
	
}
