package com.eidiko.niranjana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@PostMapping("data/{id}/{name}/{addrs}")
	@ResponseBody
	public String DisplayData(@PathVariable Integer id,@PathVariable String name,@PathVariable String addrs) {
		
		return "Inserted datas are:"+id+" "+name+" "+addrs;
	}
}
