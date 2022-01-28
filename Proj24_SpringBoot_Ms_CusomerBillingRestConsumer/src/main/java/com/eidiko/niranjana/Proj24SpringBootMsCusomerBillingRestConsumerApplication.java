package com.eidiko.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Proj24SpringBootMsCusomerBillingRestConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj24SpringBootMsCusomerBillingRestConsumerApplication.class, args);
	}

}
