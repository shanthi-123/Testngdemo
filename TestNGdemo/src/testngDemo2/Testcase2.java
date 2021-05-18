package testngDemo2;

import org.testng.annotations.Test;

public class Testcase2 {
	@Test
	public void methodC()
	{
		System.out.println("print c");
	}
	@Test
	(enabled=false)
	public void methodD()
	{
		System.out.println("print d");
	}
	@Test
	public void methodE()
	{
		System.out.println("print e");
	}
}
