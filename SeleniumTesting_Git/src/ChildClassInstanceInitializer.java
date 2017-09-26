//Program to verif the order of precedecence with Intialization block
//First parent class constructor then Initializer then child class constructor
class ParentClass {
	
	ParentClass() { //constructor of superclass
		System.out.println("Parent Class cosntructor invoked");
	}
	
	
}


public class ChildClassInstanceInitializer extends ParentClass {
	 
	 ChildClassInstanceInitializer() { //child class constructor
		 super();  //parent class constructor -- note we can use use parent constructor only inside child class constructor
		 		   //superclass constructor must always be the first line in the subclass constructor.
		 System.out.println("child class constructor invoked");
	 }
	 
	 //instance intitializer block
	 {
		 System.out.println("Intializer Instance block is invoked.");
	 }
	 //main function
	public static void main(String[] args) {
		ChildClassInstanceInitializer c=new ChildClassInstanceInitializer();
 
	}

}
