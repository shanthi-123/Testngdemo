package testngDemo2;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"Regression"})
  public void methodA() {
	  System.out.println("print method A");
  }
	@Test(groups= {"sanity"})
	  public void methodB() {
		  System.out.println("print method B");
	  }
	@Test(groups= {"sanity"})
	  public void methodC() {
		  System.out.println("print method C");
	  }
	@Test(groups= {"sanity"})
	  public void methodD() {
		  System.out.println("print method D");
	  }
	@Test(groups= {"smoke"})
	  public void methodE() {
		  System.out.println("print method E");
	  }
}
