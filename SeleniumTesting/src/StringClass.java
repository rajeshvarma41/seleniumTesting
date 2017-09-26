//In Java String is a class and not data type.
public class StringClass {
	
	public static void main(String[] args) {
	//declaring sting in simple way..the compiler creates a String object with its value here
	String greeting="Hi Darling, how are you";
	
   //declaring string in regular way
	
	String s1=new String("Hi this is also a string");
		//printing the value of string

	System.out.println(greeting);
	
	//Using methods of string..As string is class we can use methods.
	System.out.println(greeting.length());
	System.out.println(s1.toUpperCase());
}
}
