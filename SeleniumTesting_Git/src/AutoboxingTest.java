//Program to understand autoboxing
//The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing or autoboxing
//This is the new feature of Java5. So java programmer doesn't need to write the conversion code
public class AutoboxingTest {

	public static void main(String[] args) {
		int a=30;
		Integer a1=new Integer(a); //Boxing..i.e converting primitive type to wrapper class
		Integer a2=6;   //Boxing
		
		System.out.println(a1+a2);

	}

}
