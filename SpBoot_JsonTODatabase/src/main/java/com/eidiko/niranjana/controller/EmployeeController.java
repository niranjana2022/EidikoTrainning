package com.eidiko.niranjana.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.Employee;
import com.eidiko.niranjana.service.EmployeeService;

@RestController
public class EmployeeController {

	
		@Autowired
	private EmployeeService service;
		@PostMapping("/empTest")
	public String  EmployeeController(@RequestBody Employee emp)
	{
			if(service.fetchEmployeeService(emp)!=1) {
				return "Not saved";
			}else {
				return "Data saved";
			}
			
	}
}


