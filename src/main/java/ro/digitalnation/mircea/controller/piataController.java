package ro.digitalnation.mircea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class piataController {

	@GetMapping("/piata")
	public String introducere(Model model) {	
	model.addAttribute("nume", "Piata Sfatului");
	model.addAttribute("descriere", "De departe cel mai vizitat obiectiv turistic din Brașov, Piața Sfatului se află chiar în centrul orașului. Aici există o zonă pietonală precum și numeroase terase, restaurante și magazine. "
			+ "Dacă ajungi în Brașov, nu trebuie să ratezi o plimbare prin centrul vechi al Brașovului. Deseori, aici se organizează diferite evenimente culturale, artistice, târguri și concerte.");
	return "piata";
	}
}
