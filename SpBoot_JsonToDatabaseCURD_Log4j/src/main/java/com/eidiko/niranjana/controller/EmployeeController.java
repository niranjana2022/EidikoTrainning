package com.eidiko.niranjana.controller;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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

	private static Logger logger = Logger.getLogger(EmployeeController.class);
	static 
	{
		try 
		{
			PropertyConfigurator.configure("src/main/java/com/eidiko/niranjana/commons/log4j.properties");
			logger.info("com.eidiko.niranjana.EmployeeController::Log4J Setup ready");
			logger.debug("com.eidiko.niranjana.controller.EmployeeController::Controller class is start");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.info("com.eidiko.niranjana.controller.EmployeeController::Problem while setting up Log4J");;
		}
	}
	@Autowired
	private EmployeeMgmtService service;
	
	@GetMapping("/empTestCount")
	public String  EmployeeControllerForEmployeeCount()
	{
		logger.debug("com.eidiko.niranjana.controller.EmployeeController::Controller class EmployeeCount method is start");
		//================EmplyeeCount=================================
		try {
			//logger.debug("com.eidiko.niranjana.controller.EmployeeController::Controller class EmployeeCount method is start");
			System.out.println("insert Emp:"+service.fetchEmpsCount());
			logger.info("com.eidiko.niranjana.controller.EmployeeController::fetchEmpsCount service method is executed");
		}
		
		catch(DataAccessException dae)
		{
			dae.printStackTrace();
			logger.error("com.eidiko.niranjana.controller.EmployeeController::known DB exception is raised in fetchEmpsCount service method"+dae.getMessage());
		}
		logger.debug("com.eidiko.niranjana.controller.EmployeeController::Controller class EmployeeCount method is end");
		return "Total Employee count";
		
	}
		
	@PostMapping("/empTestInsert")
	public String  EmployeeControllerForInsert(@RequestBody Employee emp)
	{
		logger.debug("com.eidiko.niranjana.controller.EmployeeController::Controller class EmployeeControllerForInsert method is start");
		//=====================Inserted================
			
			try {
				System.out.println("insert Emp:"+service.registerEmp(emp.geteId(),emp.geteName(),emp.geteAddrs()));
				logger.info("com.eidiko.niranjana.controller.EmployeeController::registerEmp service method is executed");
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
				logger.error("com.eidiko.niranjana.controller.EmployeeController::known DB exception is raised in registerEmp Service method"+dae.getMessage());
			}
			logger.debug("com.eidiko.niranjana.controller.EmployeeController::Controller class EmployeeControllerForInsert method is end");
			return "data inserted";
	}
	@PostMapping("/empTestUpdate")
	public String  EmployeeControllerForUpdate(@RequestBody Employee emp)
	{
		logger.debug("com.eidiko.niranjana.controller.EmployeeController::Controller class EmployeeControllerForUpdate method is start");
		//=======================update======================
			
			try {
				System.out.println(service.updateEmpService(emp.geteId(),emp.geteName(),emp.geteAddrs()));
				logger.info("com.eidiko.niranjana.controller.EmployeeController::updateEmployee service method is executed");
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
				logger.error("com.eidiko.niranjana.controller.EmployeeController::known DB exception is raised in updateEmployee Service method"+dae.getMessage());
			}
			logger.debug("com.eidiko.niranjana.EmployeeController::Controller class EmployeeControllerForUpdate method is end");
			return "data updated";
	}
	@PostMapping("/empTestDelete")
	public String  EmployeeControllerForDelete(@RequestBody Employee emp)
	{
		logger.debug("com.eidiko.niranjana.EmployeeController::Controller class EmployeeControllerForDelete method is start");
		//=======================delete======================
			try {
				System.out.println(service.deleteEmpService(emp.geteId()));
				logger.info("com.eidiko.niranjana.EmployeeController::deleteEmployee service method is executed");
			}
			
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
				logger.error("com.eidiko.niranjana.controller.EmployeeController::known DB exception is raised in deleteEmployee Service method"+dae.getMessage());
			}
			logger.debug("com.eidiko.niranjana.EmployeeController::Controller class EmployeeControllerForDelete method is end");
			return "data deleted";
	}
	@PostMapping("/empTestSelect")
	public String  EmployeeControllerForSelect(@RequestBody Employee emp)
	{
		logger.debug("com.eidiko.niranjana.EmployeeController::Controller class EmployeeControllerForSelect method is start");
		//=======================select======================
			try {
				System.out.println(service.fetchEmpDetailsByService(emp.geteId()));
				logger.info("com.eidiko.niranjana.EmployeeController::selectEmployeeByID service method is executed");
			}		
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
				logger.error("com.eidiko.niranjana.controller.EmployeeController::known DB exception is raised in selectEmployeeByID Service method"+dae.getMessage());
			}
			logger.debug("com.eidiko.niranjana.EmployeeController::Controller class EmployeeControllerForSelect method is end");
			return "data selected";
	}
	@PostMapping("/empTestSelect1")
	public String  EmployeeControllerForSelect1(@RequestBody Employee emp)
	{
		logger.debug("com.eidiko.niranjana.EmployeeController::Controller class EmployeeControllerForSelect1 method is start");
		//====================SELECT OPERATION======================
			
			try {
				System.out.println(service.fetchEmpDetailsByName(emp.geteName()));
				logger.info("com.eidiko.niranjana.EmployeeController::selectEmployeeByName service method is executed");
			}		
			catch(DataAccessException dae)
			{
				dae.printStackTrace();
				logger.error("com.eidiko.niranjana.controller.EmployeeController::known DB exception is raised in selectEmployeeByID Service method"+dae.getMessage());
			}
			logger.debug("com.eidiko.niranjana.EmployeeController::Controller class EmployeeControllerForSelect1 method is end");
			logger.debug("com.eidiko.niranjana.EmployeeController::Controller class is end");
			return "data selected";
	}
}


