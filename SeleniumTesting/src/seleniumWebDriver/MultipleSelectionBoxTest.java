//Program to understand multiple selection
/*
 * Drop down allows only single selection
 * Multiple selection allows selecting multiple options
 * We can identify by looking at the tag is its multiple which looks something as below. Note "multiple" text in the tag
   -- <select id="selenium_commands" class="input-xlarge" name="selenium_commands" multiple="multiple">
 * Note: DeSelects methods work only for mutliple select and might not work for drop downs
 */
package seleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionBoxTest {

	public static void main(String[] args) throws InterruptedException {
		//Declaration and intiation of driver	
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			// Put an Implicit wait.
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		    //Launching the browser
			driver.get("http://toolsqa.wpengine.com/automation-practice-form");
			
			//Maximising the browser window
			driver.manage().window().maximize();
			
			//Select ‘Continents’ Drop down ( Use Id to identify the element )
			Select oSelect=new Select(driver.findElement(By.name("selenium_commands")));
			
			//Select option 'Browser Commands' and then deselect it
			oSelect.selectByIndex(0);
			
			// Using sleep command so that changes can be noticed
			Thread.sleep(2000);
			
			//Deselecting option
			oSelect.deselectByIndex(0);
							
			//Getting the list of all the options	
			List<WebElement> optionList=oSelect.getAllSelectedOptions();
			
			//Selecting all the elements one by one
			for(int i=0;i<optionList.size();i++) { //here we are are traversing through the total options
			oSelect.selectByIndex(i);  //check later why not working
			Thread.sleep(2000);
		    
				
			}
			
			

	}

}
