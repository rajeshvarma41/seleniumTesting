//Program to understand checked exceptions
// subclasses of Error and RuntimeException are known as unchecked exceptions
//For example, a "divide by 0" triggers an ArithmeticException, array index out-of-bound triggers an ArrayIndexOutOfBoundException, which are really programming logical errors
//These exceptions are not checked by the compiler, and hence, need not be caught or declared to be thrown in your program
public class UnCheckedException {

	public static void main(String[] args) {
		
		try {
			int data=25/0;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("rest of program continues");
	}

}
