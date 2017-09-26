//This program doesnt work as java is pass by value.Here values are passed to function
//Values are changed inside the function, but values in main program are not swapped.
public class SwapFunctionWrong {

	public static void main(String[] args) {
		int a=54;
		int b=32;
		//printing values before swapping
		System.out.println(a);
		System.out.println(b);
		swap(a,b);
		
		//printing values after swapping
		System.out.println(a);
		System.out.println(b);
	}

	public static void swap(int a,int b) {
		int temp=0;
		a=temp;
		a=b;
		b=temp;
	}
}
