package com.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lookify.models.Song;
import com.lookify.services.LookifyService;

@Controller
public class LookifyController {
	private final LookifyService lookifyService;

	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = lookifyService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@GetMapping("/songs/new")
	public String add(Model model) {
		model.addAttribute("song", new Song());
		return "new.jsp";
	}
	@PostMapping("/songs/create")
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		} else {
			lookifyService.createSong(song);
			return "redirect:/dashboard";
		}
	}
}
