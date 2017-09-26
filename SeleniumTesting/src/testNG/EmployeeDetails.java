//This class was created to demonstrate complete flow on how we write test cases for testng
//Below is employee details class that is used to get and set values for fullname, age and salary

package testNG;

public class EmployeeDetails {
private String fullName;   //instance variables
private int age;
private double salary;

//constructor
public EmployeeDetails() {
	
}
//getters and setters
public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
