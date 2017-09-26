//Program to understand regex methods in String
/*Since java regular expression revolves around String, String class has been extended in Java 1.4 
//to provide a matches method that does regex pattern matching. 
//Internally it uses Pattern and Matcher java regex classes to do the processing but obviously it reduces the code lines.
public class StringRegex
*/
/*
 * Strings in Java have built-in support for regular expressions. Strings have four built-in methods for regular expressions, i.e., the matches(), split()), replaceFirst() and replaceAll() methods. The replace() method does NOT support regular expressions.
 */
public class StringRegex {

	public static void main(String[] args) {
		String sentence=new String("This is my small example "+ "string which I'm going to " + "use for pattern matching.");
		System.out.println(sentence.matches("\\w.*"));   //we are using regex expression for String builtin methods
		System.out.println("*********************");
		String[] strArray=sentence.split("\\s+"); //split method returns array of Strings.we are using regex expression for String builtin methods
		for(String str:strArray) {  //using enhanced for loop to print all elements of array
		System.out.println(str);
		}

	}

}
