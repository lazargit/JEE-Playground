package model;

import java.io.Serializable;

public class Adresse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4786244255522388986L;
	private String ort;
	private String strasse;
	private String plz;
	
	
	public String getOrt() {
		return ort;
	}

	
	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

}
