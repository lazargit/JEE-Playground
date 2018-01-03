package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean
public class AutocompleteBean {

	private List<String> namen = Arrays.asList("Berta","Benny","Anton","Alf","Otto","Erna","Erwin","Oscar");
	
	
	private String auswahl;


	public String getAuswahl() {
		return auswahl;
	}


	public void setAuswahl(String auswahl) {
		this.auswahl = auswahl;
	}
	
	public List<String> loadList(String query){
		System.out.println(query);
		List<String> resultlist = new ArrayList<>();
		for (String name : namen) {
			if(name.toLowerCase().startsWith(query.toLowerCase())){
				resultlist.add(name);
			}
		}
		return resultlist;
	}
	
	public void select(SelectEvent e){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e+""));
	}
	
}
