package com.eidiko.niranjana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;
import com.eidiko.niranjana.service.EmployeeMgmtService;

@SpringBootApplication
public class SpBootJdbcTEmplateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService service = null;
		ctx=SpringApplication.run(SpBootJdbcTEmplateApplication.class, args);
		//get invoke service class object
		service=ctx.getBean("empService", EmployeeMgmtService.class);
//=====================count Employee==========================
		//invoke service class method
		try {
			System.out.println("fetch Emp count:"+service.fetchEmpsCount());
		}
		
		catch(DataAccessException dae)
		{
			dae.printStackTrace();
		}
//=======================INSERT OPERATION=========================
	
		try {
			System.out.println("insert Emp:"+service.registerEmp(201,"Afnan","Dubai"));
		}
		
		catch(DataAccessException dae)
		{
			dae.printStackTrace();
		}
	
//=======================UPDATE OPERATION=========================
		
				try {
					System.out.println(service.updateEmpService(201,"Afnan9","Dubai9"));
				}
				
				catch(DataAccessException dae)
				{
					dae.printStackTrace();
				}
			
//=======================DELETE OPERATION=========================
			
				try {
					System.out.println(service.deleteEmpService(201));
				}
				
				catch(DataAccessException dae)
				{
					dae.printStackTrace();
				}
				
//====================SELECT OPERATION======================
				try {
					System.out.println(service.fetchEmpDetailsByService(102));
				}		
				catch(DataAccessException dae)
				{
					dae.printStackTrace();
				}
//====================SELECT OPERATION======================
							try {
								System.out.println(service.fetchEmpDetailsByName("Soumya"));
							}		
							catch(DataAccessException dae)
							{
								dae.printStackTrace();
							}
		//close container
		((ConfigurableApplicationContext)ctx).close();
	}
}
