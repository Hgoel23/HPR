package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.http.HttpServlet;

public class Conn extends HttpServlet {

	public static Connection getConnection()
	{
		Connection conn=null;
	try
	{
		
		Class.forName("org.h2.Driver");
	    conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/HPR","sa","sa");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return conn;
	
	
}
}
