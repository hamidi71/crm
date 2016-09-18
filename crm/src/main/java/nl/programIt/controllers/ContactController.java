package nl.programIt.controllers;

import nl.programIt.entities.Contacts;
import nl.programIt.service.interfaces.IContactService;
import nl.programIt.service.interfaces.IEntrepriseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

	@Autowired
	private IContactService contactService;
	@Autowired
	private IEntrepriseService entrepriseService;
	
	@RequestMapping("/contact")
	public String profilContact(Model model){
		if(contactService.findAllContancts().size()==0){
			model.addAttribute("contact",contactService.findContact(1L));
			//return "contactsFolder/addContact";
			return "contactsFolder/profilContact";
		  }
		model.addAttribute("listEntreprise", entrepriseService.entreprises());
		model.addAttribute("contactForm",new Contacts());
		return "contactsFolder/addContact";
		
	}
	@RequestMapping(value="/saveContact", method=RequestMethod.POST)
	public String saveContact(@ModelAttribute("contactForm")Contacts con){
		contactService.addContact(con);		
		return "redirect:/entreprises";
	}
}
