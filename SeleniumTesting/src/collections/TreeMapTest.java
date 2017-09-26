package collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

//Program to understand tree map
//Very Important: It is same as HashMap instead maintains ascending order. Note: linkedHashMap maintais inserting order wheras this one maintains sorting order
//A TreeMap contains values based on the key.
//It contains only unique elements.

public class TreeMapTest {

	public static void main(String[] args) {
	
		//Declaring TreeMap
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		//Adding entries to TreeMap
		tm.put(100,"Rajesh");
		tm.put(50, "Silpa");
		tm.put(150, "King");
		tm.put(200, "Fast");
		tm.put(75, "Silpa");
		
		//Traversing elements uisng iterator keyset
		Set <Integer> keySet1=tm.keySet();
		Iterator<Integer> keyIterator=keySet1.iterator();
		while(keyIterator.hasNext()) {
			Integer key=keyIterator.next();
			System.out.println("Key of "+key+"has value of"+tm.get(key));  //Note here we are getting the output based on ascending order of key values
		}
		
		System.out.println("*************************************");
		//Traversing elements using iterator entryset
		Set <Map.Entry<Integer,String>>entrySet1=tm.entrySet();
		Iterator entryIterator=entrySet1.iterator();
		while(entryIterator.hasNext()) {
			Entry entry1=(Entry) entryIterator.next();
			System.out.println("Key of "+entry1.getKey()+"has value of "+entry1.getValue());
			
		}
		
	}

}
