package com.eidiko.niranjana;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.EmployeeService;
import com.eidiko.niranjana.service.EmployeeService2;

public class TestEmployeeService2_assertThrows {
	
	@Test
	public void testEmployeeInterest1() 
	{
		EmployeeService2 service = new EmployeeService2();
		float actual = service.calcEmployeeInterest(0, 2, 5);
		float expected = 10000.0f;
		assertEquals(expected, actual);
   }

	@Test
	public void testEmployeeInteres2() 
	{
		EmployeeService2 service = new EmployeeService2();
	//	assertThrows(IllegalArgumentException.class, service.calcEmployeeInterest(0, 2,5));
		assertThrows(IllegalArgumentException.class, ()->{
																							service.calcEmployeeInterest(0, 2, 5);
																							}
								);
		System.out.println("Our testEmployeeInterest  is successfully Executed");
	}
	/*
		@Test
		public void testEmployeeInterest3() 
		{
			EmployeeService2 service = new EmployeeService2();
			assertThrows(ArithmeticException.class, ()->{
																						service.calcEmployeeInterest(0, 2, 5);
																					}
								);
		   System.out.println("Our testEmployeeInterest1  is successfully Executed");		
	  }
*/
}
