package com.nt.reader;

import java.io.File;
import java.io.FileInputStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.nt.bo.Pdf2;

public class PdfReader2 {
	public static void main(String[] args)throws  Exception {
		File file = new File("C:\\Users\\Administrator\\Downloads\\uploadFile\\TableDataWithRows.pdf");
		FileInputStream fis = new FileInputStream(file);
		PDDocument document =PDDocument.load(fis);
	
		 System.out.println(document.getPages().getCount());
		
	//To fetch data from pdf, we create PDfTextStripper class and use getText() method for read the data from given pdf file
		PDFTextStripper dataStripper = new PDFTextStripper();
		String str=dataStripper.getText(document);
		System.out.println(str);
		 document.close();
		 fis.close();
		 
		 
		 
		 
		 
//====================================================		 
		 //pass into BO object
		 Pdf2 p1 = new Pdf2(str, str, str, str, str, str, str, str);
		 System.out.print("Recommended_Grid_USD\t"); 
		 System.out.print("One_Week\t\t");
		System.out.print("One_Month\t");
		System.out.print("Two_Month\t");
		System.out.print("Three_Month\t");
		System.out.print("Six_Month\t\t");
		System.out.print("Nine_Month\t");
		System.out.println("One_Year");
	
		p1.setRecommended_Grid_USD("\tLess Than 1M\t");
		System.out.print(p1.getRecommended_Grid_USD()+"\t");
		p1.setOne_Week("0.00%");
		p1.setOne_Week("0.00%");
		
		System.out.print("\t"+p1.getOne_Week()+"\t\t");			
		p1.setOne_Month("0.05%");
		System.out.print("\t"+p1.getOne_Month()+"\t\t");						
		p1.setTwo_Month("0.08%");
		System.out.print("\t"+p1.getTwo_Month()+"\t\t");		
		p1.setThree_Month("0.10%");
		System.out.print("\t"+p1.getThree_Month()+"\t\t");				
		p1.setSix_Month("0.15%");
		System.out.print("\t"+p1.getSix_Month()+"\t");				
		p1.setNine_Month("0.15%");
		System.out.print("\t\t"+p1.getNine_Month()+"\t\t");			
		p1.setOne_Year("0.14%");
		System.out.println("\t"+p1.getOne_Year());
		//System.out.println();
//=========================================================
		 //pass into BO object
		 Pdf2 p2 = new Pdf2(str, str, str, str, str, str, str, str);
		p2.setRecommended_Grid_USD("\t1M to Less Then 10M\t");
		System.out.print(p2.getRecommended_Grid_USD()+"\t");
		p2.setOne_Week("0.00%");
		System.out.print(p2.getOne_Week()+"\t\t");			
		p2.setOne_Month("0.05%");
		System.out.print(p2.getOne_Month()+"\t\t");						
		p2.setTwo_Month("0.08%");
		System.out.print("\t"+p2.getTwo_Month()+"\t\t");		
		p2.setThree_Month("0.10%");
		System.out.print("\t"+p2.getThree_Month()+"\t\t");				
		p2.setSix_Month("0.15%");
		System.out.print("\t"+p2.getSix_Month()+"\t\t");				
		p2.setNine_Month("0.15%");
		System.out.print("\t"+p2.getNine_Month()+"\t\t");			
		p2.setOne_Year("0.14%");
		System.out.println("\t"+p2.getOne_Year());
		//System.out.println();
		//==============================================================
		 //pass into BO object
		 Pdf2 p3 = new Pdf2(str, str, str, str, str, str, str, str);
		p3.setRecommended_Grid_USD("\t10M or More\t");
		System.out.print(p3.getRecommended_Grid_USD()+"\t");
		p3.setOne_Week("0.00%");
		System.out.print("\t"+p3.getOne_Week()+"\t\t");			
		p3.setOne_Month("0.05%");
		System.out.print("\t"+p3.getOne_Month()+"\t\t");						
		p3.setTwo_Month("0.10%");
		System.out.print("\t"+p3.getTwo_Month()+"\t\t");		
		p3.setThree_Month("0.15%");
		System.out.print("\t"+p3.getThree_Month()+"\t\t");				
		p3.setSix_Month("0.28%");
		System.out.print("\t"+p3.getSix_Month()+"\t\t");				
		p3.setNine_Month("0.25%");
		System.out.print("\t"+p3.getNine_Month()+"\t\t");			
		p3.setOne_Year("0.23%");
		System.out.println("\t"+p3.getOne_Year());
		System.out.println();
	       
	    }
	
}
