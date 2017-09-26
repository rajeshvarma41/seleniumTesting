//This was testng class created to test saluteMessage(business logic) in the Message Class
//Next step is we are adding this test to a suite and then run the suite.
//In TestNG, we cannot define a suite in testing source code, but it is represented by one XML file i.e testng.xml
//In eclipse the process of creating testng.xml is rightclick on project->TestNG->Convert to TestNG
package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSaluteMsg {
	
	Message msg2=new Message();
	
  @Test
  public void testSaluteMessage() {
	  
	  msg2.setMessage("John is prince");
	  String expecMsg="Hi"+msg2.getMessage();
	  Assert.assertEquals(expecMsg, msg2.saluteMessage());
  }
}
