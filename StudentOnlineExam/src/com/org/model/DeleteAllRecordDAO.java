package com.org.model;

import java.sql.Connection;

public class DeleteAllRecordDAO {
	public int deleteAllRecord()
	{
		int rs = 0;
		try {
			Connection con=DBConnetion.createConnection();
			java.sql.Statement st=con.createStatement();
			String query="truncate table questions";
			rs=st.executeUpdate(query);
			System.out.println(rs);
		} catch (Exception e) {
			System.out.println(e);
		}
		return rs;
		
	}
}
