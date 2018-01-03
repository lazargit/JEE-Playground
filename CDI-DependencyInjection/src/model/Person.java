package model;

import java.io.Serializable;

import javax.inject.Inject;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1866268691940897166L;
	private String vorname;
	private String nachname;
	
	
	@Inject
	private Adresse adresse;
	
	

	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
