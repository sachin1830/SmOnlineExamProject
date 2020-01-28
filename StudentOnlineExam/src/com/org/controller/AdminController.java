package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.Admin;
import com.org.model.AdminDAO;


@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String question=request.getParameter("question");
		String option1=request.getParameter("option1");
		String option2=request.getParameter("option2");
		String option3=request.getParameter("option3");
		String option4=request.getParameter("option4");
		String answer=request.getParameter("answer");
		String id=request.getParameter("questionid");
		Admin ad=new Admin();
		ad.setQuestion(question);
		ad.setOption1(option1);
		ad.setOption2(option2);
		ad.setOption3(option3);
		ad.setOption4(option4);
		ad.setAnswer(answer);
		ad.setId(id);
		AdminDAO adao=new AdminDAO();
		String result=adao.adminUser(ad);
		if(result.equals("success"))
		{
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("Admin.html").forward(request, response);
		}
	}

}
