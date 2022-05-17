package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase01
{
	
	@Test(groups={"smoke","Regression"})
	public void doUserReg()
	{
		System.out.println("PACKAGE-> testcases CLASS--> TestCase01 METHOD--> doUserReg GROUPS--> smoke,regression");
		System.out.println("checking git");
	}	
	
	@Test(groups="regression")
	public void doLogin()
	{
		System.out.println("PACKAGE-> testcases CLASS--> TestCase01 METHOD--> doLogin GROUPS--> regression");	
	}

	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("PACKAGE-> testcases CLASS--> TestCase01 METHOD--> launchBrowser ");
	}
	
	@AfterMethod
	public void closingBrowser ()
	{
		System.out.println("PACKAGE-> testcases CLASS--> TestCase01 METHOD-->closingBrowser ");
	}

	@BeforeTest
	public void openDBConn()
	{
		System.out.println("PACKAGE-> testcases CLASS--> TestCase01 METHOD--> openDBConn" );
	}
	
	@AfterTest
	public void closeDBConn()
	{
		System.out.println("PACKAGE-> testcases CLASS--> TestCase01 METHOD--> closeDBConn");
	}
	
}
