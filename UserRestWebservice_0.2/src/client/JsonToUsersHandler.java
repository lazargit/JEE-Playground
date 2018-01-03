package client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Users;

public class JsonToUsersHandler {

	
	/*
	 * Users to JsonS
	 */
	public static Users createJsonString(String json){
		Gson gson = new GsonBuilder().create();
		
		Users users = gson.fromJson(json, Users.class);
		return users;
	}
	
	
}
