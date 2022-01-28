package com.eidiko.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Proj24SpringBootMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj24SpringBootMsEurekaServerApplication.class, args);
	}

}
