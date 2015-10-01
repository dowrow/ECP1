package es.upm.miw.ecp1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.upm.miw.ecp1.C31;

public class C31Test {
	private C31 c31;
	
	@Before
	public void before () {
		c31 = new C31();
	}
	
	@Test
	public void m1() {
		Assert.assertEquals(c31.m1(), "m1");
	}
	
	@Test
	public void m2() {
		Assert.assertEquals(c31.m2(), "m2");
	}
	
	@Test
	public void mB() {
		Assert.assertEquals(c31.mB(), "mB");
	}

}
