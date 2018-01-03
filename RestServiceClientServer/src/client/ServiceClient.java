package client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;


/*
 * Jersey Client
 */
public class ServiceClient {
	
	public static void test1(){
		WebResource ws = Client.create().resource("http://localhost:8081/rest");
		System.out.println(ws.path("message").
				accept(MediaType.TEXT_PLAIN).get(String.class));
	}
	
	public static void test2(){
		WebResource ws2 = Client.create().resource("http://localhost:8081/rest");
		Builder builder = ws2.path("message/user/otto").accept(MediaType.TEXT_PLAIN);
		//Pfad ->  http://localhost:8081/rest/message/user/otto	
		System.out.println(builder.get(String.class));//get-Methode
	}

	
	public static void test3(){
		WebResource ws2 = Client.create().resource("http://localhost:8081/rest");
		Builder builder = ws2.path("message/query").queryParam("usr", "otto").queryParam("age", "17").accept(MediaType.TEXT_PLAIN);
		//Pfad ->  http://localhost:8081/rest/message/query?usr=otto&age=17	
		System.out.println(builder.get(String.class));
	}

	
	
	//put
	public static void test4(){
		
		Client create = Client.create();
		WebResource service = create.resource( "http://localhost:8081/rest" );
		Builder builder = service.path( "message" ).path( "user" ).path( "Inge" )
		                           .type( MediaType.TEXT_PLAIN );
		System.out.println(builder.put( String.class, "Hallo, schönes Wetter heute.... " ) );
	}
	public static void main(String[] args) {
		
		
		test4();
	

	}

}
