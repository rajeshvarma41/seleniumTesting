package collections;
import java.util.Iterator;
import java.util.LinkedList;

//program to understand linked list
//Java LinkedList class uses doubly linked list to store the elements. Manipulation with LinkedList is faster than ArrayList because it uses doubly linked list so no bit shifting is required in memory.
//insertion an happen from bothe the ends
//LinkedList can contain duplicate elements and linked list maintains inerstion order
//note: We have get method to access value from specified index
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>(); //used Generics
		list.add("Ravi");
		list.add("remo");
		
		//printing using iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		//printing using for loop
			for(String obj:list){
				System.out.println(obj);
			}
			
			//get method to get value from specified index
			System.out.println("getmethod to get value using specified index");
			System.out.println(list.get(1));
		
	}

}
