//This was testng class created to test printMessage(business logic) in the Message Class
//Next step is we are adding this test to a suite and then run the suite.
//In TestNG, we cannot define a suite in testing source code, but it is represented by one XML file i.e testng.xml
//In eclipse the process of creating testng.xml is rightclick on project->TestNG->Convert to TestNG.By default it gives all the testNg classes listed. You need to tweab based on what you want to define as suite
//To run the suite rightclick->TestNg.xml->Run as Suite
package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMsg {
  @Test
  public void testPrintMessage() {
	  
	  Message msg1=new Message();
	  msg1.setMessage("rajesh varma is king");
	  
	  Assert.assertEquals("rajesh varma is king",msg1.printMessage());
  }
  
  
}
