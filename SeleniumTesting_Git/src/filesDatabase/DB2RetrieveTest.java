package filesDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Program to connect to database, execute query and retrieving values to result set
//Next try on coding result set to excel sheet
//Note: Need to add db2.jar file in BuildPath to make the connection work, otherwise you get an error.

public class DB2RetrieveTest {

	public static void main(String[] args) throws Exception {
		String jdbcClassName="com.ibm.db2.jcc.DB2Driver";
		String url="jdbc:db2://DWP3:50001/UC_DSS";
		String user="rvarma";
		String password="Vishnu129";
		
	//Connecting to Database
	Class.forName(jdbcClassName);  //loading the driver class
	Connection connection=DriverManager.getConnection(url,user,password); //creating connection object
	Statement stmt=connection.createStatement();  //creating statement object
	//getting the query results to result set
	ResultSet rs=stmt.executeQuery("select * from UAD_BASE.UAD_CYCLE_B WHERE UAD_CYCLE_B_CYCLE_YR='2016'" ); //Executing the query
	
	//printing the values from result set.
	while(rs.next()) {
		System.out.println(rs.getString(1)+' '+rs.getString(2)+' ' + rs.getString(3)); //we are printing values from first 3 columns
		
	}
	

	}

}
