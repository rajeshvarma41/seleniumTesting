/*Program to understand string immutable. i.e Once created contents cannot be modified
 * eventhough it looks like you are using method.It doesnt update the string.It creates new string.
 * Note that all wrapper classes are immutable i.e Integer class, Character class -- etc. 
 * But not primitive datatypes.
*/
public class StringImmutable {

	public static void main(String[] args) {
		String s="Sachin";
		s.concat("Tendular");
		System.out.println(s);  //Note this prints only Sachin as string is immutable.
	}

}
