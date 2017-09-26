//Running multiple browsers, using TestNG parameterisation(Dat Source).Here we are runnnng firefox and chrome. 
package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mulitiBrowserTestNG {
  @Test(dataProvider="GetBrowserData")
  public void testBrowser(String browser) {
	  
	  WebDriver driver=null;
	  if(browser.equals("Firefox")) {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\rvarma\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  }
	  else if(browser.equals("Chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvarma\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  }
	  //Invoke the browser url
	  driver.get("http://www.facebook.com");
	  
	  //close the browser
	  driver.close();
  }
  
  @DataProvider(name="GetBrowserData")
  public static Object[] browserData() {
	  Object[] objArr=new Object[2];
	  objArr[0]="Firefox";
	  objArr[1]="Chrome";
	return objArr;
	  
  }
  
}
