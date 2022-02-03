package com.eidiko.niranjana.controller;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.eidiko.niranjana.entity.Employee;
import com.eidiko.niranjana.service.EmployeeMgmtService;

@RestController
public class EmployeeController {

		@Autowired
	private EmployeeMgmtService service; 
	
		@GetMapping("/empTestCount")
		public void  EmployeeControllerForCount()
		{
				try {
					System.out.println("Employee count:"+service.fetchEmpsCount());
				}		
				catch(DataAccessException dae)
				{
					dae.printStackTrace();
				}
				System.out.println("Total Employee Counted Succsessfully");
		}
		
	@PostMapping("/empTestInsert")
	public List<Employee>  EmployeeControllerForInsert(@RequestBody Employee emp)
	{
		List<Employee> list = Arrays.asList(emp);
			try {
				System.out.println("insert Emp:"+service.registerEmp(emp.geteId(),emp.geteName(),emp.geteAddrs()));
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
			}
			return list;
	}
	@PostMapping("/empTestUpdate")
	public List<Employee>  EmployeeControllerForUpdate(@RequestBody Employee emp)
	{
		List<Employee> list = Arrays.asList(emp);
			try {
				System.out.println(service.updateEmpService(emp.geteId(),emp.geteName(),emp.geteAddrs()));
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
			}
			return list;
	}
	@PostMapping("/empTestdelete")
	public List<Employee>  EmployeeControllerForDelete(@RequestBody Employee emp)
	{
		List<Employee> list = Arrays.asList(emp);
			try {
				System.out.println(service.deleteEmpService(emp.geteId()));
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
			}
			return list;
	}
}


