package com.kc.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kc.fruityloops.models.Item;

@Controller
public class FruitController {

	@RequestMapping("/")
	public String index(Model viewModel) {
		ArrayList<Item> fruits = new ArrayList<>();
		
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Guava", .75));
		fruits.add(new Item("Cherry", 3.0));
		viewModel.addAttribute("fruitList", fruits);
		return "index.jsp";
	}
}
