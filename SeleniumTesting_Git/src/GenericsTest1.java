import java.util.ArrayList;

//Program to understand generics..
//In this program we didnt use Genrics i.e braces <>
//Disadvantge of not using generics is 
  /*
   * We can hold only a single type of objects in generics.
   * we need to typecast the object
   * No compile time error
   */

public class GenericsTest1 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();  //This holds objects. We can store any type of objects here
		list.add("hello");  //String upcast to Object implicitly
		list.add(32);       //Integer upcast to object implicitly. No complile time error
		
		String s=(String) list.get(0); //we need to use typecast to change object to String object before storing to String
		int a=(int) list.get(1); //we need to typecast to change object to Integer object before storing to integer value.
		
	}

}
