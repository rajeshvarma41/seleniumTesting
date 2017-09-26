package collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Program to understand linked hash map
//Important: It is same as HashMap instead maintains insertion order.
//A LinkedHashMap contains values based on the key.
//It contains only unique elements.
public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		//Declaring Linked hashmap
		
		LinkedHashMap<Integer,String> lm=new LinkedHashMap<Integer,String>();
		lm.put(100,"Rajesh");
		lm.put(50, "King");
		lm.put(200,"rams");
		lm.put(120,"superman");
		
		//Iterating using for loop of keys set
		Set <Integer>keys=lm.keySet();
		for(Integer i:keys) {
			System.out.println("Key of"+i+"has value of"+lm.get(i));
		}
		
		System.out.println("***********************************************");
		//Iterating using for loop entry set
		Set <Map.Entry<Integer,String>> entySetVariable=lm.entrySet();
		for(Entry m:entySetVariable) {
			System.out.println("Key of"+m.getKey()+"has value of"+m.getValue());  //Note here the pputput is in the same order as we inserted
		}
	}

}
