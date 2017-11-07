package com.sample.hello.arquillian;

import javax.ejb.Stateless;

@Stateless
public class Service {

	public String greet(final String name) {
		return "Hello " + name;
	}

}
