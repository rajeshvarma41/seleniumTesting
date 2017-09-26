//program to understand TreeSet --TresSet maintains ascending order
/*Important: Maintains ascending order.--whereas hashset doesnt maintain ascending order
 * memory point: Name has tree means maintains ascending order 
 * Name has linked means maintains insertion order 
*/
//Contains unique elements only like HashSet.
package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TressSetTest {

	public static void main(String[] args) {
		
		//Declaring TreeSets
		TreeSet<String> ts1=new TreeSet<String>();  //this treeset contains string values
	    TreeSet<Integer>ts2=new TreeSet<Integer>();	//this treeset contains integer values
	    
	    //Adding string values to treeset ts1
	    ts1.add("Rajesh");
	    ts1.add("Silpa");
	    ts1.add("Anaimal");
	    ts1.add("Jannu");
	    
	    //Adding Integer values to treeset ts2
	    ts2.add(10);
	    ts2.add(40);
	    ts2.add(15);
	    ts2.add(30);
	    
	    //retrieving elements from ts1 using for loop
	    System.out.println("----Elements from ts1----");
	    for(String str:ts1){
	    	System.out.println(str);  //Note here the output is coming as ascending order of String
	    }
	    
	    //retrieving elemnts from ts2 using while loop
	    System.out.println("------Elements from ts2-----");
	    Iterator itr=ts2.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());   //Note here the output is coming as ascending order of Integer
	    }
	}

}
