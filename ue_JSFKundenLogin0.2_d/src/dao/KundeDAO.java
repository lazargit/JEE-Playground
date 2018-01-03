package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBConnect;
import model.Kunde;

public class KundeDAO {

	/*
	 * TODO Dummy
	 */
	public Kunde findKunde(String usr, String pwd) {
		try {
			Connection con = DBConnect.getInstance().getConnection();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM kunde WHERE username =? AND passwort=?");
			ps.setString(1, usr);
			ps.setString(2, pwd);
			
			ResultSet rs = ps.executeQuery();
			rs.next();//Moves the cursor forward 
			Kunde  k = new Kunde();
			k.setKundenNummer(rs.getInt("id"));
			k.setVorname(rs.getString("vorname"));
			k.setNachname(rs.getString("nachname"));
			k.setEmail(rs.getString("email"));
			k.setUsername(rs.getString("username"));
			return k;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Kunde();// kundenNUmmer == -1
	}

	/*
	 * TODO Dummy
	 */
	public boolean storeNewKunde(Kunde newKunde) {
		// speichert Kundendaten

		return true;
	}

	public static void main(String[] args) {
		KundeDAO dao = new KundeDAO();
		System.out.println(dao.findKunde("max", "123"));

	}

}
