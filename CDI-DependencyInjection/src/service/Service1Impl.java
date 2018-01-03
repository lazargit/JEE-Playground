package service;

import java.io.Serializable;

import util.Util;

public class Service1Impl implements Serializable, Service {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2313542285091652419L;

	public void go() {
		System.out.println("go1");
		Util.sendMessage("call: " + getClass().getSimpleName());

	}

}
