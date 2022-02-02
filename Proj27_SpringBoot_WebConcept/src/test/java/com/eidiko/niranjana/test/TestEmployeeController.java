package com.eidiko.niranjana.test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.eidiko.niranjana.controller.EmployeeController;
import com.eidiko.niranjana.enity.Employee;
public class TestEmployeeController {

	@Autowired
	private Employee emp;
	//private Set< Long> actual =null;
	private  Long actual =null;
	private Long expected =null;
	
	@Test
	public void testEmployee()
	{
		EmployeeController controller = new EmployeeController();
		System.out.println("hello");
		//ResponseEntity<Employee> l1=controller.employeeData( emp);
		System.out.println(emp);
		ResponseEntity<Employee> l1=controller.employeeData( emp);
		System.out.println(l1);
		actual = emp.getPhoneNumbers();//actual result
		expected = 7867387228L;    
		if(actual.equals(expected))
			System.out.println("This is a mobile number");
		else
			System.out.println("Not a mobile Number");
		 
		//expected = emp.getPhoneNumbers();                                      
		assertEquals(expected, actual);
		System.out.println("Our test class is successfully Executed");		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		/*
		controller = new EmployeeController(110, "Kunal", "Delhi",
				new String[] {"idli","puri","upma"},
				Set.of(7867387228L, 9972268867L),
				Map.of("aadhar card": 72527737,"pan card": 72681838),
				new Company( "Hyd","Yes bank", "chennai"));
		actual=
		*/
