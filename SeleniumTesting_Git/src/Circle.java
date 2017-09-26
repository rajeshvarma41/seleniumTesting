/*Circle class models a circle with radius and color*/
public class Circle {
	//public static constants
	public static final double DEFAULT_RADIUS=0.0;
	public static final String DEFAULT_COLOR="red";
	/*Private Instance Variables*/
	private double radius;
	private String color;
	
	//Constructors overloaded
	public Circle()  //1 constructor
	{
		this.radius=DEFAULT_RADIUS;
		this.color=DEFAULT_COLOR;
	}
	
	/*
	 public Circle(double r) //2 constructor
	{
		radius=r;
	}
	 */
	//Instead of using one more variable as above we can use this here.
	public Circle(double radius) //2 constructor
	{
		this.radius=radius;
		this.color=DEFAULT_COLOR;
		
	}
	
	public Circle(double radius,String color) //3rd constructor
	{
		this.radius=radius;
		this.color=color;
	}
	/*Public methods*/
	public double getRadius() {  //gives the radius
		return radius;
	}
	
	public String getColor() //gives the color
	{
		return color;
	}

	//Setter for color as object cannot directly access color because its private
	/*
	public void setColor(String newColor)
	{
		color=newColor;
	}
	*/
	
	//using this 
	public void setColor(String color)
	{
	this.color=color;
	}
	
		
	//Setter for radius as object cannot directly access radius because its private
	
	/*
	public void setRadius(double newRadius)
	{
		radius=newRadius;
	}
	*/
	
	//using this
	public void setRadius(double radius)
	{
	this.radius=radius;
	}
	
	}
	

