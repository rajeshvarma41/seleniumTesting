//Program to understand break 
//The break statement breaks out and exits the current (innermost) loop.
//Here when i=5, it breaks the loop and completelycomes outside of loop. so value after 4 are not printed.
public class BreakTest {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if (i==5){
				break;
			}
			System.out.println(i);
		}

	}

}
