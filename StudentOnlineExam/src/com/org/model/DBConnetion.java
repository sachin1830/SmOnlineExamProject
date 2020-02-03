package com.org.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.net.URI;

public class DBConnetion {

	public static Connection createConnection() throws Exception
	   {
		Connection con=null;    
		   String url = "jdbc:mysql://us-cdbr-iron-east-04.cleardb.net/heroku_a8a67f15c51319d";
		   String username = "bbb53bdfeab956";
		   String password = "c97e6390";
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con = DriverManager.getConnection(url, username, password);
		   return con;
	   }

}
