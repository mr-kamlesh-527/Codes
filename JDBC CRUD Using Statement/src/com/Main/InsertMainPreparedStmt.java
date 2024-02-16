package com.Main;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertMainPreparedStmt {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded...");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connected Successfuly.....");
		String query="insert into student values(?, ?, ?)";
		PreparedStatement ps=c.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		while(true) {
//			System.out.print("Enter ID : ");
//			int id = sc.nextInt();
//			
//			System.out.print("\nEnter name : ");
//			String name = sc.next();
//			
//			System.out.print("\nEnter Address : ");
//			String address = sc.nextLine();
//			
//			System.out.print("Enter More details (Y/N) : ");
//			String choice = sc.next();
//			
//			
//			ps.setInt(1, id);
//			ps.setString(2, name);
//			ps.setString(3, address);
//			
//			ps.addBatch();
//			if(choice.toUpperCase().equals("N")) {
//				break;
//			}
			
			System.out.print("Enter ID : ");
			int id = sc.nextInt();
			
			System.out.print("\nEnter name : ");
			String name = sc.next();
			
			System.out.print("\nEnter Age : ");
			int age = sc.nextInt();
			
			System.out.print("Enter More details (Y/N) : ");
			String choice = sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			
			ps.addBatch();
			if(choice.toUpperCase().equals("N")) {
				break;
		}
		}
		int arr[] = ps.executeBatch();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				System.out.println("error......data not inserted....");
			}
			else {
				System.out.println("Data inserted Successfully.....");
			}
		}
	}
}
