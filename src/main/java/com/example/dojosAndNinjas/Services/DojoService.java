package com.example.dojosAndNinjas.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.dojosAndNinjas.models.Dojo;
import com.example.dojosAndNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	public final DojoRepository dojoRepository;
	public DojoService(DojoRepository dojoRepository){
		this.dojoRepository=dojoRepository;
	}
	//return all Dojos
	public List<Dojo>allDojo(){
		return dojoRepository.findAll();
	}
	//create a new Dojo
	public Dojo createDojo(@Valid Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
}
