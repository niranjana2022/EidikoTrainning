package com.nt.main;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.multipdf.PDFMergerUtility;


public class MergePDF2
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception 
	{	
		File folder = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\New folder (2)");
		File[] file=folder.listFiles();	
		for(File list : file)
		{
			if (list.isFile()) 
			{
				if( FilenameUtils.getExtension(list.getName()).equals("pdf"))
				{
					System.out.println(list.getName());
				}
		
		String[] filepath= {"C:\\Users\\Administrator\\Downloads\\Eidiko\\New folder (2)\\dummy.pdf",
											"C:\\Users\\Administrator\\Downloads\\Eidiko\\New folder (2)\\file-sample_150kB.pdf"
											};
			mergePDF(filepath);  
			System.out.println(filepath);
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///projecteidiko","root","root");
			//Create the statement 
			PreparedStatement  ps =con.prepareStatement("insert into filePathStore(file_ID,file_path) values(?,?)");
			
			//read inputs
			Scanner scn = new Scanner(System.in);
		//	fileLocation=null;
			File fileUpload = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge");
			FileReader fileReader = new FileReader(fileUpload);
			ps.setCharacterStream(2,fileReader,(int)fileUpload.length());  
		//	fileName = f.getAbsolutePath();
		
			ps.executeUpdate();
			System.out.println(fileUpload.getAbsolutePath());
			list.getName();
			//OutputStream os = new FileOutputStream(fileUpload.getAbsolutePath().replace('\\','/') +"/" +list.getName());
			}
		}
}
public static  void mergePDF(String...filepath)throws Exception
{
	PDFMergerUtility merge = new PDFMergerUtility();
	merge.setDestinationFileName("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge\\merged.pdf");
	for(int i=0; i<filepath.length; i++)
	{
		File file = new File(filepath[i]);
		merge.addSource(file);
	}
	merge.mergeDocuments();
	System.out.println("PDF merged");
}

			
}
