package com.eidiko.niranjana.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

	@GetMapping("/find")
	public Map<String,String> getData()
	{
		return Map.of("Name","Niranjana");
		//return Map.of("Name1","Susanta");
	}
}
