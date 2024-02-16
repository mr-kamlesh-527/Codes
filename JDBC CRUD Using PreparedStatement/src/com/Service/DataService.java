package com.Service;
import com.DAO.*;
public class DataService {
	public void insert( int id, String name, int age) throws Exception{
		DataDAO d=new DataDAO();
		d.insert(id, name, age);
	}
	
	public void update(String name, int id) throws Exception{
		DataDAO d=new DataDAO();
		d.update(name, id);
	}
	
	public void delete( int id) throws Exception{
		DataDAO d=new DataDAO();
		d.delete(id);

	}
	public void select() throws Exception{
		DataDAO d=new DataDAO();
		d.select();
	}
}
