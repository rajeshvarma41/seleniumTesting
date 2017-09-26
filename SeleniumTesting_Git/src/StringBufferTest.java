//Basic purpose of String buffer is, its mutable i.e value can be changes unlike String
//Thats the reason we have more methods for String Buffer like append,reverse,insert etc that we dont have in String.
/*To convert String Buffer to String we use "toString" method. If we want to compare String Buffer to String we need to convert to String
  and the compare
 */

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer strb=new StringBuffer("rajesh");
		strb.append("varma");
		System.out.println(strb);  //Note here the value is changed which means mutable
								//whereas in string immutable example, this didnt happend
		
	}

}
