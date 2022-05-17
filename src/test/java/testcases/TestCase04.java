package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase04 
{
	
	@Test(priority = 1)
	public void doUserReg()
	{
		System.out.println("User Registration");
		
	}
	
	@Test(priority = 2,dependsOnMethods={"doUserReg","test3"})
	public void doUserLogin()
	{
		System.out.println("User login");
	}
	
	@Test(priority = 2)
	public void test3()
	{
		System.out.println("test no 3");
		Assert.fail();
	}
	
	@Test(priority = 2)
	public void test4()
	{
		System.out.println("test no 4");
	}
	
	
}
