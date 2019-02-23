package com.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*; 

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DatabaseConnection {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "360logica");
		Statement stmt=(Statement) con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from Employee");
		
		while(rs.next())
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getInt(5)+"    "+rs.getDate(7)+" "+rs.getTime(7));
		con.close();
		
	
	}

}
