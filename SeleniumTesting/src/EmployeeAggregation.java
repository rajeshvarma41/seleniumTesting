//Progrma to understyand Aggregation example.
//Aggregation is basically HAS A RELATIONSHIP
public class EmployeeAggregation {

int id;   //instance variables
String name;
Address address;  
				 //	Employee has an object of Address, address object contains its own informations such as city, state, country

//constructor
public EmployeeAggregation(int id,String name,Address address) {
	this.id=id;
	this.name=name;
	this.address=address;
}

//method of employee

void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  

//main function
public static void main(String[] args ) {
	Address address1=new Address("SantaClara","CA","US");  //creating address objects
	Address address2=new Address("fremont","CA","US");
	
	EmployeeAggregation e1=new EmployeeAggregation(20,"rajesh",address1);       //creating employee objects using the address objects
	EmployeeAggregation e2=new EmployeeAggregation(30,"Mister",address2);
	
	//printing employee details
	
	e1.display();
	e2.display();
}

}
