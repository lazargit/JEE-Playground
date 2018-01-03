package com.example;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class Test {

	public static final String API_KEY = "AIzaSyAmsa9elUE6A0SobuxfO62ILXkEiTYer04";
	public static String createJson() {

		WebResource wr = Client.create().resource("https://maps.googleapis.com/maps/api/geocode/json");

		Builder b = wr.queryParam("address", "Berlin").queryParam("key", API_KEY).accept(MediaType.APPLICATION_JSON);

		return b.get(String.class);

	}
	
	public static void gsonTest(){
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();
		Example ex = gson.fromJson(createJson(), Example.class);
		System.out.println(ex.getResults().get(0).getGeometry().getLocation());
	}


	public static void main(String[] args) {

		gsonTest();
	}

}
