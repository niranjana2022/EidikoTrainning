package com.nt.main;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
public class MergePDF {

public static void main(String[] args) throws InvalidPasswordException, IOException {	
			File folder = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\New folder (2)");
			File[] file=folder.listFiles();PDFMergerUtility obj = new PDFMergerUtility();	
			
			for(File list : file)
			{
				if (list.isFile()) 
				{
			        if( FilenameUtils.getExtension(list.getName()).equals("pdf"))
		        	{
			        	//System.out.println(list.getName());
			        	 PDDocument document = PDDocument.load(list);
			        	 obj.setDestinationFileName("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge\\merged.pdf");
			  						obj.addSource(list);
			  						obj.mergeDocuments();
									document.close();
		        	}
			       System.out.println("END");					
			}
				}
			
				}
			
}
