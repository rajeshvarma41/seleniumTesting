package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



//Program to understand hash map-- Here we are traversing using keyset(did both using while loop as well as forloop). Keyset is collection of all keys in the map
//A HashMap contains values based on the key.
//It contains only unique elements.
//It maintains no order
public class HashMapTest {

	public static void main(String[] args) {
		
		//Declaring hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); //using Generics
		                                                           //Imp to note that under <> braces we are putting two parameters, one for key and one for value
		
		//Adding entires to hashmap
		hm.put(100,"Rajesh");
		hm.put(200, "John");
		hm.put(102, "King");
		hm.put(100, "Rekha");
		
		//Traversing through hash map using keyset (for loop)
		System.out.println("Traversing using keyset with for loop ");
		Set<Integer> keySet=hm.keySet(); //getting keyset so we can travserse.Here used generic <Integer> otherwise its treated as type Object and we need to convert while retreiving.
		for(Integer key:keySet) {
			System.out.println("key of"+key+"has value of"+hm.get(key));
		}
	
		//Traversing through hash map using keyset(while loop)
		System.out.println("Traversing using keyset with while loop ");
		Set<Integer> keySet1=hm.keySet();
		Iterator<Integer> keySetIterator= keySet1.iterator();
		while(keySetIterator.hasNext()) {
			Integer key=keySetIterator.next();
			System.out.println("Key of "+ key+"has value of" +hm.get(key));
		}
		
	}
		
}	


