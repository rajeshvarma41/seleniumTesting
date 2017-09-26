//Program to count characters in a string and display in sorting order
//--Try this..Use comparator and try, somehow not working
package practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class CharacterCountSorted {

	public static void main(String[] args) {
		String str="Rajjaanu";
		char[] charArr=str.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		
		for(Character ch:charArr) {
			if(tm.containsKey(ch)) {
				int count=tm.get(ch)+1;
				tm.put(ch,count);
			}
			else
			 tm.put(ch, 1);
		}
	
	//Iterating through hashmap using for loop and keyset
			Set<Character> keySet1=tm.keySet();
			for(char c:keySet1) {
				System.out.println("Count of charater "+ " " +c+" "+"is"+" "+tm.get(c) );
			}
}

}




	
