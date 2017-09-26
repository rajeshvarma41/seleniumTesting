//Program to understand method overriding
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.
//Method overriding is used to provide specific implementation of a method that is already provided by its super class.
public class BikeMethodOverriding extends Vehicle{

	void run(){    //this method has same name as that of super class.
					//providing specific implementation of run() method in subclass.
	System.out.println("Bike is running");
	
	}
	public static void main(String[] args) {
		
		BikeMethodOverriding bike=new BikeMethodOverriding();
		bike.run();
		
		 
	}

}
