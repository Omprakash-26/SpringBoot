package com.app.om;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Testrunner implements  CommandLineRunner{
	
	
	@Autowired
	EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		
		System.out.println(repo.getClass().getName());
		
		
	}
	

}
