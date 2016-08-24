package nl.programIt.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.programIt.entities.Domains;
import nl.programIt.repository.IDomainRepository;
import nl.programIt.service.interfaces.IDomainService;

@Service
@Transactional //trasaction Jpa
//@org.springframework.transaction.annotation.Transactional
public class DomainServiceImpl implements IDomainService {
	@Autowired
	private IDomainRepository domain;
	
	@Override
	public List<Domains> domains() {
		
		return domain.findAll();
	}

	@Override
	public void save(Domains domainSa) {
		
		domain.save(domainSa);
	}

	@Override
	public void update(Domains domainUp) {
		domain.saveAndFlush(domainUp);
		
	}

	@Override
	public void delete(Long id) {
		domain.delete(id);
		
	}

	@Override
	public Domains findOne(Long id) {
		Domains d=domain.findOne(id);
		return d;
	}
}
