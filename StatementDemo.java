package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementDemo {

	public void insertdata2()throws Exception {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement st = c.createStatement();
			st.executeUpdate("insert into demo values(22,'kirti','Murtijapur')");
			System.out.println("inserted successfully");
			c.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	//update
	
	public void updatadata()throws Exception {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement st = c.createStatement();
			st.executeUpdate("update demo set address='shegoan' where id=21 ");
			System.out.println("update successfully");
			c.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//delete
	
	public void deletedata() throws Exception {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement st = c.createStatement();
			st.executeUpdate("delete from demo where id=22");
			System.out.println("delete successfully");
			c.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
//fetch	
	public void fetchdata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:Mysql://localhost:3306/demo","root","root");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("select * from demo");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3)+" ");
		}
		
	
	}

}
