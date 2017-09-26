package filesDatabase;
import java.io.*;
import java.util.Properties;

//Program to understand reading from values from properties file
//Properties are configuration values managed as key/value pairs. In each pair, the key and value are both String values
public class ProperiesTest {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();  //creating properties object
		FileInputStream file = new FileInputStream("C:\\myProject\\SeleniumTesting\\employee.properties"); //creating file object with path. Note we are using double quotes
		prop.load(file); //loading the properties file.
		
		System.out.println("Name is"+prop.getProperty("name")); //note: we are using quotes for name
		System.out.println("City is"+prop.getProperty("city"));
	}

}

