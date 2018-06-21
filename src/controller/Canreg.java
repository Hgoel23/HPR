package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Reg;
import Model.Creg;

/**
 * Servlet implementation class Canreg
 */
public class Canreg extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();// TODO Auto-generated method stub
	Creg c=new Creg();
	Reg reg=new Reg();
	boolean s;
	c.Name=request.getParameter("name");
	c.Surname=request.getParameter("surname");
	c.Email=request.getParameter("email");
	c.Mobile=request.getParameter("mob");
	c.DOB=request.getParameter("date");
	c.Address=request.getParameter("add");
	c.Gender=request.getParameter("gender");
	c.Sport=request.getParameter("sport");
	s=reg.insert(c);
	if(s){
		out.print("<html> <body bgcolor=cyan> <font color=black size=40> <center> successfull</center></font></html>");
	  }
	else
	{
		out.print("unssfjs");
	}
	}
	

}
