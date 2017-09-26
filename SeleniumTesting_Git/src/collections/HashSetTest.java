package collections;
import java.util.HashSet;
import java.util.Iterator;

//program to understand Hash set
//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.
//Doesnt maintain insertion order i.e when we retirve elemetnts they come in different order than we inserted.
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>(); //using Generics
		
		//adding elements to set
		
		set.add("Rani");
		set.add("king");
		set.add("jim Davis");
		set.add("Rani");    //Note here we are adding Rani second time which is duplicate
		
		//traversing elements in set --using while loop
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	   //note here in the output we see Rani only once as set doesnt allow duplicates.
										//i.e when we retirve elemetnts they come in different order than we inserted
		}
		
	}
	
	

}
