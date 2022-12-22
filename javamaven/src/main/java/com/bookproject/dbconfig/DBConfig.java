package com.bookproject.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("couldn't able load the driver");
		}
	}
	public static Connection makeConnection() throws SQLException
	{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","SumaiyaSultana@22");
		
	}
	

}