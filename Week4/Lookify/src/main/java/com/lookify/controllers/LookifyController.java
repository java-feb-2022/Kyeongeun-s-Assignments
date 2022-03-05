package com.lookify.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("artist", new String());
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
	@PostMapping("/search")
	public String search(@RequestParam("artist")String search, Model model) {
		List<Song> songs = lookifyService.findByArtist(search);
		model.addAttribute("artist", search); //display artist name
		model.addAttribute("songs", songs);
		return "search.jsp";
	}
	
	@GetMapping("/search/topTen")
	public String topTen(Model model) {
		List<Song> tenSongs = lookifyService.findTopTen();
		model.addAttribute("songs", tenSongs);
		return "topten.jsp";
	}
	
	@GetMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Song song = lookifyService.findSong(id);
		model.addAttribute("song", song);
		return "show.jsp";
		
	}
	@DeleteMapping("/songs/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		lookifyService.deleteSong(id);
		return "redirect:/dashboard";
	}
}
