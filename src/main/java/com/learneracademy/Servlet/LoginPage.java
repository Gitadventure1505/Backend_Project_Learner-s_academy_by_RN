package com.learneracademy.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginPage() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String name = request.getParameter("Username");
		String password =  request.getParameter("Password");
		
		System.out.println(name+password);
		
		if(name.equals("Ram") && password.equals("Ram"))
		{
			RequestDispatcher dis = request.getRequestDispatcher("Welcome");
			dis.forward(request, response);
			
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			System.out.println("wrong password");
			
			
			  RequestDispatcher dis = request.getRequestDispatcher("Index.html");
			  dis.include(request, response);
			 
			out.println("<center><p style = color:red> Username or Password is incorrect</p></center>");
		}
		
	}

}
