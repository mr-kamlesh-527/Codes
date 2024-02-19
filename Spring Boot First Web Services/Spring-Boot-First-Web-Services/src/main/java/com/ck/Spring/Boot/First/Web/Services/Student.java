package com.ck.Spring.Boot.First.Web.Services;

public class Student {
	int a;
	String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [a=" + a + ", name=" + name + "]";
	}
	
	
}
