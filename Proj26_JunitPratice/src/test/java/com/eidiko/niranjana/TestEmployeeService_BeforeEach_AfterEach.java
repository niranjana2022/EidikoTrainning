package com.eidiko.niranjana;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.EmployeeService;

public class TestEmployeeService_BeforeEach_AfterEach {
	private EmployeeService service;

	@BeforeEach
	public void setup()
	{
		System.out.println("TestEmployeeService2_assertDoesNotThrows.setup()");
	}
	@Test
	public void testEmployeeInterest() 
	{
		service = new EmployeeService();
		float actual = service.calcEmployeeInterest(100000, 2, 5); //actual result
		float expected = 10000.0f; //manually expected
		assertEquals(expected, actual);
		System.out.println("Our test class is successfully Executed");		
	}
	@AfterEach
	public void clear()
	{
		System.out.println("TestEmployeeService2_assertDoesNotThrows.clear()");
		service=null;
	}
}
