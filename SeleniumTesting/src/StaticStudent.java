
//Program to understand static variable.
//static variable gets memory only once in class area at the time of class loading.
public class StaticStudent {
	
	int rollno;
	String name;
	static String college="Gowtham"; //this is static variable
	
	//constructor
	public StaticStudent(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	//public methods
	void display(){
		System.out.println(rollno+name+college);
	}
	
	public static void main(String[] args) {
		//creating students
		StaticStudent s1=new StaticStudent(20,"Rajesh");
		StaticStudent s2=new StaticStudent(30,"Rekha");

	

	//printing the values
	s1.display();
	s2.display();
	}
}
