/*Testing different variable types*/
/*We have main program in the same class*/
public class VariableTypesTest {
int data=20; //instance variable
static int m=100;  //static variable

int method()
{
int n=30; //local variable	
return n;
}

public static void main(String[] args) {
	VariableTypesTest var=new VariableTypesTest();
	
	//Instance variables need to accessed via object or new instance. Each object has memory allocatied for the variable.
	System.out.println(var.data);
	System.out.println(var.method());
	
	
	//Static variables can be accessed directly from the class or from object. Basically we have only one copy of variable,
	System.out.println(VariableTypesTest.m);
	System.out.println(var.m);
	
}

}
