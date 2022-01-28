package com.eidiko.niranjana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.client.BillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {

	@Autowired
	private BillingServiceRestConsumer consumer;
	
	@GetMapping("/info")
	public String displayShoppingDetails()
	{
		return "Diwali festival shopping for family:"+consumer.BillingInfo();
	}
}
