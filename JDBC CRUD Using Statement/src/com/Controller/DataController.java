package com.Controller;
import com.DAO.DataDAO;
import com.Service.*;
public class DataController {
	public void insert() throws Exception{
		DataService ds=new DataService();
		ds.insert();
	}
	public void update() throws Exception{
		DataService ds=new DataService();
		ds.update();
	}
	public void delete() throws Exception{
		DataService ds=new DataService();
		ds.delete();
	}
	
	public void select() throws Exception{
		DataService ds=new DataService();
		ds.select();
	}
}
