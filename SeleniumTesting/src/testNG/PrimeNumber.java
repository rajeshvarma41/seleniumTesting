// Class created to understand parameterization using DataProvider
/*TestNG lets you pass parameters directly to your test methods in two different ways:
With testng.xml
With Data Providers
*/
package testNG;

public class PrimeNumber {
	
public Boolean validatePrimeNumber(Integer primeNumber) {  //This is business logic for which we are writing test case
	for(int i=2;i<primeNumber/2;i++) {
		if (primeNumber%i==0) {
			return false;
		}
		
		

	}
	return true;

}
}

