import java.io.IOException;
//program to understand checked exceptions
//A Java method must declare in its signature the types of checked exception it may "throw" from its body, via the keyword "throws".
//Note that throws is a declaration
public class CheckedException1 {
	
	void m() throws IOException  {
		throw new IOException("I/o error");  //checked exception via throw
	  										 //Once we have throw keyword you should declare "throws" in decalration or sorround with try/catch
											 //Otherwise it gives error
	}
	
	void n() throws IOException {
	m();
	}
	
	void p() {
		try {
			n();
		} catch (IOException e) {
			
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		CheckedException1 obj=new CheckedException1();
		obj.p();
		System.out.println("normal flow...");  

	}

}
