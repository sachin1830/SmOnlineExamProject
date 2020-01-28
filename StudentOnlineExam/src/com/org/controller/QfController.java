package com.org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.Question;
import com.org.model.QuestionDAO;

/**
 * Servlet implementation class QfController
 */
@WebServlet("/QfController")
public class QfController extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Question> arr;
		try {
			arr= new QuestionDAO().question();
			request.setAttribute("Result", arr);
			HttpSession session=request.getSession(false);
			if(session!=null) {
				System.out.println("question forwarded");
			request.getRequestDispatcher("Question.jsp").forward(request, response);
			}
			else
			{
				System.out.println("user not login yet");
				request.getRequestDispatcher("Login.html").forward(request, response);
			}
			//System.out.println("After request dispatcher");
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		   Question qs=null;
			try {
				 response.setContentType("text/plain");
				 PrintWriter out= response.getWriter();
				String sid=request.getParameter("uid");
				
				int id=Integer.parseInt(sid);
			    String val=request.getParameter("select");
			    
			    QuestionDAO qd=new QuestionDAO();
			    ResultSet rs=qd.answer(id);	
			    rs.next();
			    
			    String result;
			    if(rs.getString(1).equals(val))
			    {
			    	result="Success";
			    }
			    else
			    {
			    	result="Wrong";
			    	
			    }
			    out.print(result);
			} catch (Exception e) {
			System.out.println(e);
			}
		
	}

}
