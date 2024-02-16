package com.Controller;
import com.Service.*;
public class DataController {
	public void insert() throws Exception{
		DataService ds=new DataService();
		ds.insert(3,"Aryan",23);
	}
	
	public void update() throws Exception{
		DataService ds=new DataService();
		ds.update("Arun", 2);
	}
	
	public void delete() throws Exception{
		DataService ds=new DataService();
		ds.delete(3);
	}
	public void select() throws Exception{
		DataService ds=new DataService();
		ds.select();
	}
}
