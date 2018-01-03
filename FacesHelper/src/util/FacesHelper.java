package util;

import javax.faces.context.FacesContext;

public class FacesHelper {
	
	
	/**
	 *nur für ManagedBeans
	 *findet ManagedBean nach namen (z.B. kundeBean) und gibt diese zurück
	 */
	@SuppressWarnings("unchecked")
	public static <T> T findBean(String beanName) {
	    FacesContext context = FacesContext.getCurrentInstance();
	    return (T) context.getApplication().evaluateExpressionGet(context, "#{" + beanName + "}", Object.class);
	}
	
	
	
	/**
	 * 
	 * @param key - Schlüssel um ein Objekt eindeutig zu speichern
	 * @param obj - beliebiges Objekt global speichern
	 */
	public static void saveGlobalObject(String key, Object obj){
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put(key, obj);
	}
	
	
	/**
	 * läd Object nach Schlüssel aus einem "Flash"-Speicher
	 * @param key
	 * @return Object
	 */
	public static Object loadGlobalObject(String key){
		return FacesContext.getCurrentInstance().getExternalContext().getFlash().get(key);
	}
	static void  test(){
		
		findBean("MyBean");
		
	}

}
