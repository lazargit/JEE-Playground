package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

// default @ManagedBean(name="helloBean")-> Name der Klasse klein
@ManagedBean
@SessionScoped // 
public class HelloBean {
	
	private String name="no name****";
	
	private List<String> freunde = Arrays.asList("Max","Otto","Ina","Elsa");

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFreunde() {
		return freunde;
	}

	public void setFreunde(List<String> freunde) {
		this.freunde = freunde;
	}
	
	
	

}
