//Program to understand alerts
/*
 * Simple alert -- simple alert displays some information or warning on the screen.
 * Confirmation alert --confirmation alert asks permission to do some type of operation.
 * Prompt alert -- Prompt Alert asks some input from the user and selenium webdriver can enter the text using sendkeys(" input…. ").
 */
package seleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) {
		//Declaration and intiation of driver	
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			// Put an Implicit wait.
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		    //Launching the browser
			driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
			
			//Maximising the browser window
			driver.manage().window().maximize();
			
			// This step will result in an alert on screen
			driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
			
			
			//Switching focus to Alert in same way as we do for chnging focus to other window
			Alert simpleAlert=driver.switchTo().alert();
			//getting the text of the alert
			System.out.println("Alert text is " +simpleAlert.getText() );
			
			//accepting the alert i.e clicking ok
			simpleAlert.accept();
			
			/* ***
			 * Same as above works Confirmation alert and Prompt Alert
			 * Conformaition alert comes with an option to accept or dismiss the alert.
			   --- To accept the alert you can use Alert.accept() and to dismiss you can use the Alert.dismiss().
			  * Prompt alerts you get an option to add text to the alert box. 
			   ---This is specifically used when some input is required from the user. We will use the sendKeys() 
			   
			 */

	}

}
