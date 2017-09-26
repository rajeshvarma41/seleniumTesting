//Writing program to understand calling methods
public class MethodArea {

	public static void main(String[] args) {
		double r=33.2, area, area1;
		area =getArea(r);  //Here r is actual paramaeter
		//Calling method
		System.out.println("Area of Circle is"+area);
		
		//calling method again
		area1=getArea(22);
		System.out.println("Area of circel is "+area1);
		
		//calling method again
		System.out.println("Area of circle2 is" + getArea(3.3));
		
	}
	
	//Method Definition
	//Note: here we used static for the method which means its a class method
	//so it can be called directly. If we dont put static we cannot call unless we create instance of it
	public static double getArea(double radius) { //here radius is formal parameter
		return radius*radius*Math.PI;
		
	}

}
