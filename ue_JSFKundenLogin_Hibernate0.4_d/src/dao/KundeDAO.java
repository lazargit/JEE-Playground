package dao;

import model.Kunde;

public interface KundeDAO {

	
	Kunde findKunde(String usr, String pwd);


	boolean storeNewKunde(Kunde newKunde);

}