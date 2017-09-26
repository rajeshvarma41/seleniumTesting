//Program to understand parameterization -- here we are passing parameters from testng1.xml file

/*TestNG lets you pass parameters directly to your test methods in two different ways:
With testng.xml
With Data Providers
*/
//We need to run this test from testng1.xml.Rightclick >RunAs
package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {
	
	@Test
	 @Parameters("myName")
	public void parameterTest(String myName) {
		System.out.println("parameterised value is " +myName);
		
	}

}
