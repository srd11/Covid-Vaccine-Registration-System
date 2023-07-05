

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JavaMySQLConnection {
    
    Connection con;
    public String name1,password1;
    Connection connect()
    {
       
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3307/vaccine1","root","root");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return con;
    }

    
    
    public boolean getData(String name,String gender,String yearofbirth,String number)
    {
    	boolean result=false;
    	try
    	{
    		con=connect();
            PreparedStatement ps=con.prepareStatement("insert into registermem values(?,?,?,?)");
           // PreparedStatement ps1=con.prepareStatement("insert into pending values(?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, yearofbirth );
           // ps.setString(4, Idproof);
            ps.setString(4, number);
           
          //  ps.setString(5, phoneno);
            int i=ps.executeUpdate();
            if(i>0)
            {
                result=true;
            }
            else
            {
                result=false;
            }
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	return result;
    }
    
     
    
    
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
	    return new java.sql.Date(date.getTime());
	}
  
    public boolean getData(String place,String vaccine, java.util.Date date )
    {
    	
    	java.sql.Date date1 = convertJavaDateToSqlDate(date);
    	boolean result=false;
    	try
    	{
    		//java.sql.Date date1 = (java.sql.Date) date;
    		//java.sql.Date date1 = java.sql.Date.valueOf(date);
    		con=connect();
    		//java.util.Date date1= date;
            PreparedStatement ps=con.prepareStatement("insert into placeandvenue1 values(?,?,?)");
            ps.setString(1,place);
            ps.setString(2, vaccine);
            ps.setDate(3,date1);
          //  ps.setString(4, number);
         
            int i=ps.executeUpdate();
            if(i>0)
            {
                result=true;
            }
            else
            {
                result=false;
            }
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	return result;
    }
    
    
    public boolean validateData(String name,String password) {
    	boolean result=false;
		try {
			
	    	con=connect();
	        PreparedStatement ps=con.prepareStatement("select name,password from admin");
	        
	        ResultSet rs;
			rs = ps.executeQuery();
			 while(rs.next())
		        {
		          if(name.equals(rs.getString("name"))&& password.equals(rs.getString("password"))) {
		        	  result=true;
		          }
				
		        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
       
    	return result;
    }  
   
 
}
