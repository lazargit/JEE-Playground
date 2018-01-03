package model;

import java.util.ArrayList;
import java.util.List;

public class Users {
	
	private List<User> userlist = new ArrayList<>();

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	@Override
	public String toString() {
		return "Users [userlist=" + userlist + "]";
	}

	
}
