package server.db;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Users;

public class UserDummyDB implements UserDAO {

	

	
	public  Users loadUsers(){
		return createUsers();
	}
	
	/**
	 * Daten könnten auch aus einer Datenbank stammen, hier wird dafür ein json-File verwendet.
	 * @return
	 */
	private  Users createUsers(){
		Users users=null;
		try(Reader reader = new InputStreamReader(UserDummyDB.class.getResourceAsStream("/jsonfile/userlist.json"), "UTF-8")){
			Gson gson = new GsonBuilder().create();
			users = gson.fromJson(reader, Users.class);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return users;
	}
	public static void main(String[] args) {
		System.out.println(new UserDummyDB().createUsers());
	}
}
