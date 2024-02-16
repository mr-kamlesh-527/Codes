package com.Service;
import com.DAO.*;
public class DataService {
	public void insert() throws Exception{
		DataDAO dt=new DataDAO();
		dt.insert();
	}
	public void update() throws Exception{
		DataDAO dt=new DataDAO();
		dt.update();
	}
	public void delete() throws Exception{
		DataDAO dt=new DataDAO();
		dt.delete();
	}
	public void select() throws Exception{
		DataDAO dt=new DataDAO();
		dt.select();
	}
}
