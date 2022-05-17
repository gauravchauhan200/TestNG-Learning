package regression;

import org.testng.annotations.Test;

public class TestCase02 
{
	@Test(groups={"smoke","regression"})
	public void reg()
	{
		System.out.println("PACKAGE-> regression CLASS--> TestCase02 METHOD--> reg GROUPS--> smoke,regression");
	}
	
	@Test(groups= {"smoke"})
	public void login()
	{
		System.out.println("PACKAGE-> regression CLASS--> TestCase02 METHOD--> login GROUPS--> smoke");
	}
	@Test
	public void logout()
	{
		System.out.println("PACKAGE-> regression CLASS--> TestCase02 METHOD--> logout GROUPS--> smoke,regression");
	}
	
	
}
