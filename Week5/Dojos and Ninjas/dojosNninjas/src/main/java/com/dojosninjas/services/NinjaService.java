package com.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojosninjas.models.Ninja;
import com.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {



	private final NinjaRepository ninjaRepo;

	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
	public void deleteNinjas(List<Ninja> ninjas) {
		ninjaRepo.deleteAll(ninjas);
	}

	public Ninja findById(Long id) {
		Optional<Ninja> n = ninjaRepo.findById(id);
		return n.isPresent()?n.get():null;
	}
}
