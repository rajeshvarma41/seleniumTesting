/*Understanding String Literal vs String Object. Relate this to integer primitve vs integer class
 * charcater primitive vs character class.
 * Note literal and object differ in the way they are stored in memory.Literal is stored in common
   pool whereas object is stored in heap. 
 * In either case literal or object String is immutable.  
*/
public class StringLiteralObject {

	public static void main(String[] args) {
		
		String str1="Rajesh";                 //Implicit construction via StringLiteral
		String str2=new String("Kosuri");    //Explicit constructon via new keyword
		String str3="Rajesh";		
		String str4=new String("Rajesh");
		
		//Comparing two strings using equals. This compares the content of the string
		System.out.println(str1.equals(str3)); //true
		System.out.println(str1.equals(str4)); //true
		
		//Comparing string using ==. This compares the references not values
		System.out.println(str1==str3);//true
		
		System.out.println(str1==str4);//false
		
		//Comparing strings using compareTo() method compares 
		//values lexicographically and returns an integer value that describes
		
		System.out.println(str3.compareTo(str1)); //returns 0
		System.out.println(str1.compareTo(str2)); //returns posistive value
	}

}
