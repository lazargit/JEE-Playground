package dao;

import model.Kunde;

public class KundeDAO {

	/*
	 * TODO Dummy
	 */
	public Kunde findKunde(String usr, String pwd){
		
		
		return new Kunde(2, "Max", "Meier", "meier@rer.de", "max", "1234");
	}
	
	/*
	 * TODO Dummy
	 */
	public boolean storeNewKunde(Kunde newKunde){
		//speichert Kundendaten
		
		return true;
	}
	public static void main(String[] args) {
		KundeDAO dao = new KundeDAO();
		System.out.println(dao.findKunde("Max", "123"));;

	}

}
