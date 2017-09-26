//Program to test Employee Business logic using testNG
//Here we have two test for testing the business logic. One test was used to calculate appraisal and one for calculating  yearly salary
package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmpBusLogicTestNG {

	EmployeeDetails emp1=new EmployeeDetails();
	EmpBusinessLogic empBusLog1=new EmpBusinessLogic();
	
	@Test
	public void testCalculateAppraisal() {
		emp1.setSalary(1200);  //we are setting values here using setters as we dont have constructor for this class
		emp1.setAge(34);
		emp1.setFullName("Rajesh");
		
		double appraisal=empBusLog1.calculateAppraisal(emp1);
		
		Assert.assertEquals(appraisal, 1000, 0.0, "value wrong");
	}
	
	@Test
	public void testCalculateYearlySalary() {
		double salary=empBusLog1.calculateYearlySalary(emp1);
		Assert.assertEquals(salary,14400,0.0,"value wrong");
	}
	
}
