package com.nt.reader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ExtractDataPDF_To_CSV {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		PDDocument document = PDDocument.load(new File("C:\\Users\\Administrator\\Downloads\\data\\TableDataWithRows.pdf"));
		PDFTextStripper Tstripper = new PDFTextStripper();
		String str = Tstripper.getText(document);
		System.out.println(str);
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Downloads\\data\\TableDataWithRows.pdf"));
		String line="";
		StringBuffer sb = new StringBuffer();
		while ((line=br.readLine())!=null) 
		{					
			System.out.println(line.trim());
			sb.append(line);			
		}
		String str1 = sb.toString();
		//write data into CSV file
		FileWriter writer = new FileWriter("C:\\Users\\Administrator\\Downloads\\data\\copy.csv");
		writer.write(str);
		writer.close();
		br.close();
		
	}

}
