package org.niit.LoginApp.UserDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.niit.LoginApp.DBConnection.DBConnection;

public class UserDAO {

	public boolean isValid(String id, String password) {

		Connection con = DBConnection.getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from user where id='" + id + "' and password='" + password + "' ");
			if (rs.next()) {
				
				
				return true;
			} else {
				//System.out.println("No database");
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}