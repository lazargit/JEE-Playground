package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="user")
public class User implements Serializable{
	
	private int id;
	private String vorname;
	private String nachname;
	private String username;
	private String passwort;
	

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public User(String vorname, String nachname, String username, String passwort) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.username = username;
		this.passwort = passwort;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)// autoincrement
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPasswort() {
		return passwort;
	}
	
	public void setPasswort(String passwort) {
		this.passwort = passwort;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + "]";
	}
	
	
	
	

}
