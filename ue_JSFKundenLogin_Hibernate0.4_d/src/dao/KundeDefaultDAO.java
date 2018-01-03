package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBConnect;
import model.Kunde;

public class KundeDefaultDAO implements KundeDAO {


	/* (non-Javadoc)
	 * @see dao.KundeDAO#findKunde(java.lang.String, java.lang.String)
	 */
	@Override
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


	/* (non-Javadoc)
	 * @see dao.KundeDAO#storeNewKunde(model.Kunde)
	 */
	@Override
	public boolean storeNewKunde(Kunde newKunde) {
		// speichert Kundendaten
		try {
		Connection con = DBConnect.getInstance().getConnection();

			PreparedStatement ps = con.prepareStatement("INSERT INTO kunde(vorname, nachname,username,passwort, email) VALUES (?,?,?,?,?)");
			ps.setString(1, newKunde.getVorname());
			ps.setString(2, newKunde.getNachname());
			ps.setString(3, newKunde.getUsername());
			ps.setString(4, newKunde.getPasswort());
			ps.setString(5, newKunde.getEmail());
			
			ps.executeUpdate();
			
			
			return ps.getUpdateCount()==1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public static void main(String[] args) {
		KundeDAO dao = new KundeDefaultDAO();
		//System.out.println(dao.findKunde("max", "123"));
		System.out.println(dao.storeNewKunde(new Kunde( "", "", "", "", "")));

	}

}
