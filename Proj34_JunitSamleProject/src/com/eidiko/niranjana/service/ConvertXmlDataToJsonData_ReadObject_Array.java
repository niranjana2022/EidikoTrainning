//Read XML data from xml file and display as Xml Attribute format then  Convert that xml data  to JSON object...
package com.eidiko.niranjana.service;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
public class ConvertXmlDataToJsonData_ReadObject_Array {
	
public static void main(String[] args) throws Exception{
    File f1 = new File("C:\\Users\\Administrator\\Desktop\\Customers1.xml");
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
            System.out.println(jsonPrettyPrintString);		//JSON as Normal form , we get All
            System.out.println();
            JSONObject Jobject = xmlJSONObj.getJSONObject("Customers"); 					
           System.out.println(Jobject);   							//JSON as Normal form, onwards Customers object
            System.out.println();
            System.out.println(Jobject.toString(1));
            System.out.println();
            
           JSONArray Jarr =Jobject.getJSONArray("Customer");
          System.out.println(Jarr);
          System.out.println();
         JSONObject req2 = Jarr.getJSONObject(2); 
         System.out.println(req2);
         System.out.println();
 //iterate for getting JSON object    
         for (int i = 0; i < Jarr.length(); i++) 
         {
             // store each object in JSONObject  
             JSONObject explrObject = Jarr.getJSONObject(i);  
               
             // get field value from JSONObject using get() method  
             System.out.println(explrObject.get("FirstName"));  
         }      
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
}

}
      //==========================================================
       
        	
        
  
/*
 * JSONObject req = new JSONObject(join(loadStrings(data.json),"")); JSONObject
 * locs = req.getJSONObject("locations"); JSONArray recs =
 * locs.getJSONArray("record");
 */