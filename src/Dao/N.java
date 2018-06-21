package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Clog;
import Model.Newss;

public class N {
	public static boolean insertt(Newss n)
	{
		
	 try {
			Connection conn=null;
		conn=Conn.getConnection();
		PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement("insert into   News values (?,?)");
		pstmt.setString(1,n.ID);
		pstmt.setString(2,n.News);
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
		 return false;
	 }
	}
	 public  ResultSet get()
	 {
		 try{
			 Connection conn=null;
				conn=Conn.getConnection();
				PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement("select * from  News ");
				ResultSet  rs1=pstmt.executeQuery();
				if(rs1.next())
				{
				return rs1;
				}
				else
				{
					return null;
				}
				   
			
		 }
		 catch(Exception e)
		 {
			 return null;
	 }
}
}
