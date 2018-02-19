package org.niit.LoginApp.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.niit.LoginApp.UserDAO.UserDAO;

/**
 * Servlet implementation class UserController
 */

@WebServlet("/UserController")
public class UserController extends HttpServlet {

	RequestDispatcher rd;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
//		System.out.println("Thiis is get method");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         UserDAO userdao=new UserDAO();
         RequestDispatcher rd;
	//	System.out.println("Thiis is post method");
		String id = (String) request.getParameter("email");
		String pass = (String) request.getParameter("password");

		
		// System.out.println(id+pass);
		if(userdao.isValid(id, pass)==true)
		{
			rd=request.getRequestDispatcher("Home.html");
		    rd.forward(request, response);
		}
		else
		{
           PrintWriter pw=  response.getWriter();			
			pw.write("Invalid credentials");
           rd=request.getRequestDispatcher("Login.html");
		    rd.include(request, response);
		}

	}

}
