package com.eidiko.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Proj23SpringBootMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj23SpringBootMsEurekaServerApplication.class, args);
	}

}
