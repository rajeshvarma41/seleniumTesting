//program to understand switch commands
/*
 * Imp:Note:getWindowHandles returns the window handles as set
 */
package seleniumWebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchTest {

	public static void main(String[] args) {
		//Declaration and intiation of driver	
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			// Put an Implicit wait.
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		    //Launching the browser
			driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows");
			
			//Maximising the browser window
			driver.manage().window().maximize();
			
			//Printing the name of the first window.
			String handle=driver.getWindowHandle();   //getWindowhandle() returns String
			System.out.println(handle);
			
			//Click the button new window
			
			driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[3]/button")).click();  //due to javascript error this is somehow not working
			
			//printing name of all the windows open
			Set<String> handles=driver.getWindowHandles();   //This gives set of handles
			for(String hnd:handles) {
				System.out.println(hnd);
				driver.switchTo().window(hnd);
				
			}
			
			//closing popup window
			driver.close();
			
			//close original window
			driver.quit();

	}

}
