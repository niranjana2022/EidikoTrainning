package com.eidiko.niranjana.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.model.CompanyEmployeeDetails;
import com.eidiko.niranjana.model.EmployeePrevBgDetails;

@RestController
public class CompanyEmployeeController {
	
	//============================================
	@GetMapping("/data")
	public CompanyEmployeeDetails employeeDetails()
	{
		CompanyEmployeeDetails details = new CompanyEmployeeDetails(
				100,
				"Niranjana charty", "karapada","Java Dev",30000.0,"23-08-2020","9383833303",
				"01-01-2022",
				new String[] {"Biriyani","AluChop","GupChup"},
				                        List.of("red","yellow"),
				                        Set.of(448464L,47484L),
				                        Map.of("AddarCardNo",77878,"VoteCardNo",972628),
				                        new EmployeePrevBgDetails("eidiko",20000.0,"Java Dev")
				                        );
		return details;
	}
	//========================================================
	@GetMapping("/data1")
	public ResponseEntity<CompanyEmployeeDetails> employeeDetails1()
	{
		CompanyEmployeeDetails details = new CompanyEmployeeDetails(
				100,
				"Niranjana charty", "karapada","Java Dev",30000.0,"23-08-2020","9383833303",
				"01-01-2022",
				new String[] {"Biriyani","AluChop","GupChup"},
				                        List.of("red","yellow"),
				                        Set.of(448464L,47484L),
				                        Map.of("AddarCardNo",77878,"VoteCardNo",972628),
				                        new EmployeePrevBgDetails("eidiko",20000.0,"Java Dev")
				                        );
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<CompanyEmployeeDetails>(details,status);
	}

}
