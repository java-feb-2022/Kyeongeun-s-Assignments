package com.login.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.models.LoginUser;
import com.login.models.User;
import com.login.services.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(
			@ModelAttribute("newUser")User user, 
			@ModelAttribute("newLogin")LoginUser loginUser) {
		return "index.jsp";
	}

	//************Register a User***************
	@PostMapping("/registration")
	public String registerUser(
			@Valid @ModelAttribute("newUser")User newUser, 
			BindingResult result, 
			@ModelAttribute("newLogin") LoginUser loginUser,
			HttpSession session) {
		// validate user
		userService.validate(newUser, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		// register user
		userService.registerUser(newUser);
		// session
		session.setAttribute("loggedInUser", newUser);
		
		return "redirect:/books";
	}
	
	//************ Login ***************
	@PostMapping("/login")
	public String loginUser(
			@ModelAttribute("newUser") User newUser, 
			@Valid @ModelAttribute("newLogin") LoginUser loginUser,
			BindingResult result, 
			HttpSession session) {
		// authenticate user
		User user = userService.authenticateUser(loginUser, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		// session
		session.setAttribute("loggedInUser", user);
		
		return "redirect:/books";
	}
	//************ Logout ***************
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}
