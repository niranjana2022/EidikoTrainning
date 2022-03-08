package com.nt.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FilePathStoreClass {
	private  static final String QUERY="insert into filepathstore(file_ID,file_path) values(?,?)";
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException 
	{		
			int id=0;
     		 
     		
     		String   filePath=null;
     		int count=0;
		//read inputs
     		File folder = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge");
    		File[] file=folder.listFiles();	
    		for(File list : file)
    		{
    			if (list.isFile()) 
    			{
    		System.out.println("file name is :"+list.getName());
    
    		System.out.println("absolute path is : "+folder.getAbsolutePath());  		
    		//here create the reader stream for taking the character stream for file_path
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///projecteidiko","root","root");
		//Create the statement 
		PreparedStatement 	 ps =con.prepareStatement(QUERY);
		
		 //require Reader for  character stream to read the  text file data..
		Reader	reader=new FileReader(filePath);			
			System.out.println(reader);
			//set query param vallues				
			ps.setInt(1, id);
			ps.setCharacterStream(2,reader);	
		 FileOutputStream fos=new FileOutputStream(folder.getAbsolutePath().replace('\\','/') +"/"  +list.getName());
 		//System.out.println("file_ppath is:"+fos);
		
		//execute the query
			  count=ps.executeUpdate();
			//process the results
			if(count==0)
			 System.out.println("Record not inserted");
			else
				System.out.println("record inserted");
		ps.close();
		con.close();
		reader.close();
		
	}
}
	}
}
