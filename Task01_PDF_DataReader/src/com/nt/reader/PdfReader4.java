package com.nt.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.nt.bo.Pdf;

public class PdfReader4 {
	public static void main(String[] args)throws  Exception {
		File file = new File("C:\\Users\\Administrator\\Downloads\\uploadFile\\TableDataWithRows.pdf");
		FileInputStream fis = new FileInputStream(file);
		PDDocument document =PDDocument.load(fis);
	
		 System.out.println(document.getPages().getCount());
		
	//To fetch data from pdf, we create PDfTextStripper class and use getText() method for read the data from given pdf file
		PDFTextStripper dataStripper = new PDFTextStripper();
		String str=dataStripper.getText(document);
	//	System.out.println(dataStripper.getText(document));
		System.out.println("hi");
		System.out.println(str);
		 document.close();
		 fis.close();

		 String line="";
			try {
				BufferedReader br = new BufferedReader(new FileReader(str));
				try {
					while((line=br.readLine())!=null)
					{
//						System.out.println(line);
//						break;
						String[] values = line.split("");
						System.out.println("Day:"+values[1]);
					}
				}
			catch(FileNotFoundException fe)
			{
				fe.printStackTrace();
			}
			}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}//close main method	 
	
}
