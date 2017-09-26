//Program to create object from class and accessing its field and methods
public class CarTest {

	public static void main(String[] args) {
		//Here in the below we are passing values to the constructor and initialising some valriables
		Car Toyota=new Car("nissan",3);
		
		//initializing other variables.
		Toyota.scolor="blue";
		Toyota.ihighSpeed=200;
		
		//calliung the methof of a class
		Toyota.DisplayCharacterstics();
	}

}
