package com.example.eval.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numero;
	private String rue;
	private Integer postalCode;
	private String city;
	
	public Adress() {
		super();
	}

	public Adress(Long id, String numero, String rue, Integer postalCode, String city) {
		super();
		this.id = id;
		this.numero = numero;
		this.rue = rue;
		this.postalCode = postalCode;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Adress [id=" + id + ", numero=" + numero + ", rue=" + rue + ", postalCode=" + postalCode + ", city="
				+ city + "]";
	}
}
