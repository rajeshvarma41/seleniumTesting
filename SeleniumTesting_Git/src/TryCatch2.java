//Program to understand try catch.  Here we can see that when we have the exception
//We used try catch block and exception it is handled , so the rest of the program continues

public class TryCatch2 {

	public static void main(String[] args) {
	try {
		int i=20/0;
		System.out.println("Rest of code in try block");  //once exception occur next statements in try block are not executed
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("rest of the code"); //this statement is executed even 
											//after the arthimetic exception
	}

}
