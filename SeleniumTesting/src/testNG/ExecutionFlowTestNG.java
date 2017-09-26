//program to understand the order by which methods are called
/*- Suite (beforeSuite and afterSuite)
  - Test (beforeTest and afterTest)
  - Class (beforeClass and afterClass)
  - method (beforeMethod and afterMethod)
*/
/*Hirearchy is Suite->test->Class->Method*. TestNg.xml gives better idea on how the the hirearchy is. We have created a suite and defined which classes are there in the suite*/
//Important :beforeMethod and afterMethod are executed once for each testcase


package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ExecutionFlowTestNG {
  
	//test case 1
	@Test
  public void testcase1() {
		System.out.println("in test case1");
  }
	//test case 2
	@Test
	  public void testcase2() {
		System.out.println("in test case2");
	  }
	
	//test case 3
		@Test
		  public void testcase3() {
			System.out.println("in test case3");
		  }
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("in after method");
  }
  
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("in before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("in after suite");
  }

}
