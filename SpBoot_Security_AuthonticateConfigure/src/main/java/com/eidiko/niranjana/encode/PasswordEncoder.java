package com.eidiko.niranjana.encode;  //not require for this application

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	public static void main(String[] args) {
		String s1 ="Balaram";
	BCryptPasswordEncoder password = new BCryptPasswordEncoder();
	String secure = password.encode(s1);
	System.out.println(secure);
}
}

