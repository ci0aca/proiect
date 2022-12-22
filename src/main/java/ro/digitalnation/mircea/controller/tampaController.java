package ro.digitalnation.mircea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tampaController {

	@GetMapping("/tampa")
	public String introducere(Model model) {	
	model.addAttribute("nume", "Punctul de belvedere de pe Tâmpa");
	model.addAttribute("descriere", "Deși nu este un obiectiv turistic, Vârful Tâmpa reprezintă unul dintre cele mai frumoase locuri de vizitat din Brașov datorită platformei de belvedere care oferă o priveliște spectaculoasă asupra Brașovului. Aceasta este situată lângă semnul BRAȘOV vizibil din oraș.\r\n"
			+ "\r\n"
			+ "Pentru a ajunge aici, poți merge pe jos sau poți lua telecabina. La o distanță de doar 10 minute de acesta, se află Vârful Tâmpa, cu o altitudine de 960 m.");
	return "tampa";
	}
}
