package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminDAO 
{
  public String adminUser(Admin ad)
  {
	 // System.out.println("DAo method");
	 double dd=Double.parseDouble(ad.getId());
	 int id=(int)dd;
	 System.out.println(id);
	 String question=ad.getQuestion();
	 String option1=ad.getOption1();
	 String option2=ad.getOption2();
	 String option3=ad.getOption3();
	 String option4=ad.getOption4();
	 String answer=ad.getAnswer();
	
	 Connection con=null;
	 try {
		 con=DBConnetion.createConnection();
		 String query="insert into Questions (id,question,option1,option2,option3,option4,answer)  values(?,?,?,?,?,?,?)";
		 PreparedStatement statement=con.prepareStatement(query);
		 statement.setInt(1, id);
	     statement.setString(2, question);
	     statement.setString(3, option1);
	     statement.setString(4, option2);
	     statement.setString(5, option3);
	     statement.setString(6, option4);
	     statement.setString(7, answer);
		int i=statement.executeUpdate();
		if(i!=0)
		{
			return "success";
		}
		else
		{
		   return "wrong";	
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return "something wrong";
	  
  }
}
