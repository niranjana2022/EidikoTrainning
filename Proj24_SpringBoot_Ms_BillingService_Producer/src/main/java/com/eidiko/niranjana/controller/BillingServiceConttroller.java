package com.eidiko.niranjana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceConttroller {
	
	@GetMapping("/info")
	public String getBillingMethod()
	{
		return "we can use cash, credit, debit";
	}
}
