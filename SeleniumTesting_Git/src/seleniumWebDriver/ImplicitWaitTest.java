//Program to understand implicit wait
/*This means that we can tell Selenium that we would like it to wait for a certain amount of time before 
throwing an exception that it cannot find the element on the page. 
*/
//It will force web driver to wait until element is appeared on page or defined time whatever is earliest.

package seleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/" ); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //this is implicit wait. e have declared an implicit wait with the time frame of 10 seconds.
		
		String eTitle = "Demo Guru99 Page";
		
		// launch browse and redirect it to the Base URL
		driver.get("http://demo.guru99.com/selenium/guru99home/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		String aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		//close browser
		driver.close();
		

	}

}
