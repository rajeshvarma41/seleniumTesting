//Program to understand inner class-- Non-static nested classes are called inner classes.
//A non-static class that is created inside a class but outside a method is called member inner class.
/*Important:  Nested classes are divided into two categories: static and non-static. 
 * Nested classes that are declared static are called static nested classes. Non-static nested classes are called inner classes.
*/
public class InnerClassTest {  //this is outer class
	
	private int data=30;
	class Inner {  //this is inner class
		void msg() { System.out.println("data is"+data);}
	}

	public static void main(String[] args) {
		
		InnerClassTest obj=new InnerClassTest();   //creating object of the outer class
		InnerClassTest.Inner obj1=obj.new Inner(); //creating object of the inner class
		obj1.msg();
	}

}
