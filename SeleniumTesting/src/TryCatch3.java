//Program to understand try catch.  Here we can see that when we have the exception
//Here eventhough we used try catch block exception is not handled. So program doesnt continue and terminates
public class TryCatch3 {

	public static void main(String[] args) {
		
		try {
			int data=25/0;
		} catch (NullPointerException e) { //Important here is eventhough we put catch block here, it catches only
						                   //null pointer exception, but here the exception we got is Arthimetic exception
			
			e.printStackTrace();
		}
		
		System.out.println("rest of the program continues");  //this line will not be executed as catch didnt catch the expressions

	}

}
