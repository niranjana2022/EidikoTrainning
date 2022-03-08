package com.nt.main;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class FilePathStoredClass_UsingScanner {
    private  static final String FILEPATH_UPLOAD="INSERT INTO FILE_UPLOAD_TAB(NAME,FILEPATH) VALUES(?,?)";
	public static void main(String[] args) throws SQLException, IOException {
    		Scanner sc=null;
     		String name=null,filePath=null;
     		Connection con=null;
     		Reader reader=null;
     		PreparedStatement ps=null;
     		int count=0;
        //read inputs
			sc=new Scanner(System.in);
				System.out.println("enter name::");
				name=sc.next();
				System.out.println("enter file path::");
				filePath=sc.next();
			 //connection create
			 con=DriverManager.getConnection("jdbc:mysql:///projecteidiko","root","root");	 
			 //require Reader for  character stream to read the  text file data..
				reader=new FileReader(filePath);			
				System.out.println(reader);
			//create PreparedStatement object having pre-compiled SQL query		
				ps=con.prepareStatement(FILEPATH_UPLOAD);
				//set query param vallues				
					ps.setString(1, name);
					ps.setCharacterStream(2,reader);				
				//execute the query
				  count=ps.executeUpdate();
				//process the results
				if(count==0)
					 System.out.println("Record not inserted");
				else
					System.out.println("record inserted");	
		ps.close();
		con.close();
		sc.close();
		reader.close();
	}//main
}//class


