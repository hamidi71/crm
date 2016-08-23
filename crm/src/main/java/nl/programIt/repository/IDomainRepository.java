package nl.programIt.repository;

import nl.programIt.entities.Domains;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDomainRepository extends JpaRepository<Domains, Long>  {
	
}
