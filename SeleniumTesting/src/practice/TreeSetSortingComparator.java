//Program to implement comparator for sorting the values of employee salary in a treeset
//This treeset contains employee objects that has employee name and salary
package practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortingComparator {

	public static void main(String[] args) {
		
		TreeSet<Employee> ts=new TreeSet<Employee>(new salComparator()); //here we are using constructor that has comparator.This constructor constructs an empty tree set that will be sorted according to the given comparator.
		
		//Creating employee objects
		Employee emp1=new Employee("Rani",2000);
		Employee emp2=new Employee("Vivek",5000);
		
		Employee emp3=new Employee("Rajesh",9000);
		
		//Adding objects to treeset
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		
		//Printing the elements that are sorted as per the comparator logic
		System.out.println("**********Printing the data********");
		for(Employee emp:ts){
			System.out.println(emp.empName+" "+emp.empSalary);  //notice that they will be displayed in ascending order of salary
		}
		
				
		
	}
	
}

//This was the employee class that we created
class Employee {
	String empName;
	int empSalary;
	public int age;
	
//Constructor of employee class
	public Employee(String empName,int empSalary) {
	this.empName=empName;
	this.empSalary=empSalary;
	
	}
	
}

//Comparator class

class salComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.empSalary-o2.empSalary;
	}
	
}



