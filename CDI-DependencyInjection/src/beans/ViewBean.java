package beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Person;
import service.Service;
import service.ServiceType;
import service.ServiceType.MyType;
@Named
@SessionScoped
public class ViewBean implements Serializable{
	
	@Inject
	private Person person;
	@Inject @ServiceType(MyType.MyService1)
	private Service service;
	
	

	private static final long serialVersionUID = 7702600792056270372L;

	private String message;
	


	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void serviceExecute(){
		service.go();
	}
	
	
	
}
