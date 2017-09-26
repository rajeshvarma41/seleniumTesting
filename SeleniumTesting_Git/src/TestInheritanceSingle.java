//Inheritance is deriving a new class based on the existing class-- IS A RELATIONSHIP
/*This program appears little tricky. Here in the same file we included three different classes*/
/* Normally not a best practice to do this. We will use seperate files for each class*/
/*Important point to keep in mind is there must be only one public class per .java source file and the name of the file 
 * must match with this public class.*/

class Animal{  //Animal class
	void eat(){
		System.out.println("eating");
	}
	
}


class Dog extends Animal{ //this class extends the animal class
	void bark(){
		System.out.println("barking...");
	}
}


public class TestInheritanceSingle {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();       //we were able to access method in animal class due to inheritance.
		d.bark();    

	}

}
