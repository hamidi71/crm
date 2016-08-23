package nl.programIt.service.interfaces;

import java.util.List;

import nl.programIt.entities.Entreprises;

public interface IEntrepriseService {
 public List<Entreprises> entreprises();
 public Entreprises findEntreprise(Long id);
 public Entreprises findEntrepriseByUsernamPassword(String name,String password);
 public void addEntreprise(Entreprises entreprise);
 
}
