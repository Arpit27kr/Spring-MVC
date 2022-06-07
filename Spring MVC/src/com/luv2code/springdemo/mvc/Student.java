package com.luv2code.springdemo.mvc;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class Student {
	
	private String firstName;
	private String lastName;
	
	public Student()
	{
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@RequestMapping("/processForm")
	public String processform(@ModelAttribute("student") Student theStudent)
	{
		System.out.println("theStudent : " + theStudent.getFirstName() + " "+ theStudent.getLastName() );
		
		return "student-confirmation";
		
		
		
		
	}
	
	

}
