//Program to understand drop down
/*
 * Drop down allows only single selection
 * Below are steps
   -- Import the package org.openqa.selenium.support.ui.Select
   -- Instantiate the drop-down box as a "Select" object in WebDriver i.e creta new Select Object of class Select.
   -- Using the select object we can select different options available inside the drop down
 */
package seleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

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
	
	Select oSelect=new Select(driver.findElement(By.id("continents"))); //Select is a class that provided methods to select and deselect options
	
	oSelect.selectByVisibleText("Europe"); 
	
	// Using sleep command so that changes can be noticed
	Thread.sleep(2000);
	
	//Print all the options for the selected drop down
	
	List<WebElement> optionList=oSelect.getAllSelectedOptions();
	
	for(WebElement elem:optionList) {
		elem.getText();
		System.out.println("Text of option is "+ elem.getText()); //check later why not all values are printed
	}
	
	//kill the browser
	}

}
