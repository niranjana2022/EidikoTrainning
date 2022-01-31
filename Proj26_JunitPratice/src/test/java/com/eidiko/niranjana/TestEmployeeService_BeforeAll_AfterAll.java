package com.eidiko.niranjana;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.EmployeeService;

public class TestEmployeeService_BeforeAll_AfterAll 
{
	private static EmployeeService service;
	private float actual =0;
	private float expected =0;
	
	@BeforeAll
	public static void setupOnce()
	{
		System.out.println("TestEmployeeService_BeforeAll_AfterAll.setupOnce()");
		service=new EmployeeService();
	}
	@Test
	public void testEmployeeInterest() 
	{
		 actual = service.calcEmployeeInterest(100000, 2, 5); //actual result
		 expected = 10000.0f; //manually expected
		assertEquals(expected, actual);
		System.out.println("Our test class is successfully Executed");		
	}
	@AfterAll
	public static void clearOnce()
	{
		System.out.println("TestEmployeeService_BeforeAll_AfterAll.clearOnce()");
	}
}
