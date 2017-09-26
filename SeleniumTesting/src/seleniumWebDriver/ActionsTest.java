//Program to understand Actions Class

package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) {
	
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.americangolf.co.uk/");
		driver.manage().window().maximize();   //maximizing the window
		WebElement golfClubs=driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		
		Actions act=new Actions(driver);  //instantiating actions class
		
		Action moveMouse=act.moveToElement(golfClubs).build(); //Action is an interface.The build() method is always the final method used so that all the listed actions will be compiled into a single step.
		
		moveMouse.perform(); //Use the perform() method when executing the Action object designed above.
	}	

}
