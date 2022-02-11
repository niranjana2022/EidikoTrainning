package com.eidiko.niranjana.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class InsertJsonData {

	public static void main(String[] args)throws Exception {
	//Insert data into Json as key value
		JSONObject jobj = new JSONObject();
		jobj.put("Name", "Rama");
		jobj.put("Address", "Kol");
		jobj.put("Branch", "C.S.E");
		jobj.put("Year", 2);
		jobj.put("Age", 27);
		jobj.put("Salary", 50000);
		System.out.println(jobj);
		System.out.println(jobj.toString(1));
		System.out.println();
	
		//Create JSON array 
		JSONArray arr = new JSONArray();
			arr.put("Niranjana");
			arr.put("susa");
			arr.put("kaha");
		System.out.println(arr);
		System.out.println();
		
	//After creating JSON array, store record inside Json obj
		jobj.put("Name", arr);
		System.out.println(jobj.toString(1));
//=======================================================================================
//================Convrt JSON data to XML=========================
	
		String str =XML.toString(jobj);
		System.out.println(str);
		
	BufferedReader br = new BufferedReader(new FileReader(str));
	String check;
	StringBuffer sb = new StringBuffer();
	while((check=br.readLine())!=null)
	{
		sb.append(check).trimToSize();
	}
	System.out.println(sb);
	String str1 = XML.toString(sb);
	System.out.println(str1);

}
		
	
}
