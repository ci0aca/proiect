package ro.digitalnation.mircea.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import ro.digitalnation.mircea.clase.Utilizator;

@Controller
public class inregistrareController {

	@GetMapping("/register")
	public String showForm(Model model) {
	Utilizator utilizator = new Utilizator();
	model.addAttribute("utilizator", utilizator);
	
	List<String> ocupatieList = Arrays.asList("Student", "Somer", "Angajat");
    model.addAttribute("ocupatieList", ocupatieList);
     
    return "register_form";
	}
	@PostMapping("register")
    public String submitForm(@ModelAttribute("utilizator")Utilizator utilizator) {
    	System.out.println(utilizator);
    	return "register_succes";
    }
}
