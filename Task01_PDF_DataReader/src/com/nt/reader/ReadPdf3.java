package com.nt.reader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
public class ReadPdf3 
{
	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException 
	{
		try
		{
			
			
			PrintWriter csvFile = new PrintWriter("C:\\Users\\Administrator\\Downloads\\data\\extract1.csv");
			
			PDDocument document = PDDocument.load(new File("C:\\Users\\Administrator\\Downloads\\data\\TableDataWithRows.pdf"));// here TableDataWithRows.pdf is the name of pdf file which we want to read....
			document.getClass();
			if (!document.isEncrypted())
			{
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);
				PDFTextStripper Tstripper = new PDFTextStripper();
				String str = Tstripper.getText(document);
				System.out.println(str);
				Scanner scnLine = null;			
				BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Downloads\\data\\TableDataWithRows.pdf"));
			//	scnLine = new Scanner(str);
				String line="";
				
				StringBuffer RecommendedGrid=null;
				StringBuffer firstWeek=null;
				StringBuffer firstMonth=null;
				StringBuffer secondMonths=null;
				StringBuffer thirdMonths=null;
				StringBuffer sixMonths=null;
				StringBuffer nineMonths=null;
				StringBuffer firstYear=null;
				StringBuffer sb = new StringBuffer();
				while ((line=br.readLine())!=null) 
				{					
					System.out.println(line.trim());
					sb.append(line);			
				}
					//Scanner scnWord = new Scanner(line);		
//					RecommendedGrid=sb.append(line);	
//					firstWeek=sb.append(line);			
//					firstMonth=sb.append(line);					
//					secondMonths=sb.append(line);					
//					thirdMonths=sb.append(line);				
//					sixMonths=sb.append(line);	
//					nineMonths=sb.append(line);	
//					firstYear=sb.append(line);	
//					csvFile.println(RecommendedGrid+" "+firstWeek+" "+firstMonth+" "+secondMonths+" "+thirdMonths+" "+sixMonths+" "+nineMonths+" "+firstYear);	
				
					
				}	
			
			document.close();
	
			csvFile.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}			
	}
}