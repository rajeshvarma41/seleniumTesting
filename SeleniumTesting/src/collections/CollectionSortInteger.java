//Program to sort Integer in ArrayList -- Here we are sorting arraylist that has Integer objects
//If collection elements are of Set type, we can use TreeSet and if collection elements are map type we can use TreeMap to sort the keys
//Important: We cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.
package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortInteger {

	public static void main(String[] args) {
		//Declaring arraylist
				ArrayList<Integer> list=new ArrayList<Integer>();
				
				//Adding elements to arraylist
				list.add(23);
				list.add(10);
				list.add(80);
				list.add(4);
				
				//retrieving elements from arraylist before sorting
				System.out.println("*************Printing before sorting*************");
				for(Integer i:list) {
					System.out.println(i);
				}
		       
				//Sorting the arraylist
				Collections.sort(list);   //Integer class implements the Comparable interface.So if you store the objects of string, the are comparable and will be sorted in natural order
				
				//retrieving elements from arraylist before sorting
				System.out.println("*************Printing after sorting*************");
				for(Integer i:list) {
				System.out.println(i);
				}
				
			}

	}


