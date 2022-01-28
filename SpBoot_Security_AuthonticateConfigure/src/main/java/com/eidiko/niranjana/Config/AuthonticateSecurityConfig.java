package com.eidiko.niranjana.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class AuthonticateSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Niranjana").password("{noop}eidiko").authorities("DEVELOPER");
		//auth.inMemoryAuthentication().withUser("Niranjana").password("$2a$10$HDUTqshU5emfcsTLCQzqTeD0g.NTql6.rXTEeZHk37sE7OeOKKttC").authorities("DEVELOPER");
	}

}
