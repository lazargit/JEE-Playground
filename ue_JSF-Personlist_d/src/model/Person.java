package model;

public class Person {
	
	private String vorname;
	private String nachname;
	private String email;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String vorname, String nachname, String email) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
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

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", email=" + email + "]";
	}
	
	
	

}
