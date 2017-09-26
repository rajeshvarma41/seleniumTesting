//This class contaisn the buisness logic. Basicall we will write unit test case with testng for business logic.
//Business logic is calculation of yearly salary and appraisal amount
package testNG;

public class EmpBusinessLogic {
	
	//Calculation of yearly salary of employee
	
	  public double calculateYearlySalary(EmployeeDetails emp) {
		  double yearlySalary = 0;
		  yearlySalary=emp.getSalary()*12;
		  return yearlySalary;
		  
	  }
	
	//calculation of appraisal amount of employee
	  public double calculateAppraisal(EmployeeDetails emp) {
		  double appraisal = 0;
		  if(emp.getSalary() < 1000) {
			  appraisal=500;
		  }
		  else {
			  appraisal=1000;
		  }
			  
		return appraisal;
		  
	  }
}
