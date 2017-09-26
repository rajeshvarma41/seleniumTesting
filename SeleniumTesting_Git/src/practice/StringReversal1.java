//Program to reverse a string. Here we are using different ways doing the same thing. 
//This was nice to understand all different ways to develop deep knowledge on concepts..Read this all lines and very fun..
package practice;

import java.util.ArrayList;
import java.util.Collections;

public class StringReversal1 {

	public static void main(String[] args) {
		
		strRevCharArr("Rani");  //Using Method 1 which is converting to char Array
		System.out.println();
		strBufferRev("Have Fun"); //Using Method 2 which is using String Buffer reverse()
		System.out.println();
		strReverseCollection("Hello dear"); //Using Method 3 which is converting to char Array and adding each character from array to arraly list 
											//and using method in Collections class
		System.out.println();
		strRevCharArrSwap("Janani king");
	}

	//Method 1 -- Converting to charArray and printing from end of the array
 public static void strRevCharArr(String str) {
	 char[] charArr=str.toCharArray(); //converting the string to character array
		for(int i=charArr.length-1;i>=0;i--) {
			System.out.print(charArr[i]);  //here we used print instead of println so they will be printed in same line.
		}
 }
 
 //Method 2 --Using reverse() method in String Buffer class
 
 public static void strBufferRev(String str) {
	 StringBuffer strBuffer=new StringBuffer();
	 strBuffer.append(str);  //converting String to String Buffer using append method
	 strBuffer.reverse();    //Using reverse() method on String Buffer
	 System.out.println(strBuffer);
 }
 
 //Method 3 --Using reverse method in Collection class that takes array list
 
 public static void strReverseCollection(String str) { 
	 char[] charArr=str.toCharArray(); //converting string to character array
	 ArrayList<Character> arrList=new ArrayList<Character>(); //creating array list with genrics as Character. As Arraylist holds only objects we cannot use char
	 
	//adding to array list from character array
	 for(char ch:charArr) {  
		 arrList.add(ch);
	 }
	 
	 //Using reverse method in Collections class on Arraylist
	  Collections.reverse(arrList);
	  
	//Here we used print instead of println so they will be printed in same line.
	  for(char ch:arrList) {
		 System.out.print(ch);  
	 }
 }
	  
 //Method 4
public static void strRevCharArrSwap(String str)  {
	char[] charArr=str.toCharArray(); //converting string to character array
	int left=0;
	int right=charArr.length-1;
	
	//We are swapping the characters from the left and right i.e first character swapped to last and so on
	for(left=0;left<right;left++,right--) { //here we are using for loop and in the same loope we changing left and right using comma
											//same thing can be done using while loop like while(left<right) and inside loop we can use left++ and right--
		char temp=charArr[left];
		charArr[left]=charArr[right];
		charArr[right]=temp;
	}
	
	//print the values from char array after swapping is done
	for(char ch:charArr) {
		System.out.print(ch);
	}
}
	 
 
 

}
