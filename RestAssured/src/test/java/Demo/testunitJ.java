package Demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class testunitJ {
	@Before
	public void bt() {
		String Expected ="Shubham";
		String Actual = "Verma";
		
		Assert.assertEquals(Expected, Actual);
	}
	
	@Test
	public void testcase1() {
		System.out.println("testcase1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("testcase2");
	}
	
	@After
	public void at() {
		System.out.println("After");
	}
}
