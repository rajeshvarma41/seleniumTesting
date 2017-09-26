package collections;
import java.util.LinkedList;

//Program to understand different methods of linked list
public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("one");  //this add() method by default at the end
		list.add("two");
		list.addFirst("firstone");  //this addFirst() methods add at the top
		list.addFirst("firsttwo");
		
		
		//print elements of array after the addFirst method
		System.out.println(("printing elemetns of array after the addFirst method"));
		for(String obj:list) {
			System.out.println(obj);
		}
		
		list.addLast("last one");
		list.addLast("last two");
		
		//printing elements of array  after the addlast method
		System.out.println(("printing elemetns of array after the addLastmethod"));
		for(String obj:list) {
			System.out.println(obj);
		}

	}

}
