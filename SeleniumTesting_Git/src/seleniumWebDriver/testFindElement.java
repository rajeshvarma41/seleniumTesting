package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testFindElement {

	public static void main(String[] args) {
		WebDriver driver; //Declaring webdriver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver(); // Initialize browser
		
		driver.get("http://gmail.com"); //Loading the website
		WebElement emailField=driver.findElement(By.id("Email"));   //Note: By is class and By.id is calling static method and returns WebElement
																	//WebElement is an interface
		
		emailField.sendKeys("rajeshvarma41");
		
		/*You can write above in single line as below
		 * driver.findElement(By.id("Email")).sendKeys("rajeshvarma41")
		 * 
		 */
		
		driver.findElement(By.name("signIn")).click();  //clicking the signin button
	}

}
