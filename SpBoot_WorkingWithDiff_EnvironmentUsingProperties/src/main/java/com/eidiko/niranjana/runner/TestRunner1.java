package com.eidiko.niranjana.runner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("dev")
public class TestRunner1 implements CommandLineRunner {

	@Value("${mail.host}")
	private String  host;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(host);

	}

}
