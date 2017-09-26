//Here we are reversing this in a way javascript does. not better approach.
package practice;

public class StringReverse {

	public static void main(String[] args) {
		String str1="Rajesh";
		String str2="";
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
			
		}
		System.out.println(str2);
	}

}
