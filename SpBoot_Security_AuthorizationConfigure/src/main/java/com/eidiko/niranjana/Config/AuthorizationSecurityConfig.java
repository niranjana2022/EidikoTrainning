package com.eidiko.niranjana.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
@Configuration
@EnableWebSecurity
public class AuthorizationSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Susanta").password("{noop}eidiko").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("Niranjana").password("{noop}eidiko1").authorities("DEVELOPER");
		auth.inMemoryAuthentication().withUser("Balaram").password("{noop}eidiko2").authorities("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("Ramahari").password("{noop}eidiko3").authorities("TRAINNER");
		//auth.inMemoryAuthentication().withUser("Niranjana").password("$2a$10$HDUTqshU5emfcsTLCQzqTeD0g.NTql6.rXTEeZHk37sE7OeOKKttC").authorities("DEVELOPER");
	}
@Override
protected void configure(HttpSecurity http) throws Exception {
	http.authorizeHttpRequests()
	.antMatchers("/admin").permitAll()
	.antMatchers("/dev").hasAuthority("DEVELOPER")
	.antMatchers("/emp").hasAuthority("EMPLOYEE")
	.antMatchers("/trainner").hasAuthority("TRAINNER")
	//default LoginForm
	.and()
	.formLogin();
	/*
	.defaultSuccessUrl("/welcome",true)
	//Default LogoutFform
	.and()
	.logout()
	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	//exception 
	.and()
	.exceptionHandling()
	.accessDeniedPage("/denied");
	*/
	
}
}
