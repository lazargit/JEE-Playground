package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kunde {
	@Override
	public String toString() {
		return "Kunde [kundenNummer=" + kundenNummer + ", vorname=" + vorname + ", nachname=" + nachname + ", email="
				+ email + ", username=" + username + ", passwort=" + passwort + "]";
	}
	public static final int NEU_KUNDE =2;
	public static final int BESTANDS_KUNDE =1;
	public static final int NO_KUNDE =-1;
	
	
	private int kundenNummer =-1;
	private String vorname;
	private String nachname;
	private String email;
	private String username;
	private String passwort;
	
	
	
	
	public Kunde(String vorname, String nachname, String email, String username, String passwort) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.username = username;
		this.passwort = passwort;
	}
	public Kunde(int kundenNummer, String vorname, String nachname, String email, String username, String passwort) {
		super();
		this.kundenNummer = kundenNummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.username = username;
		this.passwort = passwort;
	}
	public Kunde(){}
	
	@Id
	@GeneratedValue
	@Column(name="id")// Tabellenfield -> id
	public int getKundenNummer() {
		return kundenNummer;
	}
	public void setKundenNummer(int kundenNummer) {
		this.kundenNummer = kundenNummer;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="passwort")
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

}
