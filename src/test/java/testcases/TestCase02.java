package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase02 
{

	@Test(groups="smoke")
	public void validateTitle()
	{
		System.out.println("PACKAGE-> testcases CLASS--> TestCase02 METHOD--> validateTitle GROUPS--> smoke");
		String a_title ="gmail";
		String e_title = "flipkart";
		
		Assert.assertEquals(a_title, e_title);
	//	isElementPresent("xpath");
		Assert.assertTrue(true, "element not found");
		
	}
	

}
