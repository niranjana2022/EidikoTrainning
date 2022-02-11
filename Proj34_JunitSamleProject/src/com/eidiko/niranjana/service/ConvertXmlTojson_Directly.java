//Q1...Takes XML data as a HardCore inside a method and converts into JSON data.. 
package com.eidiko.niranjana.service;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
public class ConvertXmlTojson_Directly {
	
public static void main(String[] args) {

    String TEST_XML_STRING =
        "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";

        try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString();     //JSON as String format
            System.out.println(jsonPrettyPrintString);
            System.out.println();
           
            String jsonPrettyPrintString1 = xmlJSONObj.toString(1);   //JSON as looking pretty
            System.out.println(jsonPrettyPrintString1);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }
}
