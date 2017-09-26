//Program to sort String in ArrayList -- Here we are sorting arraylist that has String objects
//If collection elements are of Set type, we can use TreeSet and if collection elements are map type we can use TreeMap to sort the keys
//Important: We cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.
package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortString {

	public static void main(String[] args) {
		//Declaring arraylist
		ArrayList<String> list=new ArrayList<String>();
		
		//Adding elements to arraylist
		list.add("Animal");
		list.add("Rajesh");
		list.add("Funny");
		list.add("Nandin");
		
		//retrieving elements from arraylist before sorting
		System.out.println("*************Printing before sorting*************");
		for(String str:list) {
			System.out.println(str);
		}
       
		//Sorting the arraylist
		Collections.sort(list);   //String class implements the Comparable interface.So if you store the objects of string, the are comparable and will be sorted in natural order
		
		//retrieving elements from arraylist before sorting
		System.out.println("*************Printing after sorting*************");
		for(String str:list) {
		System.out.println(str);
		}
		
	}

}
