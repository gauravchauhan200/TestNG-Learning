package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase03
{
	@Test
	public void validateTitle()
	{
		String a_title ="gmail";
		String e_title = "flipkart";
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(a_title, e_title);
		softAssert.assertTrue(false, "element not found");
		softAssert.fail("Failing test case intentionally");
		
		softAssert.assertAll();
	}
	
	
	
	
}
