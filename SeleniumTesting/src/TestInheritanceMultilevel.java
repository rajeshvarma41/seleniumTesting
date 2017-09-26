/*This program appears little tricky. Here in the same file we included three different classes*/
/* Normally not a best practice to do this. We will use seperate files for each class*/
/*Important point to keep in mind is there must be only one public class per .java source file and the name of the file 
 * must match with this public class.*/
/*This is multilevel whichis like accessing from grandfather. Multiple inheritance not supported in Java i.e one child cannot have two parents*/


class Bird{  //Bird class
		void eat(){
			System.out.println("eating");
		}
		
	}

	class Crow extends Bird{ //this class extends the Bird class
		void bark(){
			System.out.println("crowing...");
		}
	}
	
	class BabyCrow extends Crow {  //this one extends crow class
		void weep() {
			System.out.println("weeping...");
		}
	}
public class TestInheritanceMultilevel {

	
	public static void main(String[] args) {
		BabyCrow d=new BabyCrow(); 
		d.bark();   
		d.eat();           //here we are able access methods from all parent classes due to inhertance
		d.weep();
	}
			
			

}
