package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

///Program to understand hash map-- Here we are traversing using entryset(did both using while loop as well as forloop). EntrySet is a collection of all Map Entries and contains both Key and Value.
//A HashMap contains values based on the key.
//It contains only unique elements.
//It maintains no order
//Note: There is hashtable which is same has hahmap but its synchronized
public class HasMapEntrySetTest {

	public static void main(String[] args) {
		//Declaring Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();//using Generics
                                                                 //Imp to note that under <> braces we are putting two parameters, one for key and one for value
		//Adding elements to the hashmap
		hm.put(30, "King");
		hm.put(40,"carn");
		hm.put(100, "amazing");
	
		//Traversing elements using for loop
		System.out.println("Traversing using entry set with for loop");
		Set<Map.Entry<Integer,String>> entrySet =hm.entrySet(); //important to note inside the braces <> we used Map.Entry. entrySet() returns set view of mappings contained in map.
		for(Entry entry:entrySet) {  //the values in entrySet are set are of type Entry
			System.out.println("Key is "+entry.getKey()+ "having value as"+entry.getValue());
		}
		
		//Traversing elements using while loop
		System.out.println("Traversing using entry set with while loop");
		Set<Map.Entry<Integer, String>> entrySet1=hm.entrySet();
		Iterator<Entry<Integer, String>> entrySetIterator=entrySet1.iterator();
		while(entrySetIterator.hasNext()) {
			Entry entry=entrySetIterator.next();     //Note that type of entry here is "Entry"
			System.out.println("Key is "+entry.getKey()+"having value as" +entry.getValue());
		}
	}

}
