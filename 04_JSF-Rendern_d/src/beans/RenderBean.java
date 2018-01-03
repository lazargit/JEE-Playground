package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RenderBean {

	
	private int status=1;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
