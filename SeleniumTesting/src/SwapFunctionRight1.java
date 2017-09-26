////Program works for swapping values. Here we are passing object reference to function and using object reference we are manipulating the value of array.
public class SwapFunctionRight1 {
	
	int a;  //instance variables.
	int b;

	public static void main(String[] args) {
		
		SwapFunctionRight1 swapObj=new SwapFunctionRight1();  //creating new instance or object
		swapObj.a=20;
		swapObj.b=30;
		
		//printing before swap
		System.out.println(swapObj.a);
		System.out.println(swapObj.b);
		
		swap(swapObj);  //we are passing instant reference to function
		
		//printing after swap
		System.out.println(swapObj.a);
		System.out.println(swapObj.b);
	}

	public static void swap(SwapFunctionRight1 swapObject) {
		int temp=0;
		temp=swapObject.a;
		swapObject.a=swapObject.b;
		swapObject.b=temp;
		
	}
	
	

}
