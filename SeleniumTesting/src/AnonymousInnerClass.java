//program to understand anonymous inner class(called as anonymous class too)
//Here anonymous class created from abstract class

//An anonymous inner class is an inner class that is declared without using a class name at all – and that of course is why it’s called an anonymous class
//An anonymous inner class also has some pretty unusual syntax.
//Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time

abstract class Person {   //Here we are creating abstarct class
	abstract void eat();
}


public class AnonymousInnerClass {

	public static void main(String[] args) {
		/*  Below creates an anonymous inner class:  i.e if we notice with the below code we are basically creating class internally and instantiating*/
		/* Otherwise there is no way we can use the below code without creating first subclass for abstract class and implemeting abstract method */
		Person p=new Person() {   
			void eat() {System.out.println("nice fruits");};
		};
p.eat();
	}

}
