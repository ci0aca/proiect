package ro.digitalnation.mircea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import ro.digitalnation.mircea.clase.Home;

@Controller
public class HomeController {

	
	@GetMapping("/home")
	public String greeting(Model model) {	
	model.addAttribute("nume", "Brasov");
	model.addAttribute("descriere", "Orasul Brasov este situat in centrul tarii, inconjurat de Carpatii de Sud, si face parte din regiunea Transilvania. Brasovul este atestat documentar din 1252 sub numele latin Corona sau denumirea germana Kronstadt, care inseamna \"Orasul Coroana\", ambele denumiri fiind oglindite in sigla orasului. Pe Muntele Tampa a existat o cetate numita Brassovia, dand ulterior denumirea romaneasca a orasului. Au fost descoperite urme de asezari din epoca de piatra, dar si urme ale unor cetati Dacice. Orasul a fost fondat de catre Cavalerii Teutonici in 1211 pentru a apara hotarul Regatului Maghiar, si a fost colonizat de catre saxonii din Transilvania, devenind astfel una dintre cele sapte cetati cunoscute drept Siebenburgen. Urme ale colonistilor germani pot fi observate in arhitectura gotica, baroca si renascentista, iar impreuna cu o multitudine de atractii istorice, fac Brasovul unul dintre cele mai vizitate locuri din Romania.Orasul Brasov este situat in centrul tarii, inconjurat de Carpatii de Sud, si face parte din regiunea Transilvania. Brasovul este atestat documentar din 1252 sub numele latin Corona sau denumirea germana Kronstadt, care inseamna \"Orasul Coroana\", ambele denumiri fiind oglindite in sigla orasului. Pe Muntele Tampa a existat o cetate numita Brassovia, dand ulterior denumirea romaneasca a orasului. Au fost descoperite urme de asezari din epoca de piatra, dar si urme ale unor cetati Dacice. Orasul a fost fondat de catre Cavalerii Teutonici in 1211 pentru a apara hotarul Regatului Maghiar, si a fost colonizat de catre saxonii din Transilvania, devenind astfel una dintre cele sapte cetati cunoscute drept Siebenburgen. Urme ale colonistilor germani pot fi observate in arhitectura gotica, baroca si renascentista, iar impreuna cu o multitudine de atractii istorice, fac Brasovul unul dintre cele mai vizitate locuri din Romania.");
	return "index";
	}
	
	
	
}

