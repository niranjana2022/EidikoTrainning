package com.eidiko.niranjana.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.eidiko.niranjana.entity.Employee;
@Component
public class TestRunner implements CommandLineRunner {
@Autowired
	private Employee emp;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(emp);

	}

}
