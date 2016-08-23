package nl.programIt.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="findUsernamePassword",
			query="select e from Entreprises e where e.email=:user and e.password=:pwd")
public class Entreprises {
	private Long idEntreprise;
	private String name;
	private String type;
	private Long taille;
	private double turnover;
	private String address;
	private String role;//??
	private String description;
	private String log;
	private String password;
	private String email;
	private Domains domain;
	private Collection<Appointments> appointements;
	private Collection<Contacts> contacts;
	
	//Enteties
	//gettes en setters
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Long idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getTaille() {
		return taille;
	}
	public void setTaille(Long taille) {
		this.taille = taille;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//1->1   @OneToOne
	//1->*   @OneToMany
	//*->1   @ManyToOne
	//*->*   @ManyToMany
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDomain")
	public Domains getDomain() {
		return domain;
	}
	public void setDomain(Domains domain) {
		this.domain = domain;
	}
	
	@OneToMany(mappedBy="entreprise")	
	public Collection<Appointments> getAppointements() {
		return appointements;
	}
	public void setAppointements(Collection<Appointments> appointements) {
		this.appointements = appointements;
	}
	@OneToMany(mappedBy="entreprise")
	public Collection<Contacts> getContacts() {
		return contacts;
	}
	public void setContacts(Collection<Contacts> contacts) {
		this.contacts = contacts;
	}
	public Entreprises() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
