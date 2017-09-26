//program to create a class name Car that has fields and methods

public class Car {
	//class member variables or fields
String smodel;
int igear;
int ihighSpeed;
String scolor;


//Constructor with values passed
public Car(String model,int gear)
{
	smodel=model;
	igear=gear;
}

//methods of a class
public void DisplayCharacterstics() {
	System.out.println("Model of the car is " + smodel);
	System.out.println("Number of gears in car is " + igear);
	System.out.println("Hight speed of the car is " + ihighSpeed);
	System.out.println("Color of the car is " + scolor);
	
}


}
