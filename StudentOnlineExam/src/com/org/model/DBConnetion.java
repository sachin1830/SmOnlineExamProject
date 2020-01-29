package com.org.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.net.URI;

public class DBConnetion {

	public static Connection createConnection() throws Exception
	   {
		 Connection con=null;    
		   URI jdbUri = new URI(System.getenv("JAWSDB_URL"));
		    String username = jdbUri.getUserInfo().split(":")[0];
		    String password = jdbUri.getUserInfo().split(":")[1];
		    String port = String.valueOf(jdbUri.getPort());
		    String jdbUrl = "jdbc:mysql://" + jdbUri.getHost() + ":" + port + jdbUri.getPath();
		    con = DriverManager.getConnection(jdbUrl, username, password);
		   return con;
	   }

}
