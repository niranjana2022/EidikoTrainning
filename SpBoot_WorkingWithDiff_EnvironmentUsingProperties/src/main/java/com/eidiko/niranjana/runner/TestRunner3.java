package com.eidiko.niranjana.runner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("test")
public class TestRunner3 implements CommandLineRunner {

	@Value("${mail.add}")
	private String  add;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(add);

	}

}
