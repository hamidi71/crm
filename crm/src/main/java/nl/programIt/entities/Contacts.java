package nl.programIt.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contacts {
	private Long idContact;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String phone;
	private String image;
	private String  gender;
	private String role;
	private String password;
	private Entreprises entreprise;
	private Collection<Appointments> appointments;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	public Long getIdContact() {
		return idContact;
	}
	public void setIdContact(Long idContact) {
		this.idContact = idContact;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(length=10)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Column(length=1)
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@ManyToOne
	@JoinColumn(name="idEntreprise")
	public Entreprises getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprises entreprise) {
		this.entreprise = entreprise;
	}
	@OneToMany(mappedBy="contact")//zie Appointements private contacts contact
	public Collection<Appointments> getAppointments() {
		return appointments;
	}
	public void setAppointments(Collection<Appointments> appointments) {
		this.appointments = appointments;
	}
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
