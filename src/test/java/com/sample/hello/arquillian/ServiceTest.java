package com.sample.hello.arquillian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceTest {

	@Test
	public void firstServiceTest() {
		assertEquals("Hello Koray", new Service().greet("Koray"));
	}

}
