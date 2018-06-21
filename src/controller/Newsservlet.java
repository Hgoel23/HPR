package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.N;

/**
 * Servlet implementation class Newsservlet
 */
public class Newsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 N nn=new N();
		 ResultSet rs;
		 PrintWriter out=response.getWriter();
		 rs=nn.get();
	if(rs!=null)
	{
		try {
			out.print("<html> <body bgcolor=cyan> <font color=black size=40> <center> </center></font></html>");
			do
			{
			out.print(rs.getString(1));
			out.print(rs.getString(2));
			}
			while(rs.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	else
	{
		out.print("No Newss");
	}
	
	
	
	}

}
