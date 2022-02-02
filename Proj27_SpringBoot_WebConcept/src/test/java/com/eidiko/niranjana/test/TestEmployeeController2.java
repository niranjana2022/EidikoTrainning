package com.eidiko.niranjana.test;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.eidiko.niranjana.controller.EmployeeController;
import com.eidiko.niranjana.enity.Employee;
//@RestController
public class TestEmployeeController2 {
	private  String actual =null;
	private Long expected =null;
	@BeforeAll
	public static void setupOnce()
	{
		System.out.println("TestEmployeeController.setOpOnce()");
	}
	/*
	@Test
	public void testEmployee()
	{
		EmployeeController controller =new  EmployeeController();
		Employee emp=new Employee();
		System.out.println("hello");
		ResponseEntity<Employee> l1=controller.employeeData( emp);
		System.out.println("hhh"+l1);
		controller.employeeData( emp);
		System.out.println(emp);
		System.out.println("hm");
		System.out.println(emp);
		actual = emp.getPhoneNumbers();//actual result
		System.out.println("hm1");//not executed
		System.out.println("hi");
		expected = 7867387228L;
		if(actual.equals(expected))
			System.out.println("This is a mobile number");
		else
			System.out.println("Not a mobile Number");
		 
		//expected = emp.getPhoneNumbers();                                       //manually expected
		assertEquals(expected, actual);
		System.out.println("Our test class is successfully Executed");		
		
	}
}
*/
		
		
		@Test
		public void ReadFile()
		{
			try {
				Scanner scn = new  Scanner(new File("C:\\Users\\Administrator\\Documents\\EmployeeResponse.txt"));
				while(scn.hasNextLine())
				{
					actual = scn.nextLine();
					expected=7828873871L;
					if(actual.equals(expected))
					{
						System.out.println("This is mobile numer");
					}
					else
					{
						System.out.println("not a mobile number");
					}
				}
			}
			catch(FileNotFoundException fe)
			{
				fe.printStackTrace();
			}
		 assertEquals(expected,actual);
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
