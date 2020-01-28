package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.AdminLoginDao;
import com.org.model.AdminLoginModel;
import com.org.model.Login;
import com.org.model.LoginDAO;


@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminLoginModel alm=new AdminLoginModel();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		alm.setUsername(username);
		alm.setPassword(password);
		System.out.println(username);
		System.out.println(password);
		AdminLoginDao ald=new AdminLoginDao();
		String result=ald.AdminUser(alm);
		if(result.equals("Success"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			System.out.println("session set");
			request.getRequestDispatcher("Admin.html").forward(request, response);
		}
		else
		{
			System.out.println("session not set");
			request.getRequestDispatcher("AdminLogin.html").forward(request, response);
		}
	}

}
