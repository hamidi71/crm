package nl.programIt.repository;

import nl.programIt.entities.Entreprises;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntrepriseRepository extends JpaRepository<Entreprises, Long>{

	public Entreprises findByEmailAndPassword(String email,String password);
}
