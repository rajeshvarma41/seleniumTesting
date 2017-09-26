//Program to count total number of words in a string

package practice;

public class WordCountTest {

	public static void main(String[] args) {
		String s="Rajesh is a good boy and has beautiful wife with intelligent daughter";
		int count=1;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Total number of words in the string is " +count);
	}

}
