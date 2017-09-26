package collections;
import java.util.LinkedHashSet;

//Program to understand linked hashset
//Contains unique elements only like HashSet.
//Provides all optional set operations, and permits null elements.
//Maintains Innsertion Order i.e when we retirve elemetnts they come in same order than we inserted
//It has same methods as hashset
public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> lset= new LinkedHashSet<String>(); //Using Generics
		
	//adding elements to the linkedHashser
		
		lset.add("Rani");
		lset.add("king");
		lset.add("jim Davis");
		lset.add("Rani");   
		
	////traversing elements in set using for loop
		for(String obj:lset) {
			System.out.println(obj);  //Note here we are not having duplicates
									  //Also the order is maintained. i.e when we retirve elemetnts they come in different order than we inserted
		}

	}

}
