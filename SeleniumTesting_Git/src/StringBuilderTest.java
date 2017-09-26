//This is mutable same as String Buffer, but it is non-synchronised which means two threads
//can call string builder simulataneously.
//Note: As String Builder is mutable,we have more methods for String Buffer like append,reverse,insert etc that we dont have in String.
/*To convert String Builder to String we use "toString" method. If we want to compare Strin Builder to String we need to convert to String
 * and the compare
*/
public class StringBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder strb=new StringBuilder("Rekha");
		strb.append("penmetsa");
		System.out.println(strb); //Note here the value is changed which means mutable
		                          //whereas in string immutable example, this didnt happend
		
		
	}

}
