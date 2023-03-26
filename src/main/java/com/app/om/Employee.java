package com.app.om;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Employee {
	@Id
	private Integer empid;
	private String empname;

}
