package com.pan.test;

import java.sql.*;

public class TestJdbc {
	
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://localhost/zqq";
	  
	 static final String USER = "root";
	 static final String PASS = "";
	 

	public static void main(String[] args) throws SQLException {
		 Connection conn = null;
		 PreparedStatement stm = null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			String sql = "select id, first, last, age from employees where id=?";
			stm = conn.prepareStatement(sql);
			stm.setInt(1, 1);
			ResultSet rs = stm.executeQuery();
			while(rs.next()){
				//Retrieve by column name
		         int id  = rs.getInt("id");
		         int age = rs.getInt("age");
		         String first = rs.getString("first");
		         String last = rs.getString("last");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		         
		         
			}
			  rs.close();
			  stm.close();
		      conn.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			
		}
	}
}
