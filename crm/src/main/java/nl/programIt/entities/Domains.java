package nl.programIt.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="domaines")
public class Domains{ 
	
	private Long idDomain;
	private String name;
	//au cas de bidirectionnel
	private Collection<Entreprises> entreprises;
	
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdDomain() {
		return idDomain;
	}
	public void setIdDomain(Long idDomain) {
		this.idDomain = idDomain;
	}
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(mappedBy="domain")
	public Collection<Entreprises> getEntreprises() {
		return entreprises;
	}
	public void setEntreprises(Collection<Entreprises> entreprises) {
		this.entreprises = entreprises;
	}
	public Domains() {
		super();
	}
}