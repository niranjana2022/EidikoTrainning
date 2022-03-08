package com.nt.main;

import java.io.File;

public class CheckingDirectoryOrNot4 {

		
		public static void main(String[] args) {
			File checkingFile = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\Data.txt");
			System.out.println(checkingFile.exists());
			System.out.println(checkingFile.isFile());
			if(checkingFile.isFile())
			{
				System.out.println("This is a File");
			}
			else {
				System.out.println("This is not a file");
			}
			System.out.println();
			
			File checkingFile1 = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\Mashrque");
			System.out.println(checkingFile1.exists());
			System.out.println(checkingFile1.isFile());
			if(checkingFile1.isFile())
			{
				System.out.println("This is a File");
			}
			else {
				System.out.println("This is not a file");
			}
		}

}
