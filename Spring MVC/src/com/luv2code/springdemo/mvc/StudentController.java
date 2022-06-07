package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showform(Model model)
	{
		
		Student thestudent=new Student();
		
		model.addAttribute("student", thestudent);
		  
		
		
		return "student-form";
		
	}
	

}
