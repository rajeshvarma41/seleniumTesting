//This program doesnt work too.In the main you are creating integer objects
//But in function you cannot access the value of integer object as its immutable class i.e
//you cannot find any method to change the value. So within the function when we use the below code
//again we are covnerting to primitive and exchanging, but no way changing the actual object value.
//i.e you cannot use something like a. to change the value 
public class SwapFunctionWrong1 {

	public static void main(String[] args) {
		Integer a=new Integer(54);
		Integer b=new Integer(30);
		//printing values before swapping
		System.out.println(a);
		System.out.println(b);
		swap(a,b);
		
		//printing values after swapping
		System.out.println(a);
		System.out.println(b);
	}

	public static void swap(Integer a,Integer b) {
		int temp=0;
		a=temp;
		b=temp;
		System.out.println("temp value is " +a);
	}
}
