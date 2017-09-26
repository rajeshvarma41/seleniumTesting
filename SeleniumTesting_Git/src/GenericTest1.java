import java.util.ArrayList;

//Program to understand generics..
//In this program we are using Genrics i.e braces <>
//Advantages
/*
 * We can hold only a single type of objects in generics. It doesn’t allow to store other objects.
 *  There is no need to typecast the object.
 *  Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
 */
 
public class GenericTest1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); //used generics
		list.add("Rajesh");
		list.add("John");
		//list.add(32);  //This gives compile time error as we can store only string type objects
		
		String s=list.get(0);  //type casting is not required  
		
		System.out.println(s);
	}

}
