/*Program to understand singleton design pattern..This program creates singleton class*/
/*Singleton pattern helps us to keep only one instance of a class at any time
 * Singleton's purpose is to control object creation, limiting the number of objects to only one. 
 * Since there is only one Singleton instance, any instance fields of a Singleton will occur only once per class, just like static fields. 
 * Singletons often control access to resources, such as database connections or sockets.
  */
/*--------Important Steps for implementing Singleton Pattern---------
 * Create Private constructor to restrict instantiation of the class from other classes.
 * Private static variable of the same class that is the only instance of the class.
 * Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
 * */
public class SingletonHello {
	
	//Creating private Static variable
	private static SingletonHello instance=null;  //this is of type classname as it holds the class instance
	
	//Creating private Constructor
	private SingletonHello() {
		//nothing inside this. exists only to defeat instantiation
		
	}
	
	//Creating Public static method that returns the instance of the class
	public static SingletonHello getInstance() {//this one returns the instance of type classname and we can create instance only with this method outside of the class as constructor is private
		if(instance==null){
			instance=new SingletonHello();
		}
		
		return instance; 
	}
	
	//This is just a regular method in the class
	public String hello() {
		String str="hello Boss. this is method in singleton class";
		return str;
	}
}

	


