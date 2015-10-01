package es.upm.miw.ecp1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import es.upm.miw.ecp1.C52;

public class C52Test {
private C52 c52;
	
	@Before
	public void before () {
		c52 = new C52();
	}
	
	@Test
	public void mA () {
		Assert.assertEquals(c52.mA(), "mA");
	}
}
