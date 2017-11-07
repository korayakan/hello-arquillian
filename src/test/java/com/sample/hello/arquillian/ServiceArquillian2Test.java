package com.sample.hello.arquillian;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;

public class ServiceArquillian2Test extends ArquillianDeployment {

	@Inject
	private Service service;

	@Test
	public void secondServiceTest() {
		assertEquals("Hello Koray", service.greet("Koray"));
	}

}
