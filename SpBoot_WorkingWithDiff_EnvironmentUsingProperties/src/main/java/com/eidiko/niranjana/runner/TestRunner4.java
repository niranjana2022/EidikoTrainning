package com.eidiko.niranjana.runner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("uat")
public class TestRunner4 implements CommandLineRunner {

	@Value("${mail.name}")
	private String  name;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(name);

	}

}
