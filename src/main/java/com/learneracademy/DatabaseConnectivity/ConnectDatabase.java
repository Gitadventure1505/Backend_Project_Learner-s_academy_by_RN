package com.learneracademy.DatabaseConnectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase 
{
	
	Connection connect;
	
		
	public Connection getConnection()
	{
			
		try 
		{
	

		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learners_academy", "root","root12345");	

			
		this.connect = conn;
	
		
		}
		catch(Exception e)
		{
		System.out.println(e);				
		}
		return this.connect;
		
}
	
	
		public void closeConnection() throws SQLException
		{
			if(this.connect !=null) 
			{
				this.connect.close();

			
		 }

		}
	
}
