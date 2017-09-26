//This is to test Circle class by creating new circles with constructors
//Created setters for accessing private variables.
public class CircleTest {

	public static void main(String[] args) {
		//Here we are using different constructors to create different circles.
		//creating first cirlce
		Circle c1=new Circle();
		System.out.println("radius of circle is "+c1.getRadius());
		System.out.println(("color of circle is "+c1.getColor()));
		
		
		//Creating 2nd circle
		Circle c2=new Circle(20);
		System.out.println("radius of circle is "+c2.getRadius());
		System.out.println(("color of circle is "+c2.getColor()));
		
		//creating 3rd cirlce
		Circle c3=new Circle(20,"blue");
		System.out.println("radius of circle is "+c3.getRadius());
		System.out.println(("color of circle is "+c3.getColor()));
		
		
		
		//c1.radius=20;       //this cant be done as radius is declared private. 
		//c1.color="Blue"  //this can to be done as color was declared private 

		c1.setColor("green"); //we are accessing via setters that we creaded in Circle class
		c1.setRadius(1000); //we are accessing via setters that we creaded in Circle class

	}

}
