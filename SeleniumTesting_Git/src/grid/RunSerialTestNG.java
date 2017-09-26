//Program to understand running the test cases serailly on two nodes --In the O/P you can notice that first one browsers is invoked and after execution completed next browser is invoked
//Test cases are run serially using testng4.xml
//Here we are running the test cases from testng4.xml by right click->Run as Test Suite -- in this cases test cases are run serially
//Basically testng is the one that sends tests serially and then hub will send cases to the nodes for execution.
/* First we need to run the hub , then need to run the nodes
   -- Below are configurations to start hub and nodes
   ----Hub command-------- 
java -jar selenium-server-standalone-3.3.1.jar -role hub

  ------setting up node for firefox-----------

java -Dwebdriver.gecko.driver=C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe -jar selenium-server-standalone-3.3.1.jar -port 5557 -role node -hub http://localhost:4444/grid/register -browser "browserName=firefox, maxInstances=3, platform=ANY, seleniumProtocol=WebDriver"


--------setting up node for chrome---------

java -Dwebdriver.chrome.driver=C:\\Users\\rvarma\\Downloads\\chromedriver_win32\\chromedriver.exe -jar selenium-server-standalone-3.3.1.jar -port 5556 -role node -hub http://localhost:4444/grid/register -browser "browserName=chrome, version=ANY, maxInstances=4, platform=WINDOWS" 

 */

package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunSerialTestNG {
  @Parameters("browser") //we are passing parametes from testng4.xml
  @Test
  public void searchtest(String b) throws MalformedURLException { //note here the value of b is coming from the value of "browser"
	  System.out.println("Browser name is "+b);
	  
	  DesiredCapabilities cap = null;
	 
	 //We are setting desired capabilites for the browser that we want to test
	 if(b.equals("firefox")) {  
		 cap=DesiredCapabilities.firefox();
		 cap.setBrowserName("firefox");
		 cap.setPlatform(Platform.ANY);
	 }
	 
	 else if(b.equals("chrome")) {
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome"); 
		cap.setPlatform(Platform.ANY);
	 }
	 
	 //Give URL of the Hub--Here we are giving hub address and capabilities. 
	 //Once the test is given to the hub,it will assign to appropriate node bases on the capability 
	 RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	 driver.get("http://gmail.com");
	 driver.findElement(By.id("identifierId")).sendKeys("username");
	 driver.quit();
  }
  
  
  

}
