//In this program finally is executed even when exception occurs and is handled
public class Finallytest1 {

	public static void main(String[] args){
		
		try {
			int data=25/0;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("Fianlly block is always executed");
		}
		
		 System.out.println("rest of the code...");  
	}
}
