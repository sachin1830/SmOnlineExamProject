package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.DeleteAllRecordDAO;

@WebServlet("/DeleteAllRecordController")
public class DeleteAllRecordController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeleteAllRecordDAO drd=new DeleteAllRecordDAO();
		int result=drd.deleteAllRecord();
		request.getRequestDispatcher("Afterdelete.html").forward(request, response);
	}

}
