package com.eidiko.niranjana.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

	@GetMapping("/admin")
	public String  CompanyAdmin()
	{
		return "AdminLogin";
	}
	@GetMapping("/dev")
	public String  CompanyDev()
	{
		return "DeveloperLogin";
	}
	@GetMapping("/emp")
	public String  CompanyEmployees()
	{
		return "EmpoyeeLogin";
	}
	@GetMapping("/trainner")
	public String  CompanyTrainner()
	{
		return "TrainnerLogin";
	}
	 @GetMapping("/denied")
	  public  String accessDenied() {
		  return "access_denied";
	  }
}
