package util;

import javax.faces.context.FacesContext;

public class FacesHelper {
	
	
	/**
	 *nur f�r ManagedBeans
	 *findet ManagedBean nach namen (z.B. kundeBean) und gibt diese zur�ck
	 */
	@SuppressWarnings("unchecked")
	public static <T> T findBean(String beanName) {
	    FacesContext context = FacesContext.getCurrentInstance();
	    return (T) context.getApplication().evaluateExpressionGet(context, "#{" + beanName + "}", Object.class);
	}
	
	
	
	/**
	 * 
	 * @param key - Schl�ssel um ein Objekt eindeutig zu speichern
	 * @param obj - beliebiges Objekt global speichern
	 */
	public static void saveGlobalObject(String key, Object obj){
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put(key, obj);
	}
	
	
	/**
	 * l�d Object nach Schl�ssel aus einem "Flash"-Speicher
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
