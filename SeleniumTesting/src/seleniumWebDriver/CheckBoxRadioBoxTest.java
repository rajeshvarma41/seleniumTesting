//Program to understand checkbox operarations and radio button operations
/*
 * Important: IsSelected Method to Check the State of Checkbox/Radio button.
 */

package seleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxRadioBoxTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //For implicit wait we use TimeUnit
		
		//launch the browser
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		 //Select the deselected Radio button category Sex (Use IsSelected method). Here we are using byName that will give multiple results and so using list
		List<WebElement> radBtnSex=driver.findElements(By.name("sex"));
		for(WebElement elem:radBtnSex) {
			if(elem.isSelected()==false)   //isSelected method is used to check the state of checkbox or radio button
				elem.click();
		break;
		}
		
		//selecting using Byid to select Third radio button for category ‘Years of Exp’(As id is unique we get only one element)
		WebElement radBtnExp=driver.findElement(By.id("exp-2"));
		radBtnExp.click();
		
		//Check the Check Box ‘Automation Tester’ for category ‘Profession' using Value attribute(As value is not unique you will get multiple elements)
		List<WebElement> chkBoxProfession=driver.findElements(By.name("profession"));
		for(WebElement elem:chkBoxProfession) {
			String sValue=elem.getAttribute("value");   //using getAtttribute we can get  any attribute value of the html element. Here we are getting value attribute
			if(sValue.equalsIgnoreCase("Automation Tester")) {
				elem.click();
				break;
			}
			
		//check the checkbox 'Selenium IDE' using css selector
		WebElement chkBoxAutoTool=driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		chkBoxAutoTool.click();	
		
		//kill the browser
		driver.quit();
		}
		
	}

}
