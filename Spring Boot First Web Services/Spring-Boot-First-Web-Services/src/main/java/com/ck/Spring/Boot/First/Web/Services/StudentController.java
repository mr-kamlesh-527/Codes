package com.ck.Spring.Boot.First.Web.Services;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//this is for Request mapping mapping method
	@RequestMapping("first")
	public String first() {
		return "Hello this is first web service using Request mapping method";
	}
	@RequestMapping("second")
	public int second() {
		return 1234567891;
	}
	
	//this is for get mapping method
	@GetMapping("third")
	public String third() {
		return "Hello this is third web service using Get mapping method";
	}
	@GetMapping("fourth")
	public int fourth() {
		return 1234567891;
	}
	
	
	// this is for Path variable 
	@GetMapping("pfifth/{name}")
	public String pfifth(@PathVariable String name) {
		return name;
	}
	@GetMapping("psixth/{id}")
	public int psixth(@PathVariable int id) {
		return id;
	}
	
	// this is for   @RequestBody
	@RequestMapping("pseventh")
	public String pseventh(@RequestBody String name) {
		return name;
	}
	@GetMapping("peight")
	public int peight(@RequestBody int id) {
		return id;
	}
	
	//this is for getting the data
	@GetMapping("allRecords")
	ArrayList<Student> all() {
		ArrayList<Student> aa=new ArrayList <Student>();
		aa.add(new Student (1, "kamlesh"));
		aa.add(new Student (2, "aryan"));
		aa.add(new Student (3, "arun"));
		return aa;
	}
	
	//this is for getting the data
	@PostMapping("insertRecords")
	ArrayList<Student> insertSingle(@RequestBody Student student) {
		ArrayList<Student> aa=new ArrayList <Student>();
		aa.add(student);
//		aa.add(new Student (1, "kamlesh"));
//		aa.add(new Student (2, "aryan"));
//		aa.add(new Student (3, "arun"));
		return aa;
	}
}
