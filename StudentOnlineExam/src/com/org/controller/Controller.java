package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.Login;
import com.org.model.LoginDAO;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Login lg=new Login();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		lg.setUsername(username);
		lg.setPassword(password);
		System.out.println(username);
		System.out.println(password);
		LoginDAO ld=new LoginDAO();
		String result=ld.loginUser(lg);
		if(result.equals("Success"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			System.out.println("session set");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else
		{
			System.out.println("session not set");
			request.getRequestDispatcher("Login.html").forward(request, response);
		}
	}

}
