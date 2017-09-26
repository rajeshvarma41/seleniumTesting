//Program to understand primitive integer type and IntegerClass
public class IntgegerDataType {

	public static void main(String args[]) {
		
		//primitive integer datatype
		
		int i=567;
		
		//Using Integer class
		//one way of declartion using Interger class
		Integer myInteger;
		myInteger=new Integer(10);
		
		//second way of declaration using Integer class
		Integer myInt=new Integer(33);
		
		//printing using primitive type
		System.out.println(i);
		
		//printing using the interger class
		System.out.println(myInteger.intValue());
		
		//When we use IntegerClass we have lot of methods that we can use
		System.out.println(myInteger.intValue());
		System.out.println(myInteger.byteValue());
		System.out.println(myInt.getClass());
		
		
		
	}
}
