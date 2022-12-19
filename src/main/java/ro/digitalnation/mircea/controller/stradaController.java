package ro.digitalnation.mircea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class stradaController {
	
	@GetMapping("/strada")
	public String greeting(Model model) {	
	model.addAttribute("nume", "Strada Sforii");
	model.addAttribute("descriere", "Cunoscută drept cea mai îngustă stradă din Europa, Strada Sforii a devenit una dintre cele mai importante locuri de vizitat din Brașov. Cu o vechime de câteva secole, strada a fost folosită drept legătură între Poarta Schei și Str. Cerbului.\r\n"
			+ "\r\n"
			+ "Strada Sforii se întinde pe 80 m, având o lățime cuprinsă între 111 cm și 135 cm.");
	return "strada";
	}

}
