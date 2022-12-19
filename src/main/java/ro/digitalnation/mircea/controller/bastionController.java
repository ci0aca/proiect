package ro.digitalnation.mircea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bastionController {

	@GetMapping("/bastion")
	public String greeting(Model model) {	
	model.addAttribute("nume", "Bastionul Fierarilor");
	model.addAttribute("descriere", "Bastionul Fierarilor este una dintre cele mai vechi obiective turistice din Brașov, datând de la începutul anilor 1520. Având forma de pentagon, acest obiectiv turistic este structurat pe trei nivele, fiind inițial utilizat ca depozit de cereale. Începând din 1923, acest obiectiv turistic important găzduiește Arhivele Naționale și documente valoroase precum unul dintre vele mai vechi documente scrise în limba română – o scrisoare a lui Neacșu din Câmpulung care datează din 1521.\r\n"
			+ "\r\n"
			+ "În spatele Bastionului Fierarilor, există un drum care duce către cea mai bine păstrată zonă a zidurilor cetății vechi, fiind cunoscută drept Strada după Ziduri.");
	return "bastion";
	}
}
