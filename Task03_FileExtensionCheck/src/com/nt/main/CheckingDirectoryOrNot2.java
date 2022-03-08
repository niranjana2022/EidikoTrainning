package com.nt.main;
import java.io.File;
import org.apache.commons.io.FilenameUtils;

public class CheckingDirectoryOrNot2 {
public static void main(String[] args) {	
			File folder = new File("C:\\Users\\Administrator\\Downloads\\Eidiko");
			
			for(File list : folder.listFiles())
			{
				if (list.isFile()) 
				{
			        System.out.println(list.getName());
			        FilenameUtils.getExtension(list.getName());
			        System.out.println( "File extension is : "+FilenameUtils.getExtension(list.getName()));
			  
			        	if( FilenameUtils.getExtension(list.getName()).equals("pdf"))
			        	{
			        		System.out.println("it is a pdf file, name is: "+list.getName());
			        		System.out.println();
			        	}
			        	else
			        	{
			        		System.out.println("it is not a pdf file, file name is: "+list.getName());
			        	}
					} 
				 else
				 {
					System.out.println("No More files");
			    	}
			}
			System.out.println();
			
			
			for(File list1 : folder.listFiles())
			{
				System.out.println(list1.getAbsolutePath());
				System.out.println(list1.getName());
				if (list1.isDirectory())
				{
					System.out.println("it is a folder, name is: "+list1.getName());
				}
				else {
					System.out.println("it is not a folder");
				}
			}
			System.out.println();
				
			
			
			
			
			
			
//			//Manually
//			String name="dummy.pdf";
//			String extension1 = FilenameUtils.getExtension(name);
//			System.out.println("File extension is : "+extension1);
//			
		

			
}

}
