//Program to understand sorting using comparable
/*Java Comparable interface is used to order the objects of user-defined class.
 * This interface is found in java.lang package and contains only one method named compareTo(Object)
 * It provide single sorting sequence only i.e. you can sort the elements on based on single data member only. For example it may be rollno, name, age or anything else.
*/

/* -----Using Comparable--------------------
 * The class itself must implements the java.lang.Comparable interface to compare its instances.
 * we override the method compareTo() of Comparable interface.
 * Note here that we implemented compareTo method iin STudent class
 * */

package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortComparable {

	public static void main(String[] args) {
		//Creating an arraylist
		ArrayList<Student> stdList=new ArrayList<Student>();
		
		//Adding Student objects to ArrayList
		stdList.add(new Student(100,"Rajesh",32));
		stdList.add(new Student(130,"Rajesh",29));
		stdList.add(new Student(120,"Rajesh",13));
		stdList.add(new Student(110,"Rajesh",40));
		
		//Printing before sorting
		System.out.println("**************Priting before sorting**************");
		
		for(Student std:stdList) {
			System.out.println(std.rollNo+" "+std.name+" "+std.age);
		}
		
		//Sorting the Arraylist that has Student objects
		Collections.sort(stdList);
		
		//Printing after sorting
		System.out.println("**************Priting after sorting**************");
				
		for(Student std:stdList) {
			System.out.println(std.rollNo+" "+std.name+" "+std.age);   //They are printed in the ascending order of roll number as we put compareTo method that way
		}
		
	}

	
	
}
