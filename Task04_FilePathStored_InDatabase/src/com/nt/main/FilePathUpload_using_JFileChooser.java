package com.nt.main;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.swing.JFileChooser;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.multipdf.PDFMergerUtility;


public class FilePathUpload_using_JFileChooser
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
		//filePath stored in Database
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection		con= DriverManager.getConnection("jdbc:mysql:///projecteidiko","root","root");
			JFileChooser chooser = new JFileChooser();
			chooser.showOpenDialog(null);
			File f = chooser.getSelectedFile();
			String	fileName = f.getAbsolutePath();
			String FILEPATH_UPLOAD = "INSERT INTO FILE_UPLOAD_TAB1(FILEPATH) VALUES(?)";
			PreparedStatement p = con.prepareStatement(FILEPATH_UPLOAD);
			p.setString(1, fileName);
			p.executeUpdate();
		}
}