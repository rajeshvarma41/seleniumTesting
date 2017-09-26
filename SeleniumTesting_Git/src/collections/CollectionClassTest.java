//Program to understand collection class--
//Collection class consists exclusively of static methods that operate on or return collection
//It has different methods like sorting,reversing,binary search etc --sort is tricky and we are writing other program for that
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Rajesh");
		list.add("Rekha");
		list.add("java");
		
		System.out.println("Initial collection value:"+list);  //Note here are we are printing this way which not sure how it works. Ideally we use for loop or iterator
		
		//addAll method from collections class
		Collections.addAll(list, "DotNet","Microsoft"); //Adding elements to list individually
		System.out.println("After adding elements to collection value:"+list);
		
		String[] str={"google","msn"}; //Adding elements to list using an array
		Collections.addAll(list, str);
		System.out.println("adding elements to collection using an array :"+list);
		
		//max method from collection class
		System.out.println("Max value of list is "+ Collections.max(list));
     
	}

}
