package com.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private Object message;

	public HelloWorldBean(Object message) {
		this.message = message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public Object getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
