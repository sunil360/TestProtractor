import java.sql.*; 

import com.mysql.jdbc.Connection;

public class MySqlConnection {

	public static void main(String args[]) throws ClassNotFoundException{  
		Connection conn = null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root"); 
		Statement stmt=conn.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from Employee");  
		while(rs.next()) 		
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		conn.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
		}  
		
	
	}

