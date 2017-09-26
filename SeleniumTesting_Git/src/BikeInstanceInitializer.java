//Class created to understand Instance Initializer example
//Important to note instance initializer is called before the constructor. thats why here method in constructor makes sense
//Order would be Super() constructor->then Instance Initializer->child constructor

public class BikeInstanceInitializer {
	
	int speed;  // instance variables
	
	BikeInstanceInitializer() { //constructor
		System.out.println("speed of yhe bike is"+speed);
	}
	
	//instance initializer block
	{
		speed=100;
	}
	
public static void main(String[] args) {
	BikeInstanceInitializer b1=new BikeInstanceInitializer();
	BikeInstanceInitializer b2=new BikeInstanceInitializer();
	
}

}
