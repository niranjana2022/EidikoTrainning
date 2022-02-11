package com.eidiko.niranjana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.XML;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Proj32SpringBootHttpRestCallHttpGetApplicationTests {

	@Test
	void contextLoads() {
		CloseableHttpClient client=null;
		HttpGet http=null;
		try {
	 client = HttpClients.createDefault();
			  http = new HttpGet("https://jsonplaceholder.typicode.com/posts/1");
			  http.addHeader("Content-type", "application/json"); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try {
			CloseableHttpResponse response=client.execute(http);
			 //verify the valid error code first
		    int statusCode = response.getStatusLine().getStatusCode();
			http.addHeader("Content-type", "application/json"); //charset=utf-8");
			System.out.println("Now result");
			System.out.println(response.getEntity());
		/*
			if (statusCode != 200) 
		    {
		      throw new RuntimeException("Failed with HTTP error code : " + statusCode);
		    }
		    */
			//Assertions.assertEquals(response.getEntity(),200);
			//Now pull back the response object
		    HttpEntity httpEntity = response.getEntity();
		    String result = EntityUtils.toString(httpEntity);
		  //Lets see what we got from API
		    System.out.println(result);
		    System.out.println(response.getEntity());
	String expected="{\n"
			+ "  \"userId\": 1,\n"
			+ "  \"id\": 1,\n"
			+ "  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n"
			+ "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n"
			+ "}";
	assertEquals(expected, result);
	
		}
		catch(Exception e)
		{
		e.printStackTrace();					
		}
		
	
		
	}

}
