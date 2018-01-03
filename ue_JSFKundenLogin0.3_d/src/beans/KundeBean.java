package beans;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.KundeDAO;
import model.Kunde;
import util.FacesHelper;

@ManagedBean
@SessionScoped
public class KundeBean {
	
	private String msg;
	private int kundenstatus=Kunde.NO_KUNDE ;
	private Kunde kunde;
	private KundeDAO dao;
	
	
	@PostConstruct // wird nach dem Konstruktor aufgerufen
	public void init(){
		dao = new KundeDAO();
		kunde = new Kunde();
		
	}
	
	public int getKundenstatus() {
		return kundenstatus;
	}


	public void setKundenstatus(int kundenstatus) {
		this.kundenstatus = kundenstatus;
	}


	public Kunde getKunde() {
		return kunde;
	}



	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public String isKundeValid(){
		kunde = dao.findKunde(kunde.getUsername(), kunde.getPasswort());
		
		if(kunde.getKundenNummer()!=-1){
			
			return "ShowKunde";
			
		}
		FacesHelper.setInfoMessage("msgout", "Username oder Passwort falsch!");
		return "NoKunde";
	}
	public String save(){
		// löst speichern aus
		boolean isSaved = dao.storeNewKunde(kunde);
		if(isSaved){
			setKundenstatus(Kunde.BESTANDS_KUNDE);
			setKunde(new Kunde());
			return "FormKunde";
		}
		
		return "";
		
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String logout(){
		
		setKunde(new Kunde());
		return "FormKunde";
		
	}

}
