package com.eidiko.niranjana.controller;
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
		public void  EmployeeControllerForCount(@RequestBody Employee emp)
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
	public String  EmployeeControllerForInsert(@RequestBody Employee emp)
	{
			try {
				System.out.println("insert Emp:"+service.registerEmp(emp.geteId(),emp.geteName(),emp.geteAddrs()));
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
			}
			return "data inserted";
	}
	@PostMapping("/empTestUpdate")
	public String  EmployeeControllerForUpdate(@RequestBody Employee emp)
	{
			try {
				System.out.println(service.updateEmpService(emp.geteId(),emp.geteName(),emp.geteAddrs()));
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
			}
			return "data updated";
	}
	@PostMapping("/empTestdelete")
	public String  EmployeeControllerForDelete(@RequestBody Employee emp)
	{
			try {
				System.out.println(service.deleteEmpService(emp.geteId()));
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
			}
			return "data deleted";
	}
	@PostMapping("/empTestSelect")
	public String  EmployeeControllerSelectById(@RequestBody Employee emp)
	{
			try {
				System.out.println(service.fetchEmpDetailsByService(emp.geteId()));
			}		
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
			}
			return "data selected";	
	}
}


