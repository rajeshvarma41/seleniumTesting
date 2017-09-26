package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//Program to understand arraylist--ArrayList internally uses dynamic array to store the elements.
//Manipulation with ArrayList is slow because it internally uses array. If any element is removed from the array, all the bits are shifted in memory.
//ArrayList class can contain duplicate elements
//ArrayList class maintains insertion order. i.e we can retrive the elements in the same order that we inserted
//Important to thing to note. ArrayList can hold only objects. It doesnt hold primitive types like the way regualr array does.
//note: We have get method to access value from specified index
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); //used Generics
		//Adding elements to array
		list.add("rajesh");
		list.add("johny");
		list.add("poker");
		
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); //note : here iterator points to object, but automatic unboxing happens and string is printed.
		}
		
		//Traversing list through for loop
		
		for(String obj:list){
			System.out.println(obj);   //this will print in the same order as we inserted
			
		
			
			
		}
			
		
	}

}
