package com.nt.reader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PdfBOClassReader4
{
	
	public static void main(String[] args) 
	{
		String path="C:\\Users\\Administrator\\Downloads\\data\\TableDataWithRows.pdf";
		String line="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			try {
				while((line=br.readLine())!=null)
				{
//					System.out.println(line);
//					break;
					String[] values = line.split(",");
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
