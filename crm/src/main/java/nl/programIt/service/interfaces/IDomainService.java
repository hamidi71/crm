package nl.programIt.service.interfaces;

import java.util.List;

import nl.programIt.entities.Domains;

public interface IDomainService {
	public List<Domains> domains();
	public void save(Domains domainSa);
	public void update(Domains domainUp);
	public void delete(Long id);
}
