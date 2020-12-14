package com.example.dojosAndNinjas.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.dojosAndNinjas.models.Ninja;
import com.example.dojosAndNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository=ninjaRepository;
	}
	//return all Ninjas
	public List<Ninja>allNinja(){
		return ninjaRepository.findAll();
	}
	//create Ninja
	public Ninja createNinja(@Valid Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
}
