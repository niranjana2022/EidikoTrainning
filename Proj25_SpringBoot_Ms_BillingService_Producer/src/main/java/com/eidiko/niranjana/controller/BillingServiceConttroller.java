package com.eidiko.niranjana.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceConttroller {
	@Value("${server.port}")
	private int port;
	@Value("${eureka.instnace.instane-Id}")  //Here we injceted two instnace, let's see LoadBalancerClient which one is picked for to Consumer Application  
	private String instnaceId;

	@GetMapping("/info")
	public String getBillingMethod()
	{
		return "we can use cash, credit, debit";
	}
}
