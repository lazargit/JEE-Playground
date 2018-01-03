package service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;

import service.ServiceType.MyType;
@SessionScoped
public class ServiceFactory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2619745598213262081L;

	@Produces
	@ServiceType(MyType.MyService1)
	public Service createService1(@New Service1Impl impl1){
		return impl1;
	}
	@Produces
	@ServiceType(MyType.MyService2)
	public Service createService1(@New Service2Impl impl2){
		return impl2;
	}
}
