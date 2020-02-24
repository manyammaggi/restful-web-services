package com.in28minutes.rest.webservices.restfulwebservices;

public class helloworldbean {

	private String message;

	public helloworldbean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "helloworldbean [message=" + message + "]";
	}
	
	
}
