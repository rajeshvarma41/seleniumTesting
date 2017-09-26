//Program to understand parameterisation where we are providing parameters using datasource
//Note: Understand the concept here. Somehow getting error identifying the element for username. But if you notice this is running two times 
//based on the two parameters we provided
package seleniumParameterisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SelDataProviderParam {
	
	//Data provider
	
	@DataProvider(name="Authentication")
	public static Object[][] credentials() {
		 return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
		
	}
  
	//Actual Test method
	@Test(dataProvider="Authentication") //Note here we are calling the data provider
  public void test(String sUsername, String sPasssword) { //using the parameters from Data Source
	  WebDriver driver;
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	  
	  driver=new FirefoxDriver();
	  
	  // Put an Implicit wait.
	  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  // launch Fire fox and direct it to the Base URL
      driver.get("http://www.store.demoqa.com");
	  //Maximising the browser window
		driver.manage().window().maximize();
	  //Clicking on Myaccount link
	  driver.findElement(By.xpath("//*[@id='account']/a")).click();
	  //entering username
	  driver.findElement(By.id("log")).sendKeys(sUsername);
	  //entering password
	  driver.findElement(By.id("pwd")).sendKeys(sPasssword);
	  //clicking the login link
	  driver.findElement(By.id("login")).click();
	  //clicking the logout link
	  driver.findElement(By.xpath("//*[@id='account_logout']/a")).click();
	  driver.quit();
  }
	


  }

