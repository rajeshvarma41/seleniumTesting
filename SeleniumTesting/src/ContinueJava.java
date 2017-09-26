//program to understand continue
//The continue statement aborts the current iteration and continue to the next iteration of the current (innermost) loop.
//i.e at specific condition skips the remaining code at current iteration and will continue with next iteration

public class ContinueJava {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {    
				continue; //when i=5 current iteration is aborted and so next line of printing is aborted, but next iteration will continue.
			}
			System.out.println(i);
		}

	}

}
