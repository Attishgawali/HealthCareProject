package com.healthcare.helper;

import java.sql.*;

public class ConnectionProvider {

	private static Connection con;

	public static Connection getConnection() throws Exception {
		if (con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare", "root", "root12345");

		}
		return con;
	}
}
