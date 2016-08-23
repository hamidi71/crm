package nl.programIt.entities;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Avalebilites {
	private Long idAvalebilite;
	private Time intervals;
	private Time fromMonday;
	private Time toMonday;
	private Time fromTuesday;
	private Time toTuesday;
	private Time fromWednesday;
	private Time toWednesday;
	private Time fromThursday;
	private Time toThursday;
	private Time fromFriday;
	private Time toFriday;
	private Time fromSaturday;
	private Time toSaturday;
	private String dayMonday;
	private String dayTuesday;
	private String dayWednesday;
	private String dayThursday;
	private String dayFriday;
	private String daySaturday;
	private Entreprises entreprise;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdAvalebilite() {
		return idAvalebilite;
	}
	public void setIdAvalebilite(Long idAvalebilite) {
		this.idAvalebilite = idAvalebilite;
	}
	//@Temporal(TemporalType.TIME)
	public Time getIntervals() {
		return intervals;
	}
	public void setIntervals(Time intervals) {
		this.intervals = intervals;
	}
	//@Temporal(TemporalType.TIME)
	public Time getFromMonday() {
		return fromMonday;
	}
	public void setFromMonday(Time fromMonday) {
		this.fromMonday = fromMonday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getToMonday() {
		return toMonday;
	}
	public void setToMonday(Time toMonday) {
		this.toMonday = toMonday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getFromTuesday() {
		return fromTuesday;
	}
	public void setFromTuesday(Time fromTuesday) {
		this.fromTuesday = fromTuesday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getToTuesday() {
		return toTuesday;
	}
	public void setToTuesday(Time toTuesday) {
		this.toTuesday = toTuesday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getFromWednesday() {
		return fromWednesday;
	}
	public void setFromWednesday(Time fromWednesday) {
		this.fromWednesday = fromWednesday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getToWednesday() {
		return toWednesday;
	}
	public void setToWednesday(Time toWednesday) {
		this.toWednesday = toWednesday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getFromThursday() {
		return fromThursday;
	}	
	public void setFromThursday(Time fromThursday) {
		this.fromThursday = fromThursday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getToThursday() {
		return toThursday;
	}
	public void setToThursday(Time toThursday) {
		this.toThursday = toThursday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getFromFriday() {
		return fromFriday;
	}
	public void setFromFriday(Time fromFriday) {
		this.fromFriday = fromFriday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getToFriday() {
		return toFriday;
	}
	public void setToFriday(Time toFriday) {
		this.toFriday = toFriday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getFromSaturday() {
		return fromSaturday;
	}
	public void setFromSaturday(Time fromSaturday) {
		this.fromSaturday = fromSaturday;
	}
	//@Temporal(TemporalType.TIME)
	public Time getToSaturday() {
		return toSaturday;
	}
	public void setToSaturday(Time toSaturday) {
		this.toSaturday = toSaturday;
	}
	public String getDayMonday() {
		return dayMonday;
	}
	public void setDayMonday(String dayMonday) {
		this.dayMonday = dayMonday;
	}
	public String getDayTuesday() {
		return dayTuesday;
	}
	public void setDayTuesday(String dayTuesday) {
		this.dayTuesday = dayTuesday;
	}
	public String getDayWednesday() {
		return dayWednesday;
	}
	public void setDayWednesday(String dayWednesday) {
		this.dayWednesday = dayWednesday;
	}
	public String getDayThursday() {
		return dayThursday;
	}
	public void setDayThursday(String dayThursday) {
		this.dayThursday = dayThursday;
	}
	public String getDayFriday() {
		return dayFriday;
	}
	public void setDayFriday(String dayFriday) {
		this.dayFriday = dayFriday;
	}
	public String getDaySaturday() {
		return daySaturday;
	}
	public void setDaySaturday(String daySaturday) {
		this.daySaturday = daySaturday;
	}
	@OneToOne
	@JoinColumn(name="idEntreprise")
	public Entreprises getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprises entreprise) {
		this.entreprise = entreprise;
	}
	public Avalebilites() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
