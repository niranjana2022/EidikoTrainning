package com.eidiko.niranjana.MyPratice;

import java.io.File;
import java.util.Scanner;

public class readFileMyPratice
{
	public static void main(String[] args) throws Exception {
		Scanner scn = new  Scanner(new File("C:\\Users\\Administrator\\Downloads\\test.txt"));
		while(scn.hasNextLine())
		{
			String output = scn.nextLine();
			System.out.println(output);
		}
	}
}