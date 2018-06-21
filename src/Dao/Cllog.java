package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Clog;
import Model.Creg;

public class Cllog {
	public boolean login(Clog cl) 
	{
		System.out.println("at login");
	
	   try {
		Connection conn=null;
	conn=Conn.getConnection();
	PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement("select  * from  clog values where id=? and password=?");
	pstmt.setString(1,cl.ID);
	pstmt.setString(2,cl.Password);
	System.out.println("f");
	ResultSet  rs=pstmt.executeQuery();
	if(rs.next())
	{
		return true;
	}
	else
	{
		return false;
	}
	   }
	
	   catch(Exception e)
	   {
		   return false;
	   }
	}
}