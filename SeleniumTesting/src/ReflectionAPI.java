//In Java,process of analysing and modifying all the capabilities of a class at runtime is called Reflection
//Reflection API in Java is used to manipulate class and its members which include fields, methods, constructor, etc. at runtime.

//Program to create the object of the class "Class".Once we have the object of the "Class" we
//can get complete information about any class like metadata of variables, metadata of methods etc.
//There are 3 ways to create object of the class 'Class'
public class ReflectionAPI {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//1 - By using Class.forname() method
		Class c1=Class.forName("ReflectionAPI");
		
		//2- By using getClass() method
		ReflectionAPI obj=new ReflectionAPI(); //crearting objection firsy
		Class c2= obj.getClass();
		
		//3 - By using .Class method
		Class c3=ReflectionAPI.class;
		
		
	}

}
