package com.sec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BasicSecurity {
  // If YOU Want to Add Custom Username and Password Go to the Application.properties and enter custom details
	
	
	@GetMapping
	public String display() {
		String s="Welcome to SpringBOOT Security";
		String s1=s.concat("-Security for giving login user name and password");
		return s1;
	}
}
