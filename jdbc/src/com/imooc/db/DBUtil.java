package com.imooc.db;

import java.beans.Statement;
import java.sql.*;

public class DBUtil {
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
	private static final String USER = "root";
	private static final String PASSWORD = "william900222";

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
		
		java.sql.Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
		
		while(rs.next()){
			System.out.println(rs.getInt("user_name")+","+rs.getInt("age"));
			
		}
	}

}
