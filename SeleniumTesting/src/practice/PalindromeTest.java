////Program to check palindrome - here not using functions (with functions is easy as no statements execute after return)
package practice; 

public class PalindromeTest {

	public static void main(String[] args) {
		String str="abttbn";//length=6
		int strLength=str.length();
		int i;
		int begin,end,middle;
		begin=0;
		end=strLength-1; //end=5
		middle=(begin+end)/2; //middle=2
		for(i=0;i<=middle;i++)  {
			if(str.charAt(i)!=str.charAt(end-i)) {
				break;
			}
		}
		
		if (i==middle+1) { //Imp: Once it comes out of value i will be 3 as increment happens after loop execution
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

		
}
