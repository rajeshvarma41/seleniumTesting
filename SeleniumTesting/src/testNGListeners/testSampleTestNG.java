//This class is the one we created for demonstrating Listener. Below code is testNG class that has 3 tests and we are making sure test case 2 fails
//We will implement now cutomListener for this failed testcase in the other customListener class

package testNGListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testSampleTestNG {
  //Test Case1	
  @Test
  public void test1() {
	  Assert.assertEquals("A", "B");
  }
  
  //Test Case2
  @Test
  public void test2() {
	  Assert.assertEquals("B", "B");
  }
  
  //Test Case3
  @Test
  public void test3() {
	  Assert.assertEquals("B", "C");
  }
}
