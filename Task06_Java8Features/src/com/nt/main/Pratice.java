package com.nt.main;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
	
		String str = "1234aba";
		//==============reverse a string================
		StringBuilder builder = new StringBuilder(str);
		builder=builder.reverse();
		System.out.println(builder);
		//==============reverse a string================
				StringBuilder builder1 = new StringBuilder();
				builder1.append(str);
				builder1.reverse();
				System.out.println(builder1);
//==============================Reverse a String==================================
				String str1 = "123fhgh456";
				char ch;
				String rev="  ";
				for(int i=0; i<str1.length();i++)
				{
					ch = str1.charAt(i);
					System.out.println(ch);
					rev=ch+rev;
					
				}
				System.out.println(rev);
//==============================================================================
				String str2 = "123fhghSD456";
				str2=str2.replaceAll("[^a-z]","");
				System.out.println(str2);
				
				String str3 = "123fhghSD456";
				str3=str3.replaceAll("[^A-Z]","");
				System.out.println(str3);
				
				String str4 = "123fhghSD456";
				str4=str4.replaceAll("[^A-Z || ^a-z]","");
				System.out.println(str4);
				
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter a number");
				String str5=scn.nextLine();
				//String str5 = "123fhghSD456";
				str5=str5.replaceAll("[^0-9]","");
				System.out.println(str5);
	}

}
