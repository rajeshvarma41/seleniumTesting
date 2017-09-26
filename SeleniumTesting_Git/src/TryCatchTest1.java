//Program to understand trycatch.Here we didnt use try catch and see the flow
//Note: Here once we had the exception. code stopped abrupty and rest of the code didnt execute
//The JVM firstly checks whether the exception is handled or not. 
//Here exception is not handled , so Prints out exception description and program is terminated
public class TryCatchTest1 {

	public static void main(String[] args) {
		int i=20/0;
		System.out.println("rest of the code");

	}

}
