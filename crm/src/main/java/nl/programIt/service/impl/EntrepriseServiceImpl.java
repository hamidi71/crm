package nl.programIt.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.programIt.entities.Entreprises;
import nl.programIt.repository.IEntrepriseRepository;
import nl.programIt.service.interfaces.IEntrepriseService;

@Service
@Transactional //trasaction Jpa
//@org.springframework.transaction.annotation.Transactional
public class EntrepriseServiceImpl implements IEntrepriseService {
	
	@Autowired
	private IEntrepriseRepository entrepriseRepositorty;
	
	@Override
	public List<Entreprises> entreprises() {
		
		return entrepriseRepositorty.findAll();
	}

	@Override
	public Entreprises findEntreprise(Long id) {
		
		return entrepriseRepositorty.findOne(id);
	}

	@Override
	public Entreprises findEntrepriseByUsernamPassword(String name,
			String password) {
		
		return entrepriseRepositorty.findByEmailAndPassword(name, password);
	}

	@Override
	public void addEntreprise(Entreprises entreprise) {
		entrepriseRepositorty.save(entreprise);
		
	}

}
