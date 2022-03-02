package com.eidiko.niranjana.controller;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.Employee;
@RestController
public class EmployeeController1 {

	@PostMapping("/data")
	public void DataInsertIntoExcel(@RequestBody Employee  xls)
	{
		//first create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		//then create workbook sheets
		XSSFSheet sheet=workbook.createSheet();
		//then create a rows
		XSSFRow rowhead = sheet.createRow(0);
		rowhead.createCell(0).setCellValue("EmpId");
		rowhead.createCell(0).setCellValue("EmpName");
		rowhead.createCell(0).setCellValue("EmpRole");
		rowhead.createCell(0).setCellValue("EmpSalary");
		rowhead.createCell(0).setCellValue("EmpCity");
		rowhead.createCell(0).setCellValue("EmpContact");
		//then create a rows
				XSSFRow rowhead1 = sheet.createRow(0);
				rowhead1.createCell(0).setCellValue(xls.getEmpId());
				rowhead1.createCell(0).setCellValue(xls.getEmpName());
				rowhead1.createCell(0).setCellValue(xls.getEmpRole());
				rowhead1.createCell(0).setCellValue(xls.getEmpSalary());
				rowhead1.createCell(0).setCellValue(xls.getEmpCity());
				rowhead1.createCell(0).setCellValue(xls.getEmpContact());
		//cretae a Excel file and mention location
				try {
				File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\Niranjana_WorkSpace\\SpBoot_WebConcept\\src\\main\\java\\com\\eidiko\\SpBoot_WebConcept\\xls\\TestData.xls");
				FileOutputStream fos = new FileOutputStream(file);
				workbook.write(fos);
				fos.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("Write data successfully");
		
	}
}
