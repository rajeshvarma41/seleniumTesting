//program to understand wrapper class
//Wrapper class in java provides the mechanism to convert primitive into object and object into primitive
//Since J2SE 5.0, autoboxing and unboxing feature converts primitive into object and object into primitive automatically. The automatic conversion of primitive into object is known as autoboxing and vice-versa unboxing.
public class WrapperClass {

	public static void main(String[] args) {
		//Converting Integer to int (i.e converting wrapper to primitive)
		
		Integer a=new Integer(30);
		int i= a.intValue();
		System.out.println("Primitive value is" + i);
		
		//Converting int to Integer(i.e converting primitive to wrapper
		
	    int x=80;
	    Integer m= Integer.valueOf(a);
	    System.out.println("Wrapper value is " + m);

	}

}
