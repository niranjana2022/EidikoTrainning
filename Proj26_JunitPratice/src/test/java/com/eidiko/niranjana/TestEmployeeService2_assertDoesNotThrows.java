package com.eidiko.niranjana;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.EmployeeService2;

public class TestEmployeeService2_assertDoesNotThrows {
	private EmployeeService2 service;
	
	//===============================================================
	@Test
	public void testEmployeeInteres2() 
	{
		 service = new EmployeeService2();
		assertDoesNotThrow(()->{
														service.calcEmployeeInterest(100000, 2, 5);
													}
								);
		System.out.println("Our testEmployeeInterest  is successfully Executed");
	}
}
