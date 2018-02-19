package org.niit.LoginApp.DBConnection;

public class TestConnection {
	
	public static void main(String[] args) {
		
		
		if(DBConnection.getConnection()==null)
		{
			System.out.println("no connection");
		}
		else
		{
			System.out.println("Yes");
		}
		
		
	}

}
