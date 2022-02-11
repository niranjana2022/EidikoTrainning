package com.eidiko.niranjana.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ConvertStringToXml {
	
	public static void main(String[] args) throws Exception{
	    
	    File f1 = new File("C:\\Users\\Administrator\\Downloads\\Employee.xml");
	    BufferedReader br = new BufferedReader(new FileReader(f1));
	    StringBuffer sb = new StringBuffer();
	    String check;
	    while((check=br.readLine())!=null)
	{ 	
		//System.out.println(check);   //get the Full XML data
	    	System.out.println(check.trim());
	    	sb.append(check);
	    	//System.out.println(sb);    //get the result in XML format
	}
	    System.out.println("hi");
	    System.out.println(check);  // get "null"
	   System.out.println(sb);
	   System.out.println();
	   
	   String s1=sb.toString();

	        try {
	            JSONObject xmlJSONObj = XML.toJSONObject(s1);
	            //String jsonPrettyPrintString = xmlJSONObj.toString();  //JSON as String format
	            String jsonPrettyPrintString = xmlJSONObj.toString(1); //JSON as looking pretty
	            System.out.println(jsonPrettyPrintString);
	        } catch (JSONException je) {
	            System.out.println(je.toString());
	        }
	

}
}
