package com.org.model;
import java.sql.Connection;
import java.sql.ResultSet;

public class DeleteRecordDAO {
	public String deleteRecord(DeleteRecord rd)
	{
		String question=rd.getQuestion();
		String questionid=rd.getQuestionid();
		int id=Integer.parseInt(questionid);
		Connection con=null;
		try {
			con=DBConnetion.createConnection();
			java.sql.Statement st=con.createStatement();
			String query="delete from questions where question='"+question+"' and id='"+id+"'";
			int rs=st.executeUpdate(query);
			if(rs>0)
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
		return null;
	}

}
