//Program to understand enum --Here we are assigning and printing the values of enum 
//Java Enum is a special data that enables a variable to be a set of predefined constants
//More precisely, a Java enum type is a special kind of Java class. 

public class EnumTypeTest {
	enum Season{
		WINTER,
		SPRING,
		FALL,
		SUMMER,
	}
	public static void main(String[] args) {
		/*Refering to constants in enum */
		Season s=Season.FALL; //s variable is of the type Season.Season variable can take one of the Season enum constants as value
		Season s1=Season.SPRING;
		Season s2=Season.SUMMER;
		
		//Printing the values of enums
		System.out.println(s);	
		System.out.println(s1);	
		System.out.println(s2);	
		
		}

	}


