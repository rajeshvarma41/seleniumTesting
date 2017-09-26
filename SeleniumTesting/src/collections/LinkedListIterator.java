package collections;
import java.util.Iterator;
import java.util.LinkedList;

//Program to understand Iterator. This is general one for arraylist,linked list--etc where we are using iterator

public class LinkedListIterator {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		
		Iterator itr=list.iterator();  //creating iterator
		
		
		System.out.println(itr.next());  //next() method returns the next element in the iteration.
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		
		list.add("four"); //adding element to the list
		System.out.println(itr.next()); //note this lines gives java.util.ConcurrentModificationException error
										//if the list is structurally modified at any time after the iterator is created, in any way except through the iterator's own remove or add methods, the iterator will throw a ConcurrentModificationException.
	}

}
