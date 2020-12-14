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
import com.example.dojosAndNinjas.Services.NinjaService;
import com.example.dojosAndNinjas.models.Dojo;
import com.example.dojosAndNinjas.models.Ninja;

@Controller
public class NinjaController {
	public final NinjaService ninjaService;
	public final DojoService dojoService;
	public NinjaController(NinjaService ninjaService, DojoService dojoService){
		this.ninjaService=ninjaService;
		this.dojoService=dojoService;
	}
	@RequestMapping("/ninja")
	public String ninja(@ModelAttribute("ninja")Ninja ninja, Model model) {
		List<Dojo>dojo=dojoService.allDojo();
		model.addAttribute("dojo", dojo);
		return "createNinja.jsp";
	}
	@PostMapping("/ninjas")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/ninjas";
		}else {
			ninjaService.createNinja(ninja);
			return "redirect:/allninjas";			
		}
	}
	@RequestMapping("/allninjas")
	public String showAllNinjas(Model model) {
		List<Ninja>ninja=ninjaService.allNinja();
		model.addAttribute("ninjas",ninja);
		return "allNinjas.jsp";
	}
	
}
