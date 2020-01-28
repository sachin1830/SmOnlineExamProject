package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
public class LoginDAO 
{
	public String loginUser(Login lg) 
	{
		String username=lg.getUsername();
		String password=lg.getPassword();
		Connection con=null;
		try {
		con=DBConnetion.createConnection();
		java.sql.Statement st=con.createStatement();
		String query="select *from Registration where username='"+username+"' and password='"+password+"'";	
		ResultSet rs=st.executeQuery(query);
		int count=0;
		while(rs.next()) 
		{
			count++;
		}
		if(count>0)
		{
			return "Success";
		}
		else
		{
			return "not";
		}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return null;
	}
}
