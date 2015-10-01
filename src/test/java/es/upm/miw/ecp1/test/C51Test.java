package es.upm.miw.ecp1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import es.upm.miw.ecp1.C51;

public class C51Test {
	private C51 c51;
	
	@Before
	public void before () {
		c51 = new C51();
	}
	
	@Test
	public void m1 () {
		Assert.assertEquals(c51.m1(), "m1");
	}

	@Test
	public void m2 () {
		Assert.assertEquals(c51.m2(), "m2");
	}
}
