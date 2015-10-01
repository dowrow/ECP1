package es.upm.miw.ecp1.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import es.upm.miw.ecp1.C21;

public class C21Test {
	private C21 c21;
	
	@Before
	public void before () {
		c21 = new C21();
	}
	
	@Test
	public void m1 () {
		Assert.assertEquals(c21.m1(), "m1");
	}

	@Test
	public void m2 () {
		Assert.assertEquals(c21.m2(), "m2");
	}
}
