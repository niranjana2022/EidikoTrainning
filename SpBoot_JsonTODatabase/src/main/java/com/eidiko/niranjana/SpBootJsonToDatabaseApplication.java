package com.eidiko.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.eidiko.niranjana.service.EmployeeService;

@SpringBootApplication
public class SpBootJsonToDatabaseApplication {

	public static void main(String[] args) {
	 SpringApplication.run(SpBootJsonToDatabaseApplication.class, args);
	
	}

}
