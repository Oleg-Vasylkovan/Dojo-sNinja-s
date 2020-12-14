package com.example.dojosAndNinjas.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dojosAndNinjas.Services.DojoService;
import com.example.dojosAndNinjas.models.Dojo;

@Controller
public class DojoController {
	private final DojoService dojoService;
	public DojoController(DojoService dojoService) {
		this.dojoService=dojoService;
	}
	@RequestMapping("/dojos/new")
	public String index(@ModelAttribute("dojo")Dojo dojo) {
		return "createDojo.jsp";
	}
	@PostMapping("/dojos")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "createDojo.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/allDojos";
		}
	}
	@RequestMapping("/allDojos")
	public String showAllDojos(Model model) {
		List<Dojo>dojo=dojoService.allDojo();
		model.addAttribute("dojos", dojo);
		return "allDojos.jsp";
		
	}
	
}
