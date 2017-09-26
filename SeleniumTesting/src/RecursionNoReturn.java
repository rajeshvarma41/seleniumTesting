//program to understand recursion.
//here we are not returning anything in the function
public class RecursionNoReturn {
	
	static int count=0; //class variable used so this value keeps increasing
	
	static void p() {  //we are using static function, so we need not create object to invoke this.
		
		count++;
		if (count<=5) {
			System.out.println("hello"+count);
			p();
		}
	}

	public static void main(String[] args) {
		p();

	}

}
