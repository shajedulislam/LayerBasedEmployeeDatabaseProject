package com.EmployeeDatabase.EmployeeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	
	Connection con = null;
	String conUrl = null;
	
	public DataSource()
	{
		conUrl = "jdbc:sqlserver://localhost:1433;databaseName=EmployeeDB;integratedSecurity=true;";
	}
	
	public Connection createConnection()
	{
		try
		{
			con = DriverManager.getConnection(conUrl);
		}
		catch(Exception e)
		{
			
		}
		return con;
		
	}

}
