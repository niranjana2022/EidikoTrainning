package com.eidiko.niranjana.MyPratice;

import java.io.FileWriter;

public class writeFileMyPratice {
	public static void main(String[] args)throws Exception
    {
        String text = "HelloWorld";
       
            FileWriter f1 = new FileWriter( "C:\\Users\\Administrator\\Downloads\\test1.txt");
            f1.write(text);
            System.out.println(text);
    }
}

