//This will not work too eventhoight we are using objects here
// Here we are passing value of Object references. i.e we are creating new copies X and Y
//that hold the object references. We are exchanging the object refernces in the copies x and y,
//but original ones in main function stays same
//so baiscally using the reference of obeject we should be able to manipulate the value to make it work. So array might work or using object might 
//work as not sure how using string builder reference we can manipulate values.

public class SwapFunctionWrong3 {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("raj");
		StringBuilder b=new StringBuilder("do");
		//printing values before swapping
		System.out.println(a);
		System.out.println(b);
		swap(a,b);
		
		//printing values after swapping
		System.out.println(a);
		System.out.println(b);
	}

	public static void swap(StringBuilder x,StringBuilder y) {
		StringBuilder temp=new StringBuilder("");
		temp=x;
		x=y;
		y=temp;
		System.out.println("Value of  x is " +x);
		System.out.println("Value of  y is " +y);
	}
}
