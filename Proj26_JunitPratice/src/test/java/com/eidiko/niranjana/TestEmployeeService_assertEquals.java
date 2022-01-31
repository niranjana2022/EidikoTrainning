package com.eidiko.niranjana;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.EmployeeService;

public class TestEmployeeService_assertEquals {

	@Test
	public void testEmployeeInterest() 
	{
		EmployeeService service = new EmployeeService();
		float actual = service.calcEmployeeInterest(100000, 2, 5); //actual result
		float expected = 10000.0f; //manually expected
		assertEquals(expected, actual);
		System.out.println("Our test class is successfully Executed");		
	}
}
