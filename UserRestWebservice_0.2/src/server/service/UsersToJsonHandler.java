package server.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import server.db.UserDummyDB;

public class UsersToJsonHandler {
	
	
	

	
	/*
	 * Users to JsonS
	 */
	public static String createJsonString(){
		Gson gson = new GsonBuilder().create();
		String jsonString = gson.toJson(new UserDummyDB().loadUsers());
		return jsonString;
	}
	
	
}
