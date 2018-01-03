package geoservice;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class GeoLoader {
	public static final String API_KEY ="AIzaSyAmsa9elUE6A0SobuxfO62ILXkEiTYer04";
	

	
	//jersey
	
	public static String createJson(String location){
		
		
		WebResource wr  = Client.create().resource("https://maps.googleapis.com/maps/api/geocode/json");
		Builder b = wr.queryParam("address", location).queryParam("key", API_KEY).accept(MediaType.APPLICATION_JSON);
		
		
		return b.get(String.class);
	}
	
	
	public static void main(String[] args) {
		System.out.println(createJson("Berlin"));
	}
	
}
