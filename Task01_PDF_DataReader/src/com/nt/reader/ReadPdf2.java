package com.nt.reader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
public class ReadPdf2 
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
				scnLine = new Scanner(str);
				String line="";
				
				String RecommendedGrid=null;
				String firstWeek=null;
				String firstMonth=null;
				String secondMonths=null;
				String thirdMonths=null;
				String sixMonths=null;
				String nineMonths=null;
				String firstYear=null;
				
				while (scnLine.hasNextLine()) 
				{							
					line = scnLine.nextLine().trim();					
					Scanner scnWord = new Scanner(line);		
					RecommendedGrid=scnWord.next();	
					firstWeek=scnWord.next();					
					firstMonth=scnWord.next();					
					secondMonths=scnWord.next();				
					thirdMonths=scnWord.next();					
					sixMonths=scnWord.next();
					nineMonths=scnWord.next();
					firstYear=scnWord.next();
					csvFile.println(RecommendedGrid+" "+firstWeek+" "+firstMonth+" "+secondMonths+" "+thirdMonths+" "+sixMonths+" "+nineMonths+" "+firstYear);						
				
				
					
				}
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