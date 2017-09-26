//Program to understand super class
//Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
/*
 * Note: A static method which belongs to the class and not to the object(instance). It  can access only static data. It can not access non-static data (instance variables). It can be accessed directly by the class name and doesn’t need any object.

this keyword can be used to refer current class instance variable. http://www.javatpoint.com/this-k...

super is used to refer immediate parent class instance variable. 
http://www.javatpoint.com/super-...

Eventually both this and super keyword refers to instance variables. So a static method cannot refer to “this” or “super” keywords.
 */
public class SubClass extends SuperClass{

	public void printMethod() {
		super.printMethod();    //Here we are accessing method of parent class using super keyword
		System.out.println("printing in subclass");
	}
	public static void main(String[] args) {
		
		SubClass s=new SubClass(); 
		s.printMethod();
		
		//We cannot use super. in this method as super cannot be used in static context. Refer to the note above
	
	}

}
