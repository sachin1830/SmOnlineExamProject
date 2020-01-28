package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QuestionDAO 
{
   public  ArrayList<Question> question() throws SQLException
   {
	   ArrayList<Question> arr=new ArrayList<Question>();
	   Connection con=null;
	   ResultSet res=null;
	   try {
		con=DBConnetion.createConnection();
		Statement st=con.createStatement();
		String query="select * from Questions";
	    res=st.executeQuery(query);
		int i=1;
		while(res.next())
		{
			Question qi=new Question();
			qi.setId(res.getInt(1));
			qi.setQuestion(res.getString(2));
			qi.setOption1(res.getString(3));
			qi.setOption2(res.getString(4));
			qi.setOption3(res.getString(5));
			qi.setOption4(res.getString(6));
			qi.setAns(res.getString(7));
			i++;
			arr.add(qi);
		}
	} catch (Exception e)
	   {
		System.out.println(e);
	  }
	   finally {
		if(null !=con)
		{
			con.close();
			res.close();
		}
	}
	return arr;
   }
   public  ResultSet answer(int id) throws SQLException
   {
	  
	   Connection con=null;
	   ResultSet rs=null;
	   try {
		   con=DBConnetion.createConnection();
		    String query="select answer from Questions where id='"+id+"'";
		    Statement st=con.createStatement();
		    rs=st.executeQuery(query);
	} catch (Exception e) {
		System.out.println(e);
	}
	   
	
	   return rs;
   }
}
