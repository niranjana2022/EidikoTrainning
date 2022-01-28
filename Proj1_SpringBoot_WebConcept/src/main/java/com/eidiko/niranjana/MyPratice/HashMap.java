package com.eidiko.niranjana.MyPratice;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMap {
	public static void main(String[] args) throws Exception{

		//here we create empty workbook
        XSSFWorkbook workbook = new XSSFWorkbook();     
      //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet( "Sheet1");
        //Create row object
       XSSFRow rowhead = sheet.createRow(0);
       rowhead.createCell(0).setCellValue("empname");
       rowhead.createCell(0).setCellValue("empname");
        Row r0;
        Cell c0;
        Row r1;
        Cell c1;
        Row r2;
     //   Cell c2;
        Row r3;
      //  Cell c3;
        Row r4;
        //Cell c4;
        Row r5;
        //Cell c5;
        
        r0=sheet.createRow(0);
        c0=r0.createCell(0);
        c0.setCellValue("empId\",\"101\"");
        
        r1=sheet.createRow(1);
        c0=r1.createCell(0);
        c0.setCellValue("\"empName\",\"venkat\"");
        
        r2=sheet.createRow(2);
        c0=r1.createCell(0);
        c0.setCellValue("\"empRole\",\"Dev\"");
        
        r3=sheet.createRow(3);
        c0=r1.createCell(0);
        c0.setCellValue("\"empSal\",\"10.50\"");
        
        r4=sheet.createRow(4);
        c0=r1.createCell(0);
        c0.setCellValue("\"empCity\",\"NSK\"");
        
        r5=sheet.createRow(5);
        c0=r1.createCell(0);
        c0.setCellValue("\"empContact\",\"7873717637\"");
        
 
        /*
        r2=sheet.createRow(0);
        c0=r2.createCell(0);
        r3=sheet.createRow(0);
        c0=r3.createCell(0);
        r4=sheet.createRow(0);
        c0=r4.createCell(0);
        r5=sheet.createRow(0);
        c0=r5.createCell(0);
        */
        /*
		Map<String,String> hm = new TreeMap<String,String>();
			hm.put("empId","101");
			hm.put("empName","venkat");
			hm.put("empRole","Dev");
			hm.put("empSal","10.50");
			hm.put("empCity","NSK");
			hm.put("empContact","7873717637");
			System.out.println(hm);
			*/	
	//	Set<String> k1 = hm.keySet();
		
		File f1 = new File("C:\\Users\\Administrator\\eclipse-workspace\\Niranjana_WorkSpace\\SpBoot_WebConcept\\src\\main\\java\\com\\eidiko\\SpBoot_WebConcept\\xls\\Test.xls");
		FileOutputStream fos = new FileOutputStream(f1);
	        workbook.write(fos);
	        fos.close();
	}
}
