package com.lookify.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lookify.models.Song;
import com.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private final LookifyRepository lookifyRepository;

	public LookifyService(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}
	public List<Song> allSongs() {
		return lookifyRepository.findAll();
	}
	public Song createSong(Song song){
		return lookifyRepository.save(song);
	}
	public List<Song> findByArtist(String artist) {
		return lookifyRepository.findByArtist(artist);
	}
	
	public List<Song> findTopTen(){
		List<Song> orderedSong = lookifyRepository.findByOrderByRatingDesc();
		ArrayList<Song> topTen = new ArrayList<>();
		// get 10 songs, if songs are less than 10, then get all songs.
		int range = Math.min(orderedSong.size(), 10);
		for (int i = 0; i < range; i++) {
			topTen.add(orderedSong.get(i));
		}
		return topTen;
	}
	
	public Song findSong(Long id) {
		Optional<Song> optionalSong = lookifyRepository.findById(id);
		return optionalSong.isPresent()?optionalSong.get():null;
	}
	public Song updateSong(Song song) {
		return lookifyRepository.save(song);
	}
	public void deleteSong(Long id) {
		lookifyRepository.deleteById(id);
	}
	
}
