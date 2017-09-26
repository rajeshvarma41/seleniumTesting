//Program to understand simple example for TestNG.
//Note: We dont need an main method for execution
//Here in run as we have 'testNg' as option because we have annotations.
//We will see results below in the tab
//Automatically folder "test-output" is created here

/*Important points: Writing a test in TestNG basically involves the following steps:
 -- Write the business logic of your test and insert TestNG annotations in your code.
 --Add the information about your test (e.g. the class name, the groups you wish to run, etc.) in a testng.xml file or in build.xml.
 ( eclipse does it automatically for single test.Lookuin test-output->index.html->xmlversion
  For running mutliple tests , running mutliple suites we need to create testng.xml file)
 --Run TestNG.
 */


package testNG;

import org.testng.annotations.Test;

public class SampleTestNG {
  @Test          //This annotation defines that this is a test
  public void SampleMethod() {
	  
	System.out.println("Sample testNG");  
  }
}
