package com.eidiko.niranjana.controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.Employee;
import com.eidiko.niranjana.entity.Excel;
import com.eidiko.niranjana.entity.Login;
import com.eidiko.niranjana.entity.Numbers;

@RestController
public class EmployeeController {
	
	@GetMapping("/")
	public String WelcomeMessage()
	{
		return "EmployeeWish";
	}
//===================================
	@GetMapping("/eidiko")
	public String WelcomeMessage2()
	{
		return "EmployeeWish2";
	}
//============================
		@PostMapping("/add")
		public Integer AdditionMesage(@RequestBody Numbers num)
		{
			return num.getA()+num.getB();
		}
	//=================================
		@PostMapping("/sub")
		public Integer SubstractionMessage(@RequestBody Numbers num)
		{
			return num.getA()-num.getB();
		}
//====================================
		@PostMapping("/mul")
		public Integer MultipleMessage(@RequestBody Numbers num)
		{
			return num.getA()*num.getB();
		}
	//=========================
		@PostMapping("/div")
		public Integer DivisionMessage(@RequestBody Numbers num)
		{
			return num.getA()/num.getB();
		}
//==================================
		@PostMapping("/login")
		public String LoginMessage(@RequestBody Login login)
		{
			String validusername = "Eidiko";
			String validpassword="2010";
			
			String username = login.getUsername();
			String password = login.getPassword();
			
			if(username.equals(validusername) && password.equals(validpassword)) {
				return "Successfully Logged in";
			}
			else {
				return "Login Error";
			}
		}
	//===========================================
			@GetMapping("/readfile")
			public String ReadFile()
			{
				String output=null;
				try {
					Scanner scn = new  Scanner(new File("C:\\Users\\Administrator\\Downloads\\test.txt"));
					while(scn.hasNextLine())
					{
						 output = scn.nextLine();				
					}
				}
				catch(FileNotFoundException fe)
				{
					fe.printStackTrace();
				}
				return output;
			}
//===============================================================		
			@PostMapping("/writefile")
			public void WriteFile( @RequestBody Employee emp)
			{					
				try {
	            FileWriter f1 = new FileWriter("C://Users//Administrator//Downloads//test1.txt");
	           f1.write(emp.toString());
	           // f1.write(new ObjectMapper().writeValueAsString(emp));
	            f1.close();
				}
				catch(Exception  fe)
				{
					fe.printStackTrace();
				}
			}
//===========================================
			@PostMapping("/excelData")
			public void DataInsertIntoExcel( @RequestBody Excel xls)
			{					
				//here we create empty workbook
		        XSSFWorkbook workbook = new XSSFWorkbook();     
		      //Create a blank sheet
		        XSSFSheet sheet = workbook.createSheet( "Sheet1");
		        //Create row object
		        XSSFRow rowhead = sheet.createRow(0);
		        rowhead.createCell(0).setCellValue("EmpId");
			    rowhead.createCell(1).setCellValue("EmpName");
			    rowhead.createCell(2).setCellValue("EmpRole");
			     rowhead.createCell(3).setCellValue("EmpSalary");
			     rowhead.createCell(4).setCellValue("EmpCity");
			     rowhead.createCell(5).setCellValue("EmpContact");
		       XSSFRow rowhead1 = sheet.createRow(1);
		       rowhead1.createCell(0).setCellValue(xls.getEmpId());
		       rowhead1.createCell(1).setCellValue(xls.getEmpName());
		       rowhead1.createCell(2).setCellValue(xls.getEmpRole());
		       rowhead1.createCell(3).setCellValue(xls.getEmpSalary());
		       rowhead1.createCell(4).setCellValue(xls.getEmpCity());
		       rowhead1.createCell(5).setCellValue(xls.getEmpContact());
		   
		       try {
		       File f1 = new File("C:\\Users\\Administrator\\eclipse-workspace\\Niranjana_WorkSpace\\SpBoot_WebConcept\\src\\main\\java\\com\\eidiko\\SpBoot_WebConcept\\xls\\TestData.xls");
				FileOutputStream fos = new FileOutputStream(f1);
			        workbook.write(fos);
			        fos.close();
		       }
		       catch(Exception e)
		       {
		    	   e.printStackTrace();
		       }
		       System.out.println("ok...Done");
			}
}
