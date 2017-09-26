/*Progam to access singleton class and creating one instance of class--We have Singleton class that has implementation and we are testing with main method here*/
public class SingletonHelloTest {

	public static void main(String[] args) {
		
		//Singleton instance=new Singleton(); --you cannot use this as constructor in Singleton class is private
		
		SingletonHello singInst=SingletonHello.getInstance(); //creating instance of class
		
		System.out.println(singInst.hello()); //printing using method in singleton class
		
		SingletonHello singInst1=SingletonHello.getInstance(); //here ists not creating second instance. Just returning the existing instance that it created above
		System.out.println(singInst.hello());
		
		if(singInst==singInst1) {  //here we are comparing references
			System.out.println("equal");
		}
	}

}
