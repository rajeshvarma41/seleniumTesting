//Program to verify parameterisation using data provider -- we are testing business logic of PrimeNumber class


package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ParameterDataSource {
	PrimeNumber num; //we are declaring num here. If you declare inside @Before annotation, you can access that in @Test annotation
	
	@BeforeMethod
	  public void initialize() {
		  num=new PrimeNumber(); 
	  }
	
	
	@DataProvider(name="test1")  //here we are giving the name and this name should be used in @test annotation
	public static Object[][] primeNumbersObjArray() { //see the below code for better understanding. Basically we are returning multi dimensional object array
		return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};  //we are returning object array here where we are sending input numbers and expected results.
	}
	
	
	/*
	@DataProvider(name="test1")
	public static Object[] primeNumbers() {
		Object obj[][]={{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
		
		return obj;
	}
	*/
	
	@Test(dataProvider="test1")  //here we should provided data source name
  public void validatePrimeNumber(Integer inputNumber,Boolean expResult) {
	    
	System.out.println("Input number is "+" "+inputNumber+" "+"Expected results is"+" "+expResult);
	Assert.assertEquals(num.validatePrimeNumber(inputNumber), expResult);
	
  }
  


}
