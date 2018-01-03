package beans;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

import model.Person;
@ManagedBean
public class PersonBean {
	
	private List<Person> personenlist = Arrays.asList(
			new Person("Max", "Meier", "fdfd@wee.de"),
			new Person("Marta", "Meier", "fdfd@wee.de")
			);

	public List<Person> getPersonenlist() {
		return personenlist;
	}

	
	// not used
	public void setPersonenlist(List<Person> personenlist) {
		this.personenlist = personenlist;
	}
	
	

}
