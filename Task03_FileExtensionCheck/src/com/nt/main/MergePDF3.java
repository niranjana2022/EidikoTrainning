package com.nt.main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class MergePDF3 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InvalidPasswordException, IOException {	
	
	try 
    {
        //Create a PdfReader instance.
        PdfReader pdf = new PdfReader("C:\\Users\\Administrator\\Downloads\\Eidiko\\dummy.pdf");  
   
        //Get the number of pages in pdf.
        int nbrPages = pdf.getNumberOfPages(); 
   
        //Iterate the pdf through the pages.
        for(int i=1; i <= nbrPages; i++) 
        { 
            //Extract the content of the page using PdfTextExtractor.
            String content = PdfTextExtractor.getTextFromPage(pdf, i);
   
            //Display the content of the page on the console.
            System.out.println("Content of the page : " + content);
        }
   
        //Close the PdfReader.
        pdf.close();
    
    } catch (Exception ex) {
        ex.printStackTrace();
    }
  }
}
			
