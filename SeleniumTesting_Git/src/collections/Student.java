//This class was created to understand collection sort using comparable
//The class itself must implements the java.lang.Comparable interface to compare its instances.
//we override the method compareTo() of Comparable interface.
package collections;

public class Student implements Comparable<Student>{   //important we are implementing Comparable interface.Collections.sort requires all the objects of the list to implementing Comparable
	int rollNo;  //class variables
	String name;
	int age;
	
	
//constructor
Student(int rollNo,String name,int age) {
	this.rollNo=rollNo;
	this.name=name;
	this.age=age;
}



@Override   
public int compareTo(Student st) { //we need to implement this method of interface. If we dont implement this method Collections.sort method gives error
									//Based on this it will decide on what field ordering need to be done.
	if(this.age==st.age)  
		return 0;  
		else if(this.age>st.age)  
		return 1;  
		else  
		return -1;  
}

/*the above condition can be also written as 
 return this.year - m.year;  
  
 */

}
