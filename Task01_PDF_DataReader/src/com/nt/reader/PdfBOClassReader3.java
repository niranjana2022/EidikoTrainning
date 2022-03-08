package com.nt.reader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PdfBOClassReader3
{
	public static void main(String[] args) 
	{
	

		BufferedReader br=null;
		try {
			String pdf="C:\\Users\\Administrator\\Downloads\\uploadFile\\TableDataWithRows.pdf";
		
			File f1 = new File(pdf);
						FileReader fr = new FileReader(f1);
						 br = new BufferedReader(fr);
						List<String> userEmailList = new ArrayList<String>();
						String line="";
							//regex to break on any ammount of spaces

							String regex = "(\\s)+";
							String[] header = line.split(regex);



//this is printing all columns, you can 

//access each column from row using the array

//indexes, example header[0], header[1], header[2]...

System.out.println(Arrays.toString(header));



//reading the rows

while((line = br.readLine()) != null) {
    String[] columns = line.split("\t");
    System.out.println("my first column : "+ columns[0] );
    System.out.println("my second column : "+ columns[1] );
    System.out.println("my third column : "+ columns[2] );
 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//close main method
}
