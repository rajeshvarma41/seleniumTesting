//Program to understand arrays that is part of util package
//The java.util.Arrays class contains a static factory that allows arrays to be viewed as lists
/*
 * This class contains various methods for manipulating arrays (such as sorting and searching).
 * The methods in this class throw a NullPointerException if the specified array reference is null.
 * Important: This is especially used when we want to do some maipulations on regular arrays (instead of we writing seperate logic)
 * Important: Note we dont have any constructor for this class. So we create arrays using regular way, but maipulations we used methods of this class
   that takes array as one of the parameter 
 */

package collections;

import java.util.Arrays;

public class ArrayInUtilitiesTest {

	public static void main(String[] args) {
		
    Integer[] arr1={20,30,40};  //declaring and intitialization of  array1 with 3 elemets
    Integer[] arr2=new Integer[] {14,21,98};  //declarion and intialiszation in different way
    
    //Creating new array using method of Arrays class
    Integer arr3[]=Arrays.copyOf(arr1, 3); //We are using Arrays.copyOf and returning new array
    //Printing the array
    for(int i:arr3) {
    	System.out.println(i);  //so we can notice that arr3 is created whihc is copy of arr1
    }
    
    //Comparing the arrays
    Boolean bl=Arrays.equals(arr1,arr3);  //this method return true if both arrays are equal.
    System.out.println(bl);
    
    //Comparing with deep equals
    System.out.println(Arrays.deepEquals(arr1, arr3));  //deep equals compares objects and that the reason we used Integer instead of int while declaring the array
    
	}

}
