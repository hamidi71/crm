package nl.programIt.service.interfaces;

import nl.programIt.entities.Contacts;

public interface IContactService {
	//pour voir le profiel de contact
	public Contacts findContact(Long id);
	public Contacts findContactByUsernamePassword(String username,String password);
	public void addContact(Contacts contact);
}
