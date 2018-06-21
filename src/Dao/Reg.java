package Dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import Model.Creg;
import controller.Canreg;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Reg  {
	public boolean insert(Creg c) 
	{
	
	   try {
		Connection conn=null;
	conn=Conn.getConnection();
	
	PreparedStatement pstmt=conn.prepareStatement("insert into creg values(?,?,?,?,?,?,?,?)");
	pstmt.setString(1,c.Name);
	pstmt.setString(2,c.Surname);
	pstmt.setString(3,c.Email);
	pstmt.setString(4,c.Mobile);
	pstmt.setString(5,c.DOB);
	pstmt.setString(6,c.Address);
	pstmt.setString(7,c.Gender);
	pstmt.setString(8,c.Sport);
	int i=pstmt.executeUpdate();
	if(i>0)
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
		System.out.println(e);
		return false;
	}
	
}

}
