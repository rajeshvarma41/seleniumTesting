//program to understand abstract method and abstarct class
//Class that has atleast one abstract method is called abstract class
//Method thats delcared abstart doesnt have implementation. abstratc method has abstract keyword in signature
//An abstract class is incomplete in its definition, since the implementation of its abstract methods is missing. Therefore, an abstract class cannot be instantiated. In other words, you cannot create instances from an abstract class (otherwise, you will have an incomplete instance with missing method's body).
//To use an abstract class, you have to derive a subclass from the abstract class. In the derived subclass, you have to override the abstract methods and provide implementation to all the abstract methods. The subclass derived is now complete, and can be instantiated

abstract class Bike { //abstract class
	
	Bike() { //constructor
	System.out.println("Bike is created");
	}
	
	void changeGear() {  //method of class
		System.out.println("Gear changed");
	}
	
	abstract void run();   //abstract method
	}

class Honda extends Bike { //subclass cretaed from abstract class
	void run() { //we need to implement method of the abstract class here
		System.out.println("Bike is running safely.--");
	}
	
}



public class AbstractClassTest {

	public static void main(String[] args) {
		Bike obj=new Honda(); //we are creating honda object but the type was assigned Honda 
		obj.changeGear(); //we are accessing regular method of abstract class
		obj.run(); //we are accessing implemented abstract method
	}

}
