//In this program finally is executed even when exception occurs and is not handled
//Note here eventhough we used try catch here catch didnt catch the exception. We got arthimetic expression 
//But we are expecting nullpointer exception in catch

public class FinallyTest3 {

	public static void main(String[] args) {
		
		try {
			int data=25/0;
		} catch (NullPointerException e) { //Important here is eventhough we put catch block here, it catches only
            //null pointer exception, but here the exception we got is Arthimetic exception
			
			e.printStackTrace();  
		}
		
		finally {
			System.out.println("finally block is always executed"); //this will be executed irrespective of whether catch caught the exception or not.
																	//This is printed and after this was printed it showsexception and program is terminated	
		}
		
		System.out.println("rest of the code"); //this will not be excuted as catch didnt catch the arthmetic expression program is terminated
	}

}
