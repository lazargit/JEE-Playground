package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean {

	@ManagedProperty(value="#{messageBean}")  // new MessageBean()
	private MessageBean msgBean;
	
	private String name="";

	public MessageBean getMsgBean() {//nicht vergessen!
		return msgBean;
	}

	public void setMsgBean(MessageBean msgBean) {//nicht vergessen!
		this.msgBean = msgBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSayWelcome(){
		return msgBean.getWelcome()+name;
	}
	

}
