import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//This program let us know whether we are able to connect to database succesfully
//Important point is - we added db2 Jar under 'Reference Libraries' for this project
//jar is available at our local desktop under c drivere under dbvisualiser.we used the same jar here
//If not we might need to download from internet

public class JdbcDB2ConnectionTest {

	public static void main(String[] args) {
		String jdbcClassName="com.ibm.db2.jcc.DB2Driver";
        String url="jdbc:db2://DWP3:50001/UC_DSS";
        String user="rvarma";
        String password="Vishnu128";
        
        Connection connection=null;
        try {
        	//Load the driver class
			Class.forName(jdbcClassName);
			
			//create  the connection object  
			connection=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			if(connection!=null) {
				System.out.println("connection successfull");
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
