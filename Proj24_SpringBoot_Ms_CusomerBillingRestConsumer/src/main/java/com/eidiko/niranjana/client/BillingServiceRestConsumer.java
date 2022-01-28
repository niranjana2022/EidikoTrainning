package com.eidiko.niranjana.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {

	@Autowired
		private DiscoveryClient client;
	
	public String BillingInfo()
	{
		//find and get ServicesInstance of producer by using Service Id
		List<ServiceInstance> listinstance = client.getInstances("BillingService_Producer");
		//use First ServiceInstance from the list of Instance
		ServiceInstance si = listinstance.get(0);
		//get producer MS URI and make it as URL
		String  url = si.getUri()+"/billing/info";
		//create RestTemplate object
		RestTemplate template = new RestTemplate();
		//invoke producer MS service method or operation by generating Http call
		String resp=template.getForObject(url,String.class);
		return resp;
		
		
		
	}
	
}
