package client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import model.Users;

public class ServiceClient {

	public static Users createUsers() {
		WebResource ws = Client.create().resource("http://localhost:1234/userservice");
		String json =ws.path("users").accept(MediaType.APPLICATION_JSON).get(String.class);
		return JsonToUsersHandler.createJsonString(json);
	}

	public static void main(String[] args) {
		System.out.println("ServiceClient.main: "+createUsers());
	}
}
