package nl.programIt.entities;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointments {
	private Long idAppointment;
	private Date date;
	private Time time; 
	private String valid;
	private Entreprises entreprise;
	private Contacts contact;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdAppointment")
	public Long getIdAppointment() {
		return idAppointment;
	}
	public void setIdAppointment(Long idAppointment) {
		this.idAppointment = idAppointment;
	}
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	//@Temporal(TemporalType.TIME)
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}	
	@ManyToOne 
	@JoinColumn(name="idEntreprise")
	public Entreprises getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprises entreprise) {
		this.entreprise = entreprise;
	}
	@ManyToOne
	@JoinColumn(name="idContact")
	public Contacts getContact() {
		return contact;
	}
	public void setContact(Contacts contact) {
		this.contact = contact;
	}
	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}
}