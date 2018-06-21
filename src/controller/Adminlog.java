package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Alog;

/**
 * Servlet implementation class Adminlog
 */
public class Adminlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	Alog al=new Alog();
	PrintWriter out=res.getWriter();
	al.uname=req.getParameter("uname"); 
	al.pwd=req.getParameter("pwd"); 
	if(al.uname.equals("niit")&&(al.pwd.equals("admin")))
	{
		
		res.sendRedirect("tournament.html");
		
	}
	else
	{
		res.sendRedirect("error.html");
	}
	}

}
