package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Util {
	
	public static void sendMessage(String msg){
		FacesMessage facesMessage = new FacesMessage(msg);
	    FacesContext.getCurrentInstance().addMessage(null,  facesMessage);
	}

}
