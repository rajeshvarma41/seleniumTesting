//Program to understand that Arrays can hold objects also.

class Student1 { //Student class
	int rno;   //instance variables
	String name; 
	
	public Student1(int rno,String name) { //constructor
		this.rno=rno;
		this.name=name;
	}

	
}

public class ArrayObjects {

	public static void main(String[] args) {
				
		//creating Student1 objects from above Student class
		Student1 std1=new Student1(100,"Rajesh");
		Student1 std2=new Student1(200,"Silpa");
		

		//Array delcaration. Here as this array stores student object , we are declaring this way
		Student1[] stdArray=new Student1[2]; //array of size 2
		
		//Storing student objects in an array
		stdArray[0]=std1;
		stdArray[1]=std2;
		
		for (int i=0;i<2;i++) {
			System.out.println(stdArray[i].name);
		}

	}

}
