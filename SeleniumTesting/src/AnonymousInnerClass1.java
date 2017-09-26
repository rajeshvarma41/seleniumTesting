//program to understand anonymous inner class(called as anonymous class too)
//Here anonymous class created from interface

interface Hello{
	void greet();
	void greetSomeone(String someone);
	
}

public class AnonymousInnerClass1 {

	public static void main(String[] args) {
		/*  Below creates an anonymous class:  i.e if we notice with the below code we are basically creating class internally and instantiating*/
		/* Otherwise there is no way we can use the below code without creating first class that implements interface */
		Hello englishgreet=new Hello() {
			
			public void greet() {
				System.out.println("Hello Dear");
				
			}
						
			public void greetSomeone(String someone) {
				System.out.println("Hello Dear"+ someone);
				
			}
			
		};
		
		//printing the value
		englishgreet.greet();
		englishgreet.greetSomeone("rajesh");

	}

}
