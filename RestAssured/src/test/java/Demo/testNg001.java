package Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class testNg001 {

	@BeforeTest
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
	
	@AfterTest
	public void at() {
		System.out.println("After");
	}
}
