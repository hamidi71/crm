package nl.programIt.service.impl;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nl.programIt.entities.Avalebilites;
import nl.programIt.repository.IAvalebiliteRepository;
import nl.programIt.service.interfaces.IAvalebiliteService;

@Service
@Transactional //trasaction Jpa
//@org.springframework.transaction.annotation.Transactional
public class AvalebilitieServiceImpl implements IAvalebiliteService {
	
	@Autowired
	private IAvalebiliteRepository avalebileteRepository;
	
	@Override
	public void addAvalebilite(Avalebilites avalebilite) {
		avalebileteRepository.save(avalebilite);
	}

}
