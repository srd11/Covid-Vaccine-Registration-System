
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DBConnection{
    
   public Connection getConnection() {
	   
	   Connection connection=null;
	   System.out.println("Connection called");
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		   connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/vaccine1","root","root");
		}
	   catch(Exception e) {
		   e.printStackTrace();
		   
	   }
	   return connection;
   }
}
