package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Cllog;
import Model.Clog;

/**
 * Servlet implementation class Canlog
 */
public class Canlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Canlog() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Clog cl=new Clog();
		Cllog cll=new Cllog();
		PrintWriter out=response.getWriter();
		boolean s;
		cl.ID=request.getParameter("uname");
		cl.Password=request.getParameter("pwd");
		System.out.println("f");
		s=cll.login(cl);
		System.out.println(s);
		System.out.println("f");
		if(s){
			System.out.println("fs");
			response.sendRedirect("page.html");
		  }
		else
		{
			response.sendRedirect("error.html");
		}
		}
		

		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	}

