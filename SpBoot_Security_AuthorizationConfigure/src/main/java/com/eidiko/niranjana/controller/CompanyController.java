package com.eidiko.niranjana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

	@GetMapping("/welcome")
	public String  CompanyWelcome()
	{
		return "Welcoome To SpringBoot Login";
	}
	@GetMapping("/admin")
	public String  CompanyAdmin()
	{
		return "Admin Successfully login";
	}
	@GetMapping("/dev")
	public String  CompanyDev()
	{
		return "Developer Successfully login";
	}
	@GetMapping("/emp")
	public String  CompanyEmployees()
	{
		return "Empoyee Successfully login";
	}
	@GetMapping("/trainner")
	public String  CompanyTrainner()
	{
		return "Trainner Successfully login";
	}
	
	
}
