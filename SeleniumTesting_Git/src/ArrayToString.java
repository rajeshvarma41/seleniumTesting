//program to convert character array to String and viceversa.
public class ArrayToString {

	public static void main(String[] args) {
		char[] array={'a','m','n'};
		String str=new String("rajesh");
		
		//converting array to string and printing
		String str1=new String(array); //Passing array to String constructor
		System.out.println(str1);
		
		//converting string to array and printing
		char[] array2=str.toCharArray(); //converting to array and storing in different array.
		System.out.println(str.toCharArray()); //printing directly from the converted array.
		System.out.println(array2);
	}

}
