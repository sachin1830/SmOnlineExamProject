package com.org.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnetion {

	public static Connection createConnection() throws Exception
	   {
		   Connection con=null;    
		   String url = "jdbc:mysql://localhost:3306/StudentDB";
		   String username = "root";
		   String password = "Sachin@1830";
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con = DriverManager.getConnection(url, username, password);
		   return con;
	   }

}
