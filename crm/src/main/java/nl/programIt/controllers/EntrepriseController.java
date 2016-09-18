package nl.programIt.controllers;

import nl.programIt.entities.Entreprises;
import nl.programIt.service.interfaces.IDomainService;
import nl.programIt.service.interfaces.IEntrepriseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EntrepriseController {
	
	@Autowired
	private IEntrepriseService service;
	@Autowired
	private IDomainService domainServise;
	
	@RequestMapping("/entreprises")
	public String lisEntreprises(Model model){
	 	model.addAttribute("listEntreprises", service.entreprises());
	 	return "entreprisesFolder/list-entreprise";
	
	}
	@RequestMapping("/bedrijvenlijst.fes")
	public String bedrijflijsten(Model model){
		//bedrijfLijst zit folder bedrijvenlist.jsp
		model.addAttribute("bedrijflijst", service.entreprises());		
		return "entreprisesFolder/bedrijvenLijst";		
	}	
	
	@RequestMapping("/add-en")
	public String addEntrepise(Model model){
		model.addAttribute("entreprise", new Entreprises());
		model.addAttribute("listDomain",domainServise.domains());
		return "entreprisesFolder/addEntreprise";
		//entreprise is objet in de vue
	}
	@RequestMapping(value="/save-en",method=RequestMethod.POST)
	public String saveEntreprise(@ModelAttribute("entreprise") Entreprises e,Model model){
		service.addEntreprise(e);
		return "redirect:/entreprises";		
		//model.addAttribute("listEntreprises", service.entreprises());	 	
		//return "entreprisesFolder/list-entreprise";
		
	}
	/*@RequestMapping("/profil-en")
	public String profil(@RequestParam("idList") Long idp,Model model){		
		model.addAttribute("entrepriseProfilThymeleaf", service.findEntreprise(idp));
		return "entreprisesFolder/profil-entreprise";
	} */
	@RequestMapping("/profil-en/{idList}")
	public String profil(@PathVariable Long idList ,Model model){		
		model.addAttribute("entrepriseProfilThymeleaf", service.findEntreprise(idList));
		return "entreprisesFolder/profil-entreprise";
	}
}
