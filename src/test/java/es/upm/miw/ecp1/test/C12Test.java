package es.upm.miw.ecp1.test;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.ecp1.C11;
import es.upm.miw.ecp1.C12;
import junit.framework.Assert;

public class C12Test {
	private C12 c12;
	
	@Before
	public void before () {
		c12 = new C12();
	}
	
	@Test
	public void mA () {
		Assert.assertEquals(c12.mA(),"mA");
	}

}
