//Program to understand finally
//Java finally block is a block that is used to execute important code such as closing connection, stream etc.
//Java finally block is always executed whether exception is handled or not.
//In this program finally is executed even when exception doesn't occur.
public class FinallyTest {

	public static void main(String[] args) {
		
		try {
			int data=25/5;
			System.out.println(data);   //Here  we are not going to catch block
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("finally block is always executed");
		}
		 System.out.println("rest of the code...");  

	}

}
