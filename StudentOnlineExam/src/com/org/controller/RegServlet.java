package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.Registration;
import com.org.model.RegistrationDAO;



/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String username=request.getParameter("username");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	Registration rg=new Registration();
	rg.setFirstname(firstname);
	rg.setLastname(lastname);
	rg.setUsername(username);
	rg.setEmail(email);
	rg.setPassword(password);
	RegistrationDAO rd=new RegistrationDAO();
	String result=rd.registerUSer(rg);
	System.out.println(result);
	request.getRequestDispatcher("Login.html").forward(request, response);
	}
}
