package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataDAO {
	public void insert() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded..");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection done");
		Statement smt=con.createStatement();
		smt.executeUpdate("insert into crudjdbc values(4,'sachin','nanded')");
		System.out.println("Data Inserted Successfuly....");
		con.close();
	}
	public void update() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded..");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection done");
		Statement smt=con.createStatement();
		smt.executeUpdate("update crudjdbc set address='pune' where id=1");
		System.out.println("Data Updated Successfuly....");
		con.close();
	}
	
	public void delete() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded..");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection done");
		Statement smt=con.createStatement();
		smt.executeUpdate("delete from crudjdbc where id=2");
		System.out.println("Data Deleted Successfuly....");
		con.close();
	}
	
	public void select() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded..");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection done");
		Statement smt=con.createStatement();
		
		ResultSet rs=smt.executeQuery("select * from crudjdbc");
		System.out.println(" \nDatabase Records : ");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
	}
}
