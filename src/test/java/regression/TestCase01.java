package regression;

import org.testng.annotations.Test;

public class TestCase01 
{

	@Test(groups="smoke")
	public void test01()
	{
		System.out.println("PACKAGE-> regression CLASS--> TestCase01 METHOD--> test01 GROUPS--> smoke");
	}

	@Test(groups="smoke")
	public void test02()
	{
		System.out.println("PACKAGE-> regression CLASS--> TestCase02 METHOD--> test02 GROUPS--> smoke");
	}

	@Test(groups="regression")
	public void test03()
	{
		System.out.println("PACKAGE-> regression CLASS--> TestCase01 METHOD--> test03 GROUPS--> regression");
	}

	
	
}
