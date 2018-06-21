package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.N;
import Model.Clog;
import Model.Newss;

/**
 * Servlet implementation class News
 */
public class News extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Newss n=new Newss();
		 N nn=new N();
		 boolean s;
		n.ID=request.getParameter("Id"); 
		n.News=request.getParameter("text");
		s=N.insertt(n);
		if(s){
			out.print("<html> <body bgcolor=cyan> <font color=black size=40> <center> posted successfully</center></font></html>");
		  }
		else
		{
			out.print("error");
		}
	}

}
