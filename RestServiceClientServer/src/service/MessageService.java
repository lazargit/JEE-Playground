package service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/*
 * 
 * 
GET Listet Ressourcen auf oder holt eine konkrete Ressource.

PUT Aktualisiert eine Ressource.

DELETE Löscht eine Ressource oder eine Sammlung von Ressourcen.

POST Semantik kann variieren, in der Regel aber geht es um das Anlegen einer neuen Ressource.
 */
@Path("message")
public class MessageService {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String message(){
		return "Hallo Restservice";
	}
	
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("user/{usr}")//{usr} wird ersetzt durch otto -message/user/otto
	public String message(@PathParam("usr")String user){
		return user.toUpperCase();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("query")
	public String message(	@QueryParam("usr")String user ,
							@QueryParam("age")int alter){
		if(alter>=18){
			return user +", Sie sind Volljährig!";
		}
		return user +", Sie sind noch nicht Volljährig!" ;
	}
	
	
	@PUT
	@Path( "user/{user}" )
	@Consumes( MediaType.TEXT_PLAIN )//es wird etwas empfangen
	@Produces( MediaType.TEXT_PLAIN )
	public String postMessage( @PathParam("user") String user, String message )
	{
	  return String.format( "%s sendet '%s'%n", user, message );
	}

}
