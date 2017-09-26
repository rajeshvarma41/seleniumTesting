package collections;
import java.util.ArrayList;
import java.util.Iterator;



//Program to understand arraylist where we are storing user defined objects

class Student1{ //this is student class
	int sno;
	String name;
	int age;
//constructor of Student class
	public Student1(int sno,String name,int age) {
		this.sno=sno;
		this.name=name;
		this.age=age;
	}
	
	
	
}
public class ArrayListUserObjects {

	public static void main(String[] args) {
		//creating student objects
		Student1 s1=new Student1(10,"rajesh",35);
		Student1 s2=new Student1(20,"Johny",60);
		Student1 s3=new Student1(30,"Jim",50);
		
		//creating an arraylist and adding student objects to array list
		ArrayList<Student1> arrlst=new ArrayList<Student1>(); //we used Student generic to restirtc arraylist to hold only Student Objects
		arrlst.add(s1);
		arrlst.add(s2);
		arrlst.add(s3);
		
		//traversiong through array and printing elements using for loop
		for(Student1 obj:arrlst) {
			System.out.println(obj.sno+obj.name+obj.age);
		}
		
		//traversing through array and printing using iterator
		Iterator itr=arrlst.iterator();
		while(itr.hasNext()) {
			Student1 obj=(Student1) itr.next(); //note here we are type casting obj type to Student.For primitive types automatic unboxing happens and so we need not use this. 
												// complier gives suggestion and we can do this as compiler 
												//dont worry much. Its easy
			System.out.println(obj.sno+obj.name+obj.age);
		}
	}

}
