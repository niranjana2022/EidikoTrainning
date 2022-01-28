/*
package com.eidiko.niranjana.controler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.eidiko.niranjana.entity.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private Employee emp;
	
	@PostMapping("/register")
	public String EmployeeController(@RequestBody Employee emp)
	{
		System.out.println(emp.geteId());
		System.out.println(emp.geteName());
		System.out.println(emp.geteAddrs());
		//System.out.println(emp.getEmpFavColor());
		System.out.println("we can get as format: "+emp.toString());
		return  "Result Generated";
	}

}
*/