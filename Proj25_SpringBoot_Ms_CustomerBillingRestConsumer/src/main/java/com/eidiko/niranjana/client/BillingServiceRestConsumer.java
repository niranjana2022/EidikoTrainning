package com.eidiko.niranjana.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	@Autowired
		private LoadBalancerClient client;
	
	public String BillingInfo()
	{
	//get Less LoadFactory serviceInstance
		ServiceInstance si = client.choose("BillingService_Poducer");
		//get producer MS URI and make it as URL
		String  url = si.getUri()+"/billing/info";
		//create RestTemplate object
		RestTemplate template = new RestTemplate();
		//invoke producer MS service method or operation by generating Http call
		String resp=template.getForObject(url,String.class);
		return resp;
	}
}
