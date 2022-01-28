package com.eidiko.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Proj25SpringBootMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj25SpringBootMsEurekaServerApplication.class, args);
	}

}
