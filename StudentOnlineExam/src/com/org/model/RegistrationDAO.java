package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegistrationDAO 
{
  public String registerUSer(Registration rg)
  {
	String firstname=rg.getFirstname();
	String lastname=rg.getLastname();
	String username=rg.getUsername();
	String email=rg.getEmail();
	String password=rg.getPassword();
	Connection con=null;
	try {
		con=DBConnetion.createConnection();
		String query="insert into Registration (firstname,lastname,username,email,password)  values(?,?,?,?,?)";//This query help to inserting data to the database
        PreparedStatement statement=con.prepareStatement(query);
        statement.setString(1, firstname);
        statement.setString(2, lastname);
        statement.setString(3, username);
        statement.setString(4, email);
        statement.setString(5, password);
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
	return "something wents wrong";  
  }
}
