//Program to understand Log4j --With Log4j, it is possible to store the flow details of our Selenium Automation in a file or databases
/*Below program is throwing some error due t selenium not detecting. But the concept is fine. We created log4j.properties under src. 
   --Based on the properties file its creating selenium.logs and manual.logs. Selenium logs are created by apache, whereas manual logs were created
    by us using the below code
    -- Logs destination you can refer in log4j.properties.
 */
/*Below are components of log4j
 * Loggers: It is responsible for logging information. To implement loggers into a project following steps need to be performed -
      - Create an instance for logger class
      -Define the Log4j level: DEBUG,INFO,WARN etc
  * Appenders:    It is used to deliver LogEvents to their destination
    - Following are few types of Appenders
    - ConsoleAppender logs to standard output
    - File appender prints logs to some file
  * Layouts: It is responsible for formatting logging information in different styles.
 */

package log4j_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class LoggingDemo {

	public static void main(String[] args) {
		 // declaration and instantiation of objects/variables
    	WebDriver driver ; //webdriver is interface. Firefox driver, chrome driver etc are classes that implement webdriver
    	
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	Logger log=Logger.getLogger("samplelogger");   //We can give whatever name we want in the braces.
    	driver.get("http://healthunify.com/bmicalculator/");
    	log.debug("opening website");                         //manual logs
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 log.debug("entring weight");
		 //driver.findElement(By.name("wg")).sendKeys("87");
         log.debug("selecting kilograms");
         driver.findElement(By.name("opt1")).sendKeys("kilograms");
         log.debug("selecting height in feet");
         driver.findElement(By.name("opt2")).sendKeys("5");
         log.debug("selecting height in inchs");
         driver.findElement(By.name("opt3")).sendKeys("10");
         log.debug("Clicking on calculate");
         driver.findElement(By.name("cc")).click();

		 log.debug("Getting SIUnit value");
         String SIUnit = driver.findElement(By.name("si")).getAttribute("value");
         log.debug("Getting USUnit value");
         String USUnit = driver.findElement(By.name("us")).getAttribute("value");
         log.debug("Getting UKUnit value");
         String UKUnit = driver.findElement(By.name("uk")).getAttribute("value");
         log.debug("Getting overall description");
         String note = driver.findElement(By.name("desc")).getAttribute("value");
      
         System.out.println("SIUnit = " + SIUnit);
         System.out.println("USUnit = " + USUnit);
         System.out.println("UKUnit = " + UKUnit);
         System.out.println("note = " + note); 
		driver.quit();
	}

}
