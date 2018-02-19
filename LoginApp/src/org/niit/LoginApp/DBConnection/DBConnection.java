package org.niit.LoginApp.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static final String driver="org.h2.Driver";
	private static final String url="jdbc:h2:~/test";
		private static final String username="root";
	private static final String password="JIvan8181#";
	
	private DBConnection()
	{
		
	}
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=	DriverManager.getConnection(url, username, password);
			
			return con;
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
			
			
		}
		
		
	
		
	

}
