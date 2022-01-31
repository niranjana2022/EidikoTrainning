package com.eidiko.niranjana;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.eidiko.niranjana.service.EmployeeService;

@TestMethodOrder(OrderAnnotation.class) //High value indicates "low" priorities....Low value indicates "high" priorities
//@TestMethodOrder(MethodName.class)
//@TestMethodOrder(Random.class)
//@TestMethodOrder(DisplayName.class)
public class TestEmployeeService_TestMethodOrder 
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
	@Order(1)
	public void testEmployeeInterest() 
	{
		 actual = service.calcEmployeeInterest(100000, 2, 5); //actual result
		 expected = 10000.0f; //manually expected
		assertEquals(expected, actual);
		System.out.println("Our testEmployeeInterest  is successfully Executed");		
	}
	@Test
	@Order(2)
	public void testEmployeeInterest1() 
	{
		 actual = service.calcEmployeeInterest(100000, 2, 5); //actual result
		 expected = 10000.0f; //manually expected
		assertEquals(expected, actual);
		System.out.println("Our testEmployeeInterest1 is successfully Executed");		
	}
	@Test
	@Order(0)
	public void testEmployeeInterest2() 
	{
		 actual = service.calcEmployeeInterest(100000, 2, 5); //actual result
		 expected = 10000.0f; //manually expected
		assertEquals(expected, actual);
		System.out.println("Our testEmployeeInterest2 is successfully Executed");		
	}
	@Test
	@Order(-10)
	public void testEmployeeInterest4() 
	{
		 actual = service.calcEmployeeInterest(100000, 2, 5); //actual result
		 expected = 10000.0f; //manually expected
		assertEquals(expected, actual);
		System.out.println("Our testEmployeeInterest4 is successfully Executed");		
	}
	@AfterAll
	public static void clearOnce()
	{
		System.out.println("TestEmployeeService_BeforeAll_AfterAll.clearOnce()");
	}
}
