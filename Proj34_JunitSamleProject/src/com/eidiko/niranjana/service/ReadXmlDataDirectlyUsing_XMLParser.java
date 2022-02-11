package com.eidiko.niranjana.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXmlDataDirectlyUsing_XMLParser {
	
public static void main(String[] args) throws Exception{
   
	   //1...........Get/create  the "Document Builder" from "DocumentBuilderFactory"
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    try
	    {
	      //Create DocumentBuilder with default configuration
	    	 DocumentBuilder builder = factory.newDocumentBuilder();
	       
	      //2.....get the XML document
	      Document doc = builder.parse(new File("C:\\Users\\Administrator\\Downloads\\Employee.xml"));
	      //3....Normalize the XML structure
	      doc.getDocumentElement().normalize();
	      //get all the element by tag name
	      NodeList employeelist = doc.getElementsByTagName("employee");
	      for(int i=0; i<employeelist.getLength();i++)
	      {
	    	  Node employee=employeelist.item(i);
	    	  if(employee.getNodeType()==Node.ELEMENT_NODE)
	    	  {
	    		  Element emp = (Element) employee;
	    		  System.out.println(emp.getAttribute("Id"));
	    		  NodeList employeeDetails=employee.getChildNodes();
	    		  for(int j=0; j<employeeDetails.getLength();i++)
	    	      {
	    			  Node detail=employeeDetails.item(j);
	    			  if(detail.getNodeType()==Node.ELEMENT_NODE)
	    	    	  {
	    				  Element detailElement = (Element) detail;
	    				  System.out.println("   "+detailElement.getTagName()+"   "+detailElement.getAttribute("name")+"   "+detailElement.getAttribute("title"));
	    	    	  }
	    	      }
	    	  }
	    	  
	      }
	
	    } 
	    catch (Exception e) 
	    {
	      e.printStackTrace();
	    }
	  }
	

}
