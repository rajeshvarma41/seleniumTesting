///*This program appears little tricky. Here in the same file we included three different classes*/
/* Normally not a best practice to do this. We will use seperate files for each class*/
/*Important point to keep in mind is there must be only one public class per .java source file and the name of the file 
 * must match with this public class.*/
/*This is hirerachial inheritance meaning --different classes inheriting from same parent like sibling of same parent*/

class Animal1{  
void eat(){System.out.println("eating...");}  
}  

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal1 {
	void meow() {
		System.out.println("meowing..");
	}
}
public class TestInheritanceHirerarchial {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.meow();
		c.eat();

	}

}
