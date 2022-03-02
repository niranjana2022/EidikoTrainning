package com.eidiko.niranjana.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/")
	public String EmployeesData()
	{
		return "Successfully login";
	}
}
