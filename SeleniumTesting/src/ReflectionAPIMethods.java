import java.lang.reflect.Field;

//Once we have the object of the "Class" we can get complete information about any class like metadata of variables, metadata of methods etc.
//Program to understand  methods of "Class". Similarly there can be many methods
public class ReflectionAPIMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c1=Class.forName("Circle"); //creating onject of the "Class".Here inside braces we can provide any class name that you want information about
		
		System.out.println(c1.isInterface()); //this method will show let us whether this is interface or not
		
		//Method that gives details of fields
		System.out.println("Displaying fields of the class");
		Field[] f=c1.getFields();
		for(Field field:f) {
			System.out.println(field.getName());
		}
	}

}
