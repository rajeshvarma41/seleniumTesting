package collections;
import java.util.HashSet;

//program to understand methods in hashset
//note: We donot have get method to access value as we dont have any insertion order
public class HashSetMethods {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		Object[] arr;
		String[] arr1;
		
		//adding elements to hashset
		set.add("rams");
		set.add("jim");
		set.add("shiva");
		
		
		//contains() method
		boolean x= set.contains("rams");  //this contains() method checks if set has the value sspecified
		System.out.println(x);
		
		//hashcode() method
		System.out.println("Hash code of the set is " + set.hashCode()); //getting the hascode of the set
		
		//converting set to array usong toArray()
		
		arr=set.toArray(); //ToArray() method returns array object thais is why we decalred arr as onject
		 //we declared arr1 as String and thats the reason we need to type cast object to string
		
		
		//printing elements of array with one kind of for loop
		for(Object obj:arr) {   
			System.out.println(obj);
			
		}
		
		//printing elements of array with regular for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
