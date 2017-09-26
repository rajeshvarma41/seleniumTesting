//Program to find duplicate characters in a string
//Here we are using collectiones(hashmap - key value pairs)
package practice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String str="Rajeshapplepieiiii";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		char[] charArr=str.toCharArray(); //converting string to char array
		for(Character c:charArr) { //Here important we used Character class i/e automatic unboxing to Character class as in the hashmap wwe use only objects, if we use primitive char here in the subsequent steps we cannot use this variable.
			if(hm.containsKey(c)) {  //if its in map increment the count and replace the entry using new count
				int count=hm.get(c)+1;
				hm.put(c, count);
						
			}
			else {  //if not in map ,means we are inserting for first time, so add the character ad count is 1
				hm.put(c,1);
			}
		}
		
//Iterating through hashmap using for loop and keyset
		Set<Character> keySet1=hm.keySet();
		for(char c:keySet1) {
			System.out.println("Count of charater "+ " " +c+" "+"is"+" "+hm.get(c) );
		}
  }

}