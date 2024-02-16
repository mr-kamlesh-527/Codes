package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataDAO {
	public void insert(int id, String name, int age) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connection Done......");
		PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?)");		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.executeUpdate();
		System.out.println("Data inserted Successfully.......  id = "+id+" name ="+name+" age = "+age);
		
	}
	
	public void update(String name, int id) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connection Done......");
		PreparedStatement ps=c.prepareStatement("update student set name=? where id=?");		
		
		ps.setString(1, name);
		ps.setInt(2, id);
		ps.executeUpdate();
		System.out.println("Data updated Successfully.......");
		
	}
	
	
	public void delete(int id) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connection Done......");
		PreparedStatement ps=c.prepareStatement("delete from student where id=?");		

		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Data delete Successfully.......");
		
	}
	
	public void select() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connection Done......");
		Statement ps=c.createStatement();	
		ResultSet rs=ps.executeQuery("select * from student");
		
		//PreparedStatement s=(PreparedStatement) c.createStatement();
		//ResultSet r=s.executeQuery("select * from student");

		System.out.println("\nResult from student table : ");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
}
