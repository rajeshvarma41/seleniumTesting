//program to understand splitting of sting

package practice;

public class StringSplit {

	public static void main(String[] args) {
		//splitting based on spaces
		String sentence=new String("rajesh is good");
		String[] strArray=sentence.split(" "); //split method returns array of Strings
		for(String str:strArray) {  //using enhanced for loop to print all elements of array
		System.out.println(str);
		}
		
		System.out.println("***********************");
		//splitting bases on #
		String s="#1234";
		String[] strArray1=s.split("#");
		for(String str:strArray1) {  //using enhanced for loop to print all elements of array
			System.out.println("Value is "+ str);
			}
		
	}

}
