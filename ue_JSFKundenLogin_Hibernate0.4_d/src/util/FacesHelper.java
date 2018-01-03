package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesHelper {
	
	public static void setInfoMessage(String htmlId, String msg){
		
		FacesMessage message = new FacesMessage(msg);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(htmlId, message);
	}
	
	public static void setErrorMessage(String htmlId, String msg){
		
		FacesMessage message = new FacesMessage(msg);
		message.setSeverity(FacesMessage.SEVERITY_ERROR);
		FacesContext.getCurrentInstance().addMessage(htmlId, message);
	}

}
