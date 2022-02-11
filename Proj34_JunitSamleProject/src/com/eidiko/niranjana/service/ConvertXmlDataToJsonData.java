//Read XML data from xml file and display as Xml Attribute format then  Convert that xml data  to JSON object...
package com.eidiko.niranjana.service;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
public class ConvertXmlDataToJsonData {
	
public static void main(String[] args) throws Exception{
    File f1 = new File("C:\\Users\\Administrator\\Desktop\\xmlSample.xml");
    BufferedReader br = new BufferedReader(new FileReader(f1));
    StringBuffer sb = new StringBuffer();
    String check;
  //Read XML data from xml-file line by line and display
    while((check=br.readLine())!=null)
    { 	
    	System.out.println(check.trim());
    	sb.append(check); 					//get the result in XML  Attribute format
    	//System.out.println(sb);    //get the result in XML  Attribute format
    }
    System.out.println("hi");
   System.out.println(sb);  //XML as Normal form
   System.out.println();
   String s1=sb.toString();
   System.out.println(s1);	 //XML as Normal form
   System.out.println();
//After Reading XML data , we must convert it to JSON object
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(s1); //JSONObject always takes String type..So we convert SB to String
            String jsonPrettyPrintString = xmlJSONObj.toString();  		
            System.out.println(jsonPrettyPrintString.toString());
            System.out.println();
            JSONObject Jobject = xmlJSONObj.getJSONObject("note"); 					
           System.out.println(Jobject);   							//JSON as Normal form
            System.out.println();
            System.out.println(Jobject.toString(1));
            System.out.println();
        }
        catch (JSONException je) 
        {
        		System.out.println(je.toString());
        }
}
}
