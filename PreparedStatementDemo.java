package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementDemo {

	public void insertdata() throws Exception  {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		PreparedStatement ps = c.prepareStatement("insert into demo values (?,?,?)");
		ps.setInt(1, 23);
		ps.setString(2, "rohan");
		ps.setString(3, "Nagpur");
		ps.executeUpdate();
		System.out.println("insert successfully");
		c.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//update
	public void updatedata()throws Exception {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			PreparedStatement ps = c.prepareStatement("update demo set address=? where id=?");
			ps.setString(1, "Asam");
			ps.setInt(2, 23);
			ps.executeUpdate();
			System.out.println("update Successfully");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	//delete
	
	public void delete() throws Exception {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:Mysql://localhost:3306/demo","root","root");
			PreparedStatement ps = c.prepareStatement("delete from demo where id=?");
			ps.setInt(1, 23);
			System.out.println("delete successfully");
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//fetch
	
	public void fetch()throws Exception {
		

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			PreparedStatement ps = c.prepareStatement("select * from demo");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" ");
				
			}
	}
}
