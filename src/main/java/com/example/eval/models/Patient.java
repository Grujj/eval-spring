package com.example.eval.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String lastname;
	private String firstname;
	private LocalDate birthdate;
	private Long socialSecurityNumber;
	
	@ManyToOne
	@JoinColumn
	private Adress adress;
	
	@ManyToOne
	@JoinColumn
	private Nurse nurse;
	
	public Patient() {
		super();
	}

	public Patient(Long id, String lastname, String firstname, LocalDate birthdate, Long socialSecurityNumber) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthdate = birthdate;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Long getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(Long socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", birthdate=" + birthdate
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}
}
