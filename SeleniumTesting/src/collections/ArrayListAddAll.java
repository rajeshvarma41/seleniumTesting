package collections;
import java.util.ArrayList;
import java.util.Iterator;

//Program to understand addAll in arraylist and addAll with index parameter
//addAll is bacically adding list to the existing list
//addAll with index parameter basically adds the list at specified location by shifting down the existing elemetns
public class ArrayListAddAll {

	public static void main(String[] args) {
		//creating arraylist al1 and addding element to array
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("abc");
		al1.add("def");
		al1.add("xyz");
		
		
		//printing elements of the arraylis(al1) using for loop(no iterator required)
		
		System.out.println("printing elements of arraylist1 using forloop");
		for(String obj:al1) {
			
			System.out.println(obj);
		}
		
		//creating arraylist al2 and addding element to array
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("111");
		al2.add("222");
		al2.add("333");
		
		//printing elements of the arraylist(al2) using for loop(no iterator required)
		System.out.println("printing elements of arraylist2 using forloop");
		for(String obj:al2) {
			System.out.println(obj);
		}
		
		//addAll method.
		al1.addAll(al2);
		
		//priting al1 after addAll
		System.out.println("printing elements of arraylist1 after addAll using forloop");
		for(String obj:al1) {
			
			System.out.println(obj);
		}
		
		//addAll method with index
		al1.addAll(1, al2);  //this basically inserts the new list at specified location 
							//by shifting shifting down the existing elemets. 
		
		//priting al1 after addAll with index
		System.out.println("printing elements of arraylist1 after addAll with index");
		for(String obj:al1) {
			
			System.out.println(obj);
		}
		
		//get method to get value from specified index
		System.out.println("getmethod to get value using specified index");
		System.out.println(al1.get(7));
	}
	

}
