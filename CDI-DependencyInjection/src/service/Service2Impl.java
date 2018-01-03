package service;

import java.io.Serializable;

import util.Util;

public class Service2Impl  implements Serializable,Service{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1830199954643205326L;

	/**
	 * 
	 */

	
	
	public void go() {
		System.out.println("go2.....");		
		Util.sendMessage("call: " + getClass().getSimpleName());
	}

}
