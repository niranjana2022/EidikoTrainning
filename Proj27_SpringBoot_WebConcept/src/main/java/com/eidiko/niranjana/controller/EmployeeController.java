package com.eidiko.niranjana.controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.enity.Company;
import com.eidiko.niranjana.enity.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private Employee emp;
	@PostMapping("/data")
	@Test
	public ResponseEntity<Employee> employeeData(@RequestBody Employee emp)
	{
		System.out.println("All data retrieved");
		System.out.println(emp);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK) ;
	}
}
