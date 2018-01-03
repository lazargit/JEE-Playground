package beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import client.ServiceClient;
import model.Users;

@ManagedBean
public class UserBean {

	
	private Users users = new Users();
	
	
	@PostConstruct
	public void init(){
		
		setUsers(ServiceClient.createUsers());
		
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}
}
