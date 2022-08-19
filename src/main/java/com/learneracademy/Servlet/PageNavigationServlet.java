package com.learneracademy.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PageNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PageNavigationServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String ToPage = request.getParameter("submit");
		
		
		
		if(ToPage.equalsIgnoreCase("Log In"))
		{
		
		String name = request.getParameter("Username");
		String password =  request.getParameter("Password");
		
		
		
			if(name.equals("Ram") && password.equals("Ram"))
			{
				RequestDispatcher dis = request.getRequestDispatcher("welcome.jsp");
				dis.forward(request, response);
				
			}
			else
			{
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				RequestDispatcher dis = request.getRequestDispatcher("Index.html");
				dis.include(request, response);
				out.println("<center><p style = color:red> Username or Password is incorrect</p></center>");
				 
				
			}
		}else if(ToPage.equalsIgnoreCase("students_List"))
			{
				RequestDispatcher dis = request.getRequestDispatcher("displaystudents.jsp");
				  dis.forward(request, response);
			}
			else
				if(ToPage.equalsIgnoreCase("Teachers_List"))
				{
					RequestDispatcher dis = request.getRequestDispatcher("displayteachers.jsp");
					  dis.forward(request, response);
				}
				else
					if(ToPage.equalsIgnoreCase("Subjects_List"))
					{
						RequestDispatcher dis = request.getRequestDispatcher("displaysubjects.jsp");
						  dis.forward(request, response);
					}
					else
						if(ToPage.equalsIgnoreCase("Show_Report"))
						{

							RequestDispatcher dis = request.getRequestDispatcher("displayclass.jsp");
							  dis.forward(request, response);
						}
		
	}

}
