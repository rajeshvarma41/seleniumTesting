//Program to understand webtables
/*
 * It is very seldom for a web designer to provide an id or name attribute to a certain cell in the table. 
 * Therefore, we cannot use the usual methods such as "By.id()", "By.name()", or "By.cssSelector()".
 *  In this case, the most reliable option is to access them using the "By.xpath()" method.
 */
package seleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableTest {

	public static void main(String[] args) {
		 // declaration and instantiation of objects/variables
    	WebDriver driver ; //webdriver is interface. Firefox driver, chrome driver etc are classes that implement webdriver
    	
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	
    	// Put an Implicit wait.
    	driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
    	
    	//Launching the browser
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		//Maximising the browser window
		driver.manage().window().maximize();
		
		//Here we are locating the xpath by passing variables in the xpath
		
		String rowValue="1";
		String colValue="2";
		
		String cellValue=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+rowValue+"]/td["+colValue+"]")).getText(); //here we are finding element and getting text
		System.out.println("Value in the column is " +cellValue );
		
		//Printing all the column values for a particular row
		
		String sRow="Clock Tower Hotel";
		
		for(int i=1;i<=5;i++) {
		String rowValue1=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/table/tbody/tr["+i+"]/th")).getText(); //looping through different headers
		if(rowValue1.equals(sRow)) { //checking if the header has row we are looking for
			for(int j=1;j<=5;j++) {
				String colValue1=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
				System.out.println("Col value is "+colValue1);  //check later somehow not printing values.
			}
			break;
		}
		
		}
		
		driver.close(); //closing the browser
	}

}
