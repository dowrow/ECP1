package es.upm.miw.ecp1.test;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.ecp1.C11;
import junit.framework.Assert;

public class C11Test {
	private C11 c11;
	
	@Before
	public void before () {
		c11 = new C11();
	}
	
	@Test
	public void m1 () {
		Assert.assertEquals(c11.m1(),"m1");
	}

	@Test
	public void m2 () {
		Assert.assertEquals(c11.m2(),"m2");
	}
}
