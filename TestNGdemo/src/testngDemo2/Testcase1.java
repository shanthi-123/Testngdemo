package testngDemo2;

import org.testng.annotations.Test;

public class Testcase1 {
	@Test
	public void methodC()
	{
		System.out.println("print methodA");
	}
	@Test
	public void methodB()
	{
		System.out.println("print methodB");
	}
	@Test
	(enabled=false)
	public void methodA()
	{
		System.out.println("print methodC");
	}

}
