package com.eidiko.niranjana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proj33SpringBootHttpRestCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj33SpringBootHttpRestCallApplication.class, args);
		
		CloseableHttpClient client =null;
		HttpPost http=null;
		StringEntity  entity=null;
		try {
					 client = HttpClients.createDefault();
					 http = new HttpPost("https://jsonplaceholder.typicode.com/posts/1");
					File file = new File("C:\\Users\\Administrator\\Downloads\\test.txt");
					BufferedReader br = new BufferedReader(new FileReader(file));	
					StringBuffer sb = new StringBuffer();
					String check;
					while((check=br.readLine())!=null)
					{
						System.out.println(check.trim());
						sb.append(check);				
					}
					System.out.println(sb);	             //null
					System.out.println("hi");  
					String result =sb.toString();
				
					System.out.println(result);
					
			//StringEntity convrt the requested data to an object and send to the server
					 entity = new StringEntity(result);
					http.setEntity(entity);
					http.setHeader("accepted", "application/json");
					http.setHeader("Content-type", "application/json"); 
					System.out.println(entity);					
			}
			catch(IOException e){
				e.printStackTrace();
			}
	//===========we get response==========
		CloseableHttpResponse response =null;
		try {
			System.out.println("Response getting");
			response=client.execute(http);
			
		//	response.getEntity().200;
			System.out.println(response.getStatusLine().getStatusCode());
			System.out.println(response.getEntity());
			client.close();
		}
		catch(IOException e)
		{
			System.out.println("hi");
			System.out.println(e.getMessage());
		}
		

		}
	
}
