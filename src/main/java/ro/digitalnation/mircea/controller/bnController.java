package ro.digitalnation.mircea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class bnController {

	
	@GetMapping("/bn")
	public String greeting(Model model) {	
	model.addAttribute("nume", "Biserica Neagra");
	model.addAttribute("descriere", "Cine a fost la Brașov știe că Biserica Neagră este simbolul orașului. Și nu o știe fiindcă i-ar fi spus-o cineva, ci fiindcă atunci când vezi Biserica Neagră înțelegi acest lucru cu inima. Imaginea ei e copleșitoare, ți se întipărește pe retină și îți coboară în suflet pentru totdeauna. Cine nu a fost încă la Brașov va trăi toate aceste stări când va ajunge. Această construcție impozantă și impresionantă este o sursă continuă de inspirație și încântare, încărcătura spirituală dându-i vizitatorului senzația de căldură, de apropiere. "
			+ "Poate din acest motiv oamenii nu se simt mici în preajma ei, ci ocrotiți de ea, cuprinși de ea, inspirați de măreția ei.");
	return "bn";
	}
}
