package com.kc.displaydate.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp"; 
	}
	@RequestMapping("/date")
	public String date(Model viewModel) {
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter formatterE = DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH);
		DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("dd", Locale.ENGLISH);
		DateTimeFormatter formatterM = DateTimeFormatter.ofPattern("MMMM, yyyy", Locale.ENGLISH);
		
		String dateString = today.format(formatterE) + ", the " + today.format(formatterD) + " of " + today.format(formatterM);
		viewModel.addAttribute("date", dateString);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model viewModel) {
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);
		
		String timeString = today.format(formatter);
		viewModel.addAttribute("time", timeString);
		
		return "time.jsp";
	}
}
