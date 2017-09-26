//Program to understandsorting using comparator
/*This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
 * It provides multiple sorting sequence i.e. you can sort the elements on the basis of any data member, 
   for example rollno, name, age or anything else.
 *Unlike Comparable, Comparator is external to the element type we are comparing. It’s a separate class
 *We create multiple separate classes (that implement Comparator) to compare by different members.
 */

/*--------------Using Comparator-----------
 * Create a class that implements Comparator (and thus the compare() method that does the work previously done by compareTo()).
 * Make an instance of the Comparator class.
* Call the overloaded sort() method, giving it both the list and the instance of the class that implements Comparator.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortComparator {

	public static void main(String[] args) {
    //Declaring arraylist	
	ArrayList<MovieStar> al=new ArrayList<MovieStar>();
	
	//Adding Elements to ArrayList
	al.add(new MovieStar("Mahesh",29,1982));
	al.add(new MovieStar("Charan",21,1981));
	al.add(new MovieStar("ntr",33,1985));
	al.add(new MovieStar("Bunny",26,1979));
	
	//Printing elements before sorting
	System.out.println("*******Before Sorting*************");
	for(MovieStar mstr:al) {
		System.out.println(mstr.name+" "+mstr.age+" "+mstr.yearEntered);   //prints in ascending order of age
	}
	
	//Printing elemetns after sorting by age
	System.out.println("*********After sorting by age");
	
	AgeComparator ageCmp=new AgeComparator(); //need to create object from comparator class
	Collections.sort(al, ageCmp);            //we are providing the list and which compartor to use
	for(MovieStar mstr:al) {
		System.out.println(mstr.name+" "+mstr.age+" "+mstr.yearEntered);
	}
	
	//Printing elemetns after sorting by name
		System.out.println("*********After sorting by name");
		NameComparator nameCmp=new NameComparator(); //need to create object from comparator class
		Collections.sort(al, nameCmp);        //we are providing the list and which compartor to use
		for(MovieStar mstr:al) {
			System.out.println(mstr.name+" "+mstr.age+" "+mstr.yearEntered);  //prints in ascending order of name
		}
	}

}
