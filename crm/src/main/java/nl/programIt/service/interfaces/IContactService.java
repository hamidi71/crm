package nl.programIt.service.interfaces;

import java.util.List;

import nl.programIt.entities.Contacts;

public interface IContactService {
	//pour voir le profiel de contact
	public Contacts findContact(Long id);
	public Contacts findContactByUsernamePassword(String username,String password);
	public void addContact(Contacts contact);
	public List<Contacts> findAllContancts();
}
