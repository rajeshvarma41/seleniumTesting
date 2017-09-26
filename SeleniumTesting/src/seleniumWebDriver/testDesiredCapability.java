//program to understand desired capabilty
//The Desired Capabilities Class helps us to tell the webdriver, which environment we are going to use in our test script.
package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.glass.ui.View.Capability;

public class testDesiredCapability {

	public static void main(String[] args) {
		DesiredCapabilities cap=new DesiredCapabilities(); //creating desired capabilty object
		cap.setJavascriptEnabled(true);
		cap.setCapability(CapabilityType.BROWSER_VERSION, "Mozilla");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(cap); // here we are using capabilities inside the braces
												//this will invoke firefox with javascript enabled
		
	}

}
