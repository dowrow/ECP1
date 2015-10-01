package es.upm.miw.ecp1.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import es.upm.miw.ecp1.C22;

public class C22Test {
	private C22 c22;
	
	@Before
	public void before () {
		c22 = new C22();
	}
	
	@Test
	public void mA () {
		Assert.assertEquals(c22.mA(), "mA");
	}

}
