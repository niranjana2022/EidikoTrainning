package com.eidiko.niranjana.Config;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.JdbcUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class AuthorizationSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource datasource;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		//create database connection
		.dataSource(datasource)
		//fetch eId, eName, eAddrs  using EMPLOYEE NAME nput entered in Login page
		.usersByUsernameQuery("select uid,uname,upwd,urole from usertab where uname=?")
		.authoritiesByUsernameQuery("select uname, urole from usertab where uname=?")
		//provide password encoder object reference
		.passwordEncoder(passwordEncoder);
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
//Susanta   $2a$10$O2s8rZxqYW27e0c/DEv8JOxbRmzIs.XeSYpHBXbgxxc6YeqB7CCKK

//Niranjana $2a$10$AIRigi6fQolFvlowDOmex.TnTcvKo5lkIsB/Hk/nL8kown5/UfrUW

//Balaram   $2a$10$zJ8.wB3X9npse03X7ETMb.yMDMZfdOD.zT2E0558WOsJB8ZX15t3W

//Ramahari $2a$10$AA1CZEWp6StrSz8lYGpG4esmyRIi5QnjN/DP9Aeg6H4E7VA3QIWBC

// create table usertab(uid int,uname varchar(20), upwd varchar(70), urole varchar(20));
//insert into usertab values(101,'Susanta','$2a$10$O2s8rZxqYW27e0c/DEv8JOxbRmzIs.XeSYpHBXbgxxc6YeqB7CCKK','ADMIN');
//insert into usertab values(102,'Niranjana','$2a$10$AIRigi6fQolFvlowDOmex.TnTcvKo5lkIsB/Hk/nL8kown5/UfrUW','DEVELOPER');
//insert into usertab values(103,'Balaram','$2a$10$zJ8.wB3X9npse03X7ETMb.yMDMZfdOD.zT2E0558WOsJB8ZX15t3W','EMPLOYEE');
//insert into usertab values(104,'Ramahari','$2a$10$AA1CZEWp6StrSz8lYGpG4esmyRIi5QnjN/DP9Aeg6H4E7VA3QIWBC','TRAINNING');
