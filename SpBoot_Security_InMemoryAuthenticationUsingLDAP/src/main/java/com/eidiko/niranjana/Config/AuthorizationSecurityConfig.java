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
		auth.ldapAuthentication().contextSource().url("ldap://localhost:10389/o=eidiko")//connecting to LDAP server
		.managerDn("uid=admin,ou=system").managerPassword("secret")  //super user authontication
		.and().userSearchBase("ou=users").userSearchFilter("(cn={0})")  //our Authentication like our user data through his common name
		.groupSearchBase("ou=roles").groupSearchFilter("(uniqueMember={0})")
		.groupRoleAttribute("cn").rolePrefix("ROLE_");  //for Authorization
		
	}
@Override
protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
	.antMatchers("/admin").permitAll() //No Authentication and No Authorization
	.antMatchers("/dev").hasRole("CUSTOMER")  //hasRole= Authentication+Authorization
	.antMatchers("/emp").hasAnyRole("CUSTOMER","MANAGER")//hasRole= Authentication+Authorization
	.antMatchers("/trainner").hasRole("MANAGER")//hasRole= Authentication+Authorization
	 .anyRequest().authenticated()  //remaing all requests url mus be authtenticated
	//default LoginForm
	.and()
	.formLogin()
	
	
	//Default LogoutFform
	.and()
	.logout()
	.logoutRequestMatcher(new AntPathRequestMatcher("/signout"))
	
	//exception 
	.and()
	.exceptionHandling()
	.accessDeniedPage("/denied");
}
}
