package com.eidiko.niranjana.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConClassService {
	private static Connection con;
	static
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver()");
	}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
		con=DriverManager.getConnection("jdbc:mysql:///projecteidiko","root","root");
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
