package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.DeleteRecord;
import com.org.model.DeleteRecordDAO;


@WebServlet("/DeleteRecordController")
public class DeleteRecordController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String question=request.getParameter("question");
		String questionid=request.getParameter("questionId");
		DeleteRecord rd=new DeleteRecord();
		rd.setQuestion(question);
		rd.setQuestionid(questionid);
		DeleteRecordDAO drd=new DeleteRecordDAO();
		String result=drd.deleteRecord(rd);
		if(result.equals("success"))
		{
			request.getRequestDispatcher("Afterdelete.html").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("Afterdeletewrong.html").forward(request, response);
		}
	}

}
