package nl.programIt.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.programIt.entities.Contacts;
import nl.programIt.repository.IContactRepository;
import nl.programIt.service.interfaces.IContactService;

@Service//wordt gedeclareerd als een spring object
@Transactional //trasaction Jpa
//@org.springframework.transaction.annotation.Transactional
public class ContactServiceImpl implements IContactService {
	
	@Autowired
	private IContactRepository contactRepository;
	
	@Override
	public Contacts findContact(Long id) {
		Contacts c= contactRepository.findOne(id);
		return c;
	}

	@Override
	public Contacts findContactByUsernamePassword(String username,
			String password) {
		Contacts c = contactRepository.findByEmailAndPassword(username, password);
		return  c;
	}

	@Override
	public void addContact(Contacts contact) {
		contactRepository.save(contact);

	}

	@Override
	public List<Contacts> findAllContancts() {			
		return contactRepository.findAll();
	}

}
