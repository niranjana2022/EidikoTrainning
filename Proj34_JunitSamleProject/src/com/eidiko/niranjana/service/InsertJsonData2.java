package com.eidiko.niranjana.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;
import org.json.XML;


public class InsertJsonData2 {

	public static void main(String[] args)throws Exception {
		//Creating a JSONObject object
	      JSONObject jsonObject = new JSONObject();
	      //Inserting key-value pairs into the json object
	      jsonObject.put("ID", "1");
	      jsonObject.put("First_Name", "Shikhar");
	      jsonObject.put("Last_Name", "Dhawan");
	      jsonObject.put("Date_Of_Birth", "1981-12-05");
	      jsonObject.put("Place_Of_Birth", "Delhi");
	      jsonObject.put("Country", "India");
	      try {
	         FileWriter file = new FileWriter("C:\\Users\\Administrator\\Desktop\\output.json");
	         file.write(jsonObject.toString());
	         file.close();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	      System.out.println("JSON file created: "+jsonObject.toString(1));
	   
	    
	//Read Json data line by line
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\output.json"));
    StringBuffer sb = new StringBuffer();
    String check;
    while((check=br.readLine())!=null)
    { 	
	//System.out.println(check);   //get the Full XML data
    	System.out.println(check.trim());
    	sb.append(check);              //we get Result here
    }
   
  
//  //Read Json data at a time
//	JSONObject json = new JSONObject(br);
//	String xml = XML.toString(json);
//System.out.println(xml);
  			
    
    /*
    	JSONObject json1 = JSONSerializer.toJSON( sb);  
    XMLSerializer xmlSerializer = new XMLSerializer();  
    xmlSerializer.setTypeHintsCompatibility( false );  
    String xml = xmlSerializer.write( json );  
    System.out.println(xml); 
    */
   
	}
}
		
	

